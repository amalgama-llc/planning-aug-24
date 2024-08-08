package com.company.test1.application.parts.editor;

import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.core.services.nls.Translation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.company.test1.application.pages.OperationPage;
import com.company.test1.application.pages.PerformanceRecordPage;
import com.company.test1.application.pages.ProductOperationsPage;
import com.company.test1.application.pages.ProductPage;
import com.company.test1.application.pages.ProductionPlanRecordPage;
import com.company.test1.application.pages.ScenarioPage;
import com.company.test1.application.pages.WorkCenterPage;
import com.company.test1.application.localization.Messages;
import com.amalgamasimulation.desktop.properties.PropertyPart;

public class PropertiesPart extends PropertyPart {

	@Inject
	@Translation
	private Messages messages;
	
	@Override
	protected boolean isPartVisible() {
		return true;
	}

	@Override
	public void setPartVisible(boolean visible) {
	}
	
	@Override
	protected void setLabeledSelectedObject(IObservableValue<EObject> labeledSelectedObject, Object selectedObject) {
	}

	@Override
	protected boolean isAlternativeTitle() {
		return true;
	}

	@Override
	protected EStructuralFeature getLabeledField() {
		return null;
	}

	@Override
	protected void registerPages() {
		registerPage(new ScenarioPage (messages), messages.tab_general);
		registerPage(new WorkCenterPage(messages), messages.tab_general);
		registerPage(new OperationPage(messages), messages.tab_general);
		registerPage(new ProductPage(messages), messages.tab_general);
		registerPage(new ProductOperationsPage(messages), messages.obj_OPERATIONS);
		registerPage(new ProductionPlanRecordPage(messages), messages.tab_general);
		registerPage(new PerformanceRecordPage(messages), messages.tab_general);
	}
	
	@Override
	protected String getPropertyTypeTitle(Object selectedObject) {
		return "";
	}
	
	@Override
	protected void changePropertyPerspective(Object selectedObject) {
		
	}
	
	@PreDestroy
	public void preDestroy() {
		eventBroker.unsubscribe(propertyPerspectiveChangedEventHandler);
		eventBroker.unsubscribe(propertySelectionChangedEventHandler);
	}
}
