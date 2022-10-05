package com.ashera;

import org.teavm.classlib.ResourceSupplier;
import org.teavm.classlib.ResourceSupplierContext;

public class ResourcesSupplier implements ResourceSupplier {
	@Override
	public String[] supplyResources(ResourceSupplierContext context) {
		String[] result = { "www/css/styles.css", "res/xml/config.xml",
				//start - body
"www/layout/activity_main.xml",
"www/layout/error.xml",
"www/layout/erroritem.xml",
"www/layout/error_detail.xml",
"www/layout/index.xml",
//end - body
		};
		return result;
	}
}