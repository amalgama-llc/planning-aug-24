package com.company.test1.application.utils;

import org.eclipse.swt.graphics.Image;

import com.company.test1.application.states.AppData;

public enum TreeElementType {
	SCENARIO("/icons/product_structure.png", AppData.messages.obj_SCENARIO),
	WORK_CENTER(IconsMapping.WORK_CENTER, AppData.messages.obj_WORK_CENTERS),
	OPERATION(IconsMapping.OPERATION, AppData.messages.obj_OPERATIONS),
	PRODUCT(IconsMapping.PRODUCT, AppData.messages.obj_PRODUCTS),
	PRODUCTION_PLAN(IconsMapping.PRODUCTION_PLAN, AppData.messages.obj_PRODUCTION_PLAN),
	PERFORMANCE_RECORD(IconsMapping.PERFORMANCE_RECORD, AppData.messages.obj_PERFORMANCE_RECORDS);
	
	private final Image icon;
	private final String label;
	
	TreeElementType(Image icon, String label) {
		this.icon = icon;
		this.label = label;
	}
	
	TreeElementType(String iconPath, String label) {
		this(IconsMapping.getImage(iconPath), label);
	}

	public Image getIcon() {
		return icon;
	}

	public String getLabel() {
		return label;
	}			
	
}
	
