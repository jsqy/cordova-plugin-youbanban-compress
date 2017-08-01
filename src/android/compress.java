package com.youbanban.cordova.compress;


import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
        if(action.equals("compress")){
        	String result = ""; 	
        	for(int i =0;i< args.length();i++){
				String str1 = args.getString(i);
        		JSONObject jsonObject = new JSONObject(args.getString(i));
        		String width = jsonObject.getString("width");
        		String height = jsonObject.getString("height");
        		String url = jsonObject.getString("url");
        		result = result + ImageUtils.saveBitmap(activity, url,Integer.parseInt(width),Integer.parseInt(height));
        		if(i < args.length()-1){
	            	   result = result + ",";
        		}
        	}
        	callbackContext.success(result);
        }
        return true;
    }



}
























