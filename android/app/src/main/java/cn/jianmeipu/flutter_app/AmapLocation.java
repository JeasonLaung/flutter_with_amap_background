package cn.jianmeipu.flutter_app;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

import io.flutter.Log;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.PluginRegistry.Registrar;

public class AmapLocation implements MethodChannel.MethodCallHandler {
    private Registrar registrar;

    private AmapLocation(Registrar registrar) {
        this.registrar = registrar;
    }
    @Override
    public void onMethodCall( MethodCall methodCall,  MethodChannel.Result methodResult) {
        Map<String, Object> args = (Map<String, Object>) methodCall.arguments;
        if (methodCall.equals("start_background")) {
            methodResult.success("设置成功");
        } else {
            methodResult.notImplemented();
        }
    }
}
