package com.rntoast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNToastModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNToast";
    }

    @ReactMethod
    public void show(String text) {
      Context context = getReactApplicationContext();
      Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
}
