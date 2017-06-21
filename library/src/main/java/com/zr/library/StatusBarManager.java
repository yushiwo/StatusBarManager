package com.zr.library;

import android.app.Activity;
import android.support.annotation.ColorInt;
import android.util.Log;

import com.zr.library.config.ICompatConfig;
import com.zr.library.proxy.StatusBarProxy;
import com.zr.library.util.StatusBarUtil;


/**
 * @author hzzhengrui
 * @Date 17/6/20
 * @Description
 */
public class StatusBarManager {

    private static final String TAG = StatusBarManager.class.getSimpleName();

    private static StatusBarManager sInstance;
    private ICompatConfig compatConfig;

    public static StatusBarManager getsInstance() {
        if (sInstance == null) {
            synchronized (StatusBarManager.class) {
                if (sInstance == null) {
                    sInstance = new StatusBarManager();
                }
            }
        }

        return sInstance;
    }

    public void init(ICompatConfig compatConfig) {
        if (compatConfig == null) {
            throw new IllegalArgumentException("StatusBarManager config can not be null");
        }

        if (this.compatConfig == null) {
            this.compatConfig = compatConfig;
            StatusBarProxy.getInstance().setCompatConfig(compatConfig);
        } else {
            Log.w(TAG, "StatusBarManager has init before");
        }

    }

    public boolean isInited() {
        return this.compatConfig != null;
    }

    /**
     * 设置activity状态栏的颜色
     * @param activity
     * @param color
     */
    public void setColor(Activity activity, @ColorInt int color) {
        StatusBarUtil.setColor(activity, color);
    }

    /**
     * 设置DrawerLayout沉浸
     * @param activity
     * @param color
     */
    public void setColorForDrawerLayout(Activity activity, @ColorInt int color) {
        StatusBarUtil.setColorForDrawerLayout(activity, color);
    }

    public void setColorForCoordinatorLayout(Activity activity, @ColorInt int color) {
        StatusBarUtil.setColorForCoordinatorLayout(activity, color);
    }

}
