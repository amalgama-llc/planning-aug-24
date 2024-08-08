package com.company.test1.application.utils;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.emf.databinding.EMFProperties;

import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Operation;
import com.company.test1.datamodel.Product;
import com.company.test1.datamodel.Scenario;
import com.company.test1.datamodel.WorkCenter;

public final class DataBinding {
	
	private static DataBinding instance;
	
	protected IEventBroker eventBroker;

	@SuppressWarnings("all")
	public IObservableValue<Scenario> scenarioObservable = new WritableValue<>();
	@SuppressWarnings("all")
	public IObservableList<WorkCenter> workCentersObservable = EMFProperties.list(DatamodelPackage.Literals.SCENARIO__WORK_CENTERS).observeDetail(scenarioObservable);
	@SuppressWarnings("all")
	public IObservableList<Operation> operationsObservable = EMFProperties.list(DatamodelPackage.Literals.SCENARIO__OPERATIONS).observeDetail(scenarioObservable);
	@SuppressWarnings("all")
	public IObservableList<Product> productsObservable = EMFProperties.list(DatamodelPackage.Literals.SCENARIO__PRODUCTS).observeDetail(scenarioObservable);

	private DataBinding(IEventBroker eventBroker) {
		this.eventBroker = eventBroker;
		init();
	}
	
	public static DataBinding getInstance(IEventBroker eventBroker) {
		if (instance == null) {
			instance = new DataBinding(eventBroker);
		}
		return instance;
	}
	
	public void init() {
		eventBroker.subscribe(Topics.NEW_SCENARIO,
				event -> addScenario((Scenario) event.getProperty(IEventBroker.DATA)));
	}

	private void addScenario(Scenario scenario) {
		scenarioObservable.setValue(scenario);
	}
}
