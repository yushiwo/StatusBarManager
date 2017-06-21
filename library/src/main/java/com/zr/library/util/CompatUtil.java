package com.zr.library.util;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hzzhengrui
 * @Date 17/6/5
 * @Description 适配类,用于判断ROM是否支持某个特性
 */
public class CompatUtil {

    private final static String TAG = CompatUtil.class.getSimpleName();

    public static final String ROM_EMUI = "EMUI";

    private static final String KEY_VERSION_EMUI = "ro.build.version.emui";

    /**
     * ROM是否需要特殊处理来支持沉浸
     * @return
     */
    public static boolean checkSpecialRom() {

        if (isEmui_3_1()) {
            return true;
        }

        return false;
    }

    /**
     * 系统版本是否支持沉浸
     * @return
     */
    public static boolean checkCompatiblity() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return false;
        }

        if (!isCompactOppo()) {
            return false;
        }

        return true;
    }

    /**
     * 是否符合沉浸条件的oppo手机
     * @return
     */
    private static boolean isCompactOppo() {
        if (isOppo()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                return true;
            } else {
                return false;
            }
        }

        return true;
    }


    public static boolean isEmui_3_1() {
        String romVersion = getRomVersion(ROM_EMUI);
        if (!TextUtils.isEmpty(romVersion)) {
            return romVersion.equals("EmotionUI_3.1");
        } else {
            return false;
        }
    }

    /**
     * 获取Rom的版本
     * @param romType
     * @return
     */
    public static String getRomVersion(String romType) {
        String result = null;
        switch (romType) {
            case ROM_EMUI:
                result = getSystemProperty(KEY_VERSION_EMUI);

            default:

                break;

        }

        return result;
    }


    private static String getSystemProperty(String propName) {
        String line;
        BufferedReader input = null;
        try {
            Process p = Runtime.getRuntime().exec("getprop " + propName);
            input = new BufferedReader(
                    new InputStreamReader(p.getInputStream()), 1024);
            line = input.readLine();
            input.close();
        } catch (IOException ex) {
            Log.e(TAG, "Unable to read sysprop " + propName, ex);
            return null;
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    Log.e(TAG, "Exception while closing InputStream", e);
                }
            }
        }
        return line;
    }

    /**
     * 获取手机的厂商
     * @return
     */
    public static String getManufacturer(){
        return Build.MANUFACTURER;
    }

    /**
     * 是否是Meizu手机
     * @return
     */
    private static boolean isMeizu(){
        String manufacturer = getManufacturer();
        if(TextUtils.isEmpty(manufacturer)){
            return false;
        }

        if(getManufacturer().equals("Meizu")){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 是否是锤子手机
     * @return
     */
    private static boolean isSmartisan(){
        String manufacturer = getManufacturer();
        if(TextUtils.isEmpty(manufacturer)){
            return false;
        }

        if(getManufacturer().equals("smartisan")){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 是否是oppo手机
     * @return
     */
    private static boolean isOppo(){
        String manufacturer = getManufacturer();
        if(TextUtils.isEmpty(manufacturer)){
            return false;
        }

        if(getManufacturer().equals("OPPO")){
            return true;
        }else {
            return false;
        }
    }
}
