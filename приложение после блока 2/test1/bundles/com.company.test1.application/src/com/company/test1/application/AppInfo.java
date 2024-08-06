package com.company.test1.application;


import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.swt.graphics.Image;

import com.amalgamasimulation.desktop.utils.IAppInfo;
import com.company.test1.application.utils.IconsMapping;

import jakarta.inject.Singleton;

@Singleton
@Creatable
public class AppInfo extends IAppInfo {
	

	@Override
	public String getProductID() {
		return "test1";
	}

	@Override
	public String getFullProductName() {
		return "test1";
	}

	@Override
	public String getAppVendorSiteUrl() {
		return "www.amalgamasimulation.com";
	}

	@Override
	public String getAppVendorEmail() {
		return "info@amalgamasimulation.com";
	}

	@Override
	public String getAppVendorName() {
		return "Amalgama LLC";
	}

	@Override
	public Image getApplicationIcon() {
		return IconsMapping.getImage("/icons/logo_64.png");
	}

}
