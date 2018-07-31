package com.youbanban.cordova.compress;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
        	JSONArray result = new JSONArray();
        	for(int i =0;i< args.length();i++){
        		JSONObject jsonObject = new JSONObject(args.getString(i));
        		String width = jsonObject.getString("width");
        		String height = jsonObject.getString("height");
        		String url = jsonObject.getString("url");
				result.put(ImageUtils.saveBitmap(activity, url,Integer.parseInt(width),Integer.parseInt(height)));
        	}
        	callbackContext.success(result);
        }
        return true;
    }
}
























