package com.ashera;

import com.ashera.core.CoreCordovaPlugin;
import com.ashera.core.MainActivity;

public class Client {
	static {
		//start - body
System.out.println(com.ashera.core.CoreCordovaPlugin.class.getName());
System.out.println(com.ashera.converter.ConverterCordovaPlugin.class.getName());
System.out.println(com.ashera.jsonadapter.JSONAdapterCordovaPlugin.class.getName());
System.out.println(com.ashera.layout.AndroidLayoutsCordovaPlugin.class.getName());
//end - body
	}

	public static void main(String[] args) throws Exception {
		MainActivity mainActivity = new MainActivity();
	    mainActivity.onCreate(new r.android.os.Bundle());
	}
}

