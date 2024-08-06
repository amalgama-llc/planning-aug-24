package com.company.test1.application.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * A class providing access to application icons.
 */
public class IconsMapping {

	private static Map<String, Image> images = new HashMap<>();

	// predefined commonly used images
	public static final Image ADD = getImage("/icons/add.png");
	public static final Image REMOVE = getImage("/icons/remove.png");
	public static final Image COPY = getImage("/icons/copy.png");
	public static final Image CLEAR = getImage("/icons/clear.png");
	public static final Image UP = getImage("/icons/up.png");
	public static final Image DOWN = getImage("/icons/down.png");
	public static final Image AGENT = getImage("/icons/agent.png");
	public static final Image SIMULATION = getImage("/icons/simulation.png");
	public static final Image RUN = getImage("/icons/Run.png");
	public static final Image SAVE = getImage("/icons/save.png");

	public static final Image ZOOM_IN = getImage("/icons/zoomIn.png");
	public static final Image ZOOM_OUT = getImage("/icons/zoomOut.png");
	public static final Image CENTERING = getImage("/icons/centering.png");
	public static final Image MAP = getImage("/icons/map.png");
	public static final Image REFRESH = getImage("/icons/refresh.png");
	public static final Image CHECK = getImage("/icons/check.png");

	public static final Image COLLAPSE_TREE = getImage("/icons/collapseTree.png");
	public static final Image EXPAND_TREE = getImage("/icons/expandTree.png");
	
	public static final Image WORK_CENTER = getImage("/icons/workcenter.png");
	public static final Image OPERATION = getImage("/icons/operation.png");
	public static final Image PRODUCT = getImage("/icons/product.png");
	public static final Image PRODUCTION_PLAN = getImage("/icons/order_list.png");
	public static final Image PERFORMANCE_RECORD = getImage("/icons/productionParameters.png");

	private IconsMapping() {}

	public static Image getImage(String path) {
		if (path == null || path.isEmpty()) {
			return ADD;
		}
		return images.computeIfAbsent(path, p -> new Image(Display.getCurrent(), FileUtils.getInputStream(p)));
	}

}
