package CldMap;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class mapPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if(args.length()<2){
    		callbackContext.error("参数个数不对");
    		return true;
    	}else{
    		if (action.equals("Plus")) {
            	int p1 = args.getInt(0);
            	int p2 = args.getInt(1);
                this.plus(p1,p2,callbackContext);
                return true;
            }else if(action.equals("minus")){
            	int p1 = args.getInt(0);
            	int p2 = args.getInt(1);
            	this.minus(p1,p2,callbackContext);
            }
    	}
        return false;
    }

    private void minus(int pram1,int pram2,CallbackContext callbackContext){
    	if(pram1-pram2>0){
    		callbackContext.success("正确");
    	}else{
    		callbackContext.error("不正确");
    	}
    }
    private void plus(int pram1,int pram2,CallbackContext callbackContext){
    	int result= pram1+pram2;
    	callbackContext.success("等于--"+result);
    }
    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
