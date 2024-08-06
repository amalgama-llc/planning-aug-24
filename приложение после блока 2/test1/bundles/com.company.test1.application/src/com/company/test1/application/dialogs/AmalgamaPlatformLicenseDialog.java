package com.company.test1.application.dialogs;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.time.format.DateTimeFormatter;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.amalgamasimulation.license.AmalgamaLicenseStatus;
import com.amalgamasimulation.license.AmalgamaPlatformLicenseChecker;
import com.amalgamasimulation.license.ComputerIDProvider;

public class AmalgamaPlatformLicenseDialog extends TitleAreaDialog {
	
	private static final String REQUEST_LICENSE_DIALOG_LABEL = "Amalgama Platform License";
	private static final String REQUEST_LICENSE_DIALOG_TITLE = "Amalgama Platform";
	
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE;

	private static final String MESSAGE_STATUS_PLATFORM_VIRTUAL = """
								You have a permanent license for a product based on Amalgama Platform.
								This allows you to use Amalgama Platform.
								""";
	private static final String MESSAGE_STATUS_PLATFORM_PERMANENT = """
								You have a permanent license for Amalgama Platform.
								Your license key is: %s
								""";
	private static final String MESSAGE_STATUS_OTHER_PERMANENT = """ 
								You have a permanent license for Amalgama product '%s'
								based on Amalgama Platform.
								This allows you to use Amalgama Platform.
								""";
	private static final String MESSAGE_STATUS_PLATFORM_TRIAL_ACTIVE = "You have a trial license for Amalgama Platform, valid till %s.";
	private static final String MESSAGE_STATUS_OTHER_TRIAL_ACTIVE = """
								You have a trial license for product '%s', valid till %s.
								This allows you to use Amalgama Platform.
								""";
	private static final String MESSAGE_STATUS_PLATFORM_TRIAL_EXPIRED = "Your trial license for Amalgama Platform has expired.";
	private static final String MESSAGE_STATUS_NO_LICENSE = "No license for Amalgama Platform has been found";
	private static final String MESSAGE_INTERNET_CONNECTION_ERROR = """
				The connection to the Amalgama license server could not be established.
				Amalgama Platform requires either a valid local license file (not found)
				or a trial license (stored on the Amalgama license server).
				Internet connection is only used for license file retrieval and
				license checking by computer ID.
				No personal data is sent.
				""";
	
	private static final String LABEL_COMPUTER_ID = "Computer ID";
	public static final Image ICON_LABEL = new Image(Display.getCurrent(), getInputStream("/icons/amalgamaIcon.png"));
	
	private AmalgamaLicenseStatus amalgamaLicenseStatus;
	private Label errorLabel;
	private Label messageLabel;

	public AmalgamaPlatformLicenseDialog() {
		super(new Shell(SWT.APPLICATION_MODAL));
		this.amalgamaLicenseStatus = new AmalgamaPlatformLicenseChecker().getLicenseStatus();
	}
	
	@Override
	public void create() {		
		super.create();
		getShell().setImage(ICON_LABEL);		
		setTitle(REQUEST_LICENSE_DIALOG_TITLE);
		getShell().setSize(500, 300);
		getShell().setText(REQUEST_LICENSE_DIALOG_LABEL);
		getButton(IDialogConstants.OK_ID).setFocus();		
		// Show the window in the center of the current desktop
		Monitor primary = Display.getCurrent().getPrimaryMonitor();
		Rectangle bounds = primary.getBounds();
		Rectangle rect = getShell().getBounds();
		int x = bounds.x + (bounds.width - rect.width) / 2;
		int y = bounds.y + (bounds.height - rect.height) / 2;
		getShell().setLocation(x, y);
		getShell().pack();
	}
	
	
	@Override
	protected Control createDialogArea(Composite parent) {	
		Composite area = (Composite) super.createDialogArea(parent);
		Composite comParent = new Composite(area, SWT.NONE);	
		GridLayout formLayout = new GridLayout(2, false);
		formLayout.marginWidth = 10;
		formLayout.marginHeight = 10;
		comParent.setLayout(formLayout);
		
		comParent.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		
		createLabel(comParent, LABEL_COMPUTER_ID, 1, 120);
		createText(comParent, ComputerIDProvider.getComputerID());
		messageLabel = createLabel(comParent, getMessageStatus(), 2, 500);
		
		errorLabel = createLabel(comParent, "", 2, 500);
		errorLabel.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_DARK_RED));
		return comParent;
	}
	
	private String getMessageStatus() {
		return switch (amalgamaLicenseStatus.getStatus()) {
			case STATUS_NO_LICENSE -> MESSAGE_STATUS_NO_LICENSE;
			case STATUS_PLATFORM_TRIAL_EXPIRED -> MESSAGE_STATUS_PLATFORM_TRIAL_EXPIRED;
			case STATUS_OTHER_TRIAL_ACTIVE -> getMessageOtherTrialActive(amalgamaLicenseStatus);
			case STATUS_PLATFORM_TRIAL_ACTIVE -> MESSAGE_STATUS_PLATFORM_TRIAL_ACTIVE.formatted(amalgamaLicenseStatus.getLicenseExpirationDate().format(FORMATTER));
			case STATUS_OTHER_PERMANENT -> MESSAGE_STATUS_OTHER_PERMANENT.formatted(amalgamaLicenseStatus.getProduct());
			case STATUS_PLATFORM_PERMANENT -> getMessagePlatformPermanent(amalgamaLicenseStatus);
			case STATUS_INTERNET_CONNECTION_ERROR -> MESSAGE_INTERNET_CONNECTION_ERROR;
		};
	}
	
	private String getMessageOtherTrialActive(AmalgamaLicenseStatus amalgamaLicenseStatus) {
		return MESSAGE_STATUS_OTHER_TRIAL_ACTIVE.formatted(
				amalgamaLicenseStatus.getProduct(),
				amalgamaLicenseStatus.getLicenseExpirationDate() == null ? "∞" : amalgamaLicenseStatus.getLicenseExpirationDate().format(FORMATTER));
	}
	
	private String getMessagePlatformPermanent(AmalgamaLicenseStatus amalgamaLicenseStatus) {
		String licenseKey = amalgamaLicenseStatus.getKey();
		if (licenseKey != null && !licenseKey.isEmpty()) {
			return MESSAGE_STATUS_PLATFORM_PERMANENT.formatted(licenseKey);
		}
		// "virtual" platform license: does not exist as a contact license, but is given to the user "on-the-fly"
		// since there is another permanent license for some other product
		return MESSAGE_STATUS_PLATFORM_VIRTUAL;
	}
	
	private static InputStream getInputStream(String filePath) {
		InputStream io = AmalgamaPlatformLicenseDialog.class.getResourceAsStream(filePath);
		if (io == null) {
			throw new RuntimeException("Resource not found: " + filePath);
		} else {
			return new BufferedInputStream(io);
		}
	}
	
	private void update() {
		this.amalgamaLicenseStatus = new AmalgamaPlatformLicenseChecker().getLicenseStatus();
		messageLabel.setText(getMessageStatus());
		showError("");
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		((GridLayout)parent.getLayout()).makeColumnsEqualWidth = false;
	}
	
	private void showError(String errorText) {
		if (errorText == null || errorText.isEmpty()) {
			errorLabel.setVisible(false);
			return;
		}
		errorLabel.setVisible(true);
		errorLabel.setText(errorText);
	}
	
	@Override
	protected boolean isResizable() {
		return false;
	}

	private  Label createLabel(Composite parent, String text, int countColumns, int minWidth) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(text);
		label.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		GridData gridData = new GridData(SWT.LEFT, SWT.CENTER, true, true, countColumns, 1);
		gridData.minimumWidth = minWidth;
		label.setLayoutData(gridData);
		return label;
	}
	
	private Text createText(Composite parent, String text) {
		Text name = new Text(parent, SWT.BORDER);
		name.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		name.setText(text);
		name.setTouchEnabled(false);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gridData.minimumWidth = 380;
		
		name.setLayoutData(gridData);
		name.setEditable(false);
		return name;
	}
}
