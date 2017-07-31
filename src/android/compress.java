package com.youbanban.cordova.compress;


import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import com.youbanban.cordova.chooseimages.imageloader.MyAdapter;

import android.app.Activity;
import android.widget.Toast;


public class compress extends CordovaPlugin {

	public static Activity activity;
	public static CallbackContext callbackContext;


    public boolean execute(String action, JSONArray args, CallbackContext callbackContext)
    throws JSONException {
    	  activity = this.cordova.getActivity();
          this.callbackContext = callbackContext;
        if(action.equals("getCamera")){
        	String result = "";
        	for(int i =2;i< args.length();i++){
        		result = result + ImageUtils.saveBitmap(activity, args.getString(i),Integer.parseInt(args.getString(0)),Integer.parseInt(args.getString(1)));
        		if(i < args.length()-1){
	            	   result = result + ",";
        		}
        	}

        	callbackContext.success(result);
        }
        return true;
    }



}
























