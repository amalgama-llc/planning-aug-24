package com.company.test1.application.pages;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.SelectionEvent;

import com.amalgamasimulation.desktop.properties.sections.TableSection;
import com.amalgamasimulation.desktop.ui.dialogs.SelectObjectDialog;
import com.amalgamasimulation.desktop.ui.views.TableView;
import com.amalgamasimulation.emf.commands.CommandsManager;
import com.company.test1.application.localization.Messages;
import com.company.test1.application.utils.IconsMapping;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.Product;

public class ProductOperationsPage extends AbstractPage<Product> {
	
	@SuppressWarnings("unchecked")
	public IObservableList<Operation> observableSections = 
			EMFProperties.list(DatamodelPackage.Literals.PRODUCT__OPERATIONS).observeDetail(observable);
	
	private TableView<Operation> tableView;
	
	public ProductOperationsPage(Messages messages) {
		super(messages, null);
	}

	@Override
	public boolean isVisible(Object selectedObject) {
		return selectedObject instanceof Product;
	}
	
	@Override
	protected String getNameClassObject() {
		return messages.obj_PRODUCT;
	}
	
	@Override
	protected String getObjectDisplayName() {
		return observable.getValue().getName();
	}
	
	@Override
	protected FeaturePath[] getUpdateListeners() {
		return new FeaturePath [] {
				FeaturePath.fromList(DatamodelPackage.Literals.PRODUCT__OPERATIONS),
				FeaturePath.fromList(DatamodelPackage.Literals.OPERATION__NAME)};
	}

	@Override
	protected void createControlsInternal() {
		TableSection<Product, Operation> tableSection = addTableSection(observableSections, 
				DatamodelPackage.Literals.OPERATION__NAME)
				.addButton("", IconsMapping.ADD, 24, this::handleAdd)
				.addButton("", IconsMapping.REMOVE, 24, this::handleRemove)
				.addButton("", IconsMapping.UP, 24, this::handleMoveUpButton)
				.addButton("", IconsMapping.DOWN, 24, this::handleMoveDownButton);
		tableView = tableSection.getTableView();
		tableView.addColumn(messages.obj_OPERATION_col_NAME, 200, op -> op)
			.setLabelExtractorNullable(obj -> obj.getName());
	}
	
	private void handleAdd(SelectionEvent e) {
		SelectObjectDialog<Operation> d = new SelectObjectDialog<>(parent.getShell(), dataBinding.operationsObservable,
				"Select an operation", tw -> {
					tw.addColumn(messages.obj_OPERATION, 300, p -> p).setLabelExtractorNullable(Operation::getName);
					tw.setFilters(new ViewerFilter() {
						@Override
						public boolean select(Viewer viewer, Object parentElement, Object element) {
							return !observable.getValue().getOperations().contains(element);
						}
					});
				});
		if (d.open() == Window.OK) {
			Operation value = d.getSelectedObject();
			if (value != null) {
				CommandsManager.getEditingDomain().getCommandStack()
						.execute(AddCommand.create(CommandsManager.getEditingDomain(), observable.getValue(),
								DatamodelPackage.Literals.PRODUCT__OPERATIONS, value));
			}
		}
	}

	private void handleRemove(SelectionEvent e) {
		Object element = tableView.getStructuredSelection().getFirstElement();
		if (element instanceof Operation operation) {
			CommandsManager.getEditingDomain().getCommandStack()
			.execute(RemoveCommand.create(CommandsManager.getEditingDomain(), observable.getValue(),
					DatamodelPackage.Literals.PRODUCT__OPERATIONS, operation));
		}
	}

	private void handleMoveUpButton(SelectionEvent e) {
		Object step = ((IStructuredSelection) tableView.getSelection()).getFirstElement();
		if (observable.getValue() != null) {
			int sourceIndex = observable.getValue().getOperations().indexOf(step);
			CommandsManager.getEditingDomain().getCommandStack()
					.execute(MoveCommand.create(CommandsManager.getEditingDomain(), observable.getValue(),
							DatamodelPackage.Literals.PRODUCT__OPERATIONS, sourceIndex, sourceIndex - 1));
		}
	}

	private void handleMoveDownButton(SelectionEvent e) {
		Object step = ((IStructuredSelection) tableView.getSelection()).getFirstElement();
		if (observable.getValue() != null) {
			int sourceIndex = observable.getValue().getOperations().indexOf(step);
			CommandsManager.getEditingDomain().getCommandStack()
					.execute(MoveCommand.create(CommandsManager.getEditingDomain(), observable.getValue(),
							DatamodelPackage.Literals.PRODUCT__OPERATIONS, sourceIndex, sourceIndex + 1));
		}
	}
}
