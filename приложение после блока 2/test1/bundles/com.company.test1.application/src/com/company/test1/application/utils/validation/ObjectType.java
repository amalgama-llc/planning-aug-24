package com.company.test1.application.utils.validation;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.company.test1.application.utils.TreeElementType;
import com.company.test1.application.states.AppData;
import com.company.test1.datamodel.DatamodelPackage;


public enum ObjectType {
	
	SCENARIO	(TreeElementType.SCENARIO, AppData.messages.obj_SCENARIO,  DatamodelPackage.Literals.SCENARIO,
			FieldDescriptor.of(DatamodelPackage.Literals.SCENARIO__NAME,	AppData.messages.obj_SCENARIO_col_NAME,	AppData.messages.obj_SCENARIO_col_NAME_excel),
			FieldDescriptor.of(DatamodelPackage.Literals.SCENARIO__BEGIN_DATE,	AppData.messages.obj_SCENARIO_col_BEGIN_DATE,	AppData.messages.obj_SCENARIO_col_BEGIN_DATE_excel),
			FieldDescriptor.of(DatamodelPackage.Literals.SCENARIO__END_DATE,	AppData.messages.obj_SCENARIO_col_END_DATE,	AppData.messages.obj_SCENARIO_col_END_DATE_excel)
				)
	;
	
	
	private final String name;
	private final EClass eClass;
	private final TreeElementType treeElementType;
	private final Map<EStructuralFeature, FieldDescriptor> fieldDescriptors;
	
	private final String partID;
	
	private ObjectType(TreeElementType treeElementType, String name,  EClass eClass, FieldDescriptor...fieldDescriptors) {
		this.name = name;
		this.treeElementType = treeElementType;
		this.eClass = eClass;
		this.fieldDescriptors = Arrays.stream(fieldDescriptors).collect(Collectors.toMap(FieldDescriptor::getStructuralFeature, Function.identity()));
		this.partID = null;
	}
	
	public String getName() {
		return name;
	}
	
	public TreeElementType getTreeElementType() {
		return treeElementType;
	}

	public Collection<EStructuralFeature> getFeatures() {
		return fieldDescriptors.keySet();
	}
	
	public String getFeatureName(EStructuralFeature structuralFeature) {
		FieldDescriptor fd = fieldDescriptors.get(structuralFeature);
		if (fd != null) {
			return fd.getColumnName();
		}
		return "";
	}
	
	public String getColumnNameExcel(EStructuralFeature structuralFeature) {
		FieldDescriptor fd = fieldDescriptors.get(structuralFeature);
		if (fd != null) {
			return fd.getColumnNameExcel();
		}
		return "";
	}
	
	public EClass getEClass() {
		return eClass;
	}
	
	public String getPartID() {
		return partID;
	}
	
	public static ObjectType objectTypeByObject(Object object) {
		if (object instanceof EObject) {
			EClass eclass = ((EObject) object).eClass();
			for (ObjectType type : values()) {
				if (type.eClass.equals(eclass)) {
					return type;
				}
			}
		}
		return null;
	}
	
}





class FieldDescriptor {
	private final EStructuralFeature structuralFeature;
	private final String columnName;
	private final String columnNameExcel;
	
	private FieldDescriptor(EStructuralFeature structuralFeature, String columnName, String columnNameExcel) {
		this.structuralFeature = structuralFeature;
		this.columnName = columnName;
		this.columnNameExcel = columnNameExcel;
	}
	
	public static FieldDescriptor of(EStructuralFeature structuralFeature, String columnName, String columnNameExcel) {
		return new FieldDescriptor(structuralFeature, columnName, columnNameExcel);
	}
	
	public EStructuralFeature getStructuralFeature() {
		return this.structuralFeature;
	}
	
	public String getColumnName() {
		return this.columnName;
	}
	
	public String getColumnNameExcel() {
		return this.columnNameExcel;
	}
	
}
