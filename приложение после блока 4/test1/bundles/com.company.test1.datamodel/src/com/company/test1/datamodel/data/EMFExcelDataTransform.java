package com.company.test1.datamodel.data;

import com.amalgamasimulation.calendardatamodel.CalendardatamodelPackage;
import com.amalgamasimulation.ecoreutils.EcoreutilsPackage;
import com.amalgamasimulation.emf.excel.EMFExcelTransform;
import com.amalgamasimulation.randomdatamodel.RandomdatamodelPackage;
import com.amalgamasimulation.timeseriesdatamodel.TimeseriesdatamodelPackage;
import com.company.test1.datamodel.DatamodelPackage;
import com.company.test1.datamodel.Scenario;

public class EMFExcelDataTransform {
	
	public static EMFExcelTransform<Scenario> emfExcelTransform = new EMFExcelTransform<Scenario>().setRootClass(DatamodelPackage.eINSTANCE.getScenario())
					.addPackage(EcoreutilsPackage.eINSTANCE)
					//.addPackage(CalendardatamodelPackage.eINSTANCE)
					//.addPackage(RandomdatamodelPackage.eINSTANCE)
					//.addPackage(TimeseriesdatamodelPackage.eINSTANCE);
					//.setCustomSheetName(DatamodelPackage.Literals.EQUIPMENT_UNAVAILABILITY_ASSIGNMENT, "UnavailabilityAssignment")
					;
}
