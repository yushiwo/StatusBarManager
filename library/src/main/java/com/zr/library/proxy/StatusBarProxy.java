package com.zr.library.proxy;


import com.zr.library.config.ICompatConfig;

/**
 * @author hzzhengrui
 * @Date 17/6/20
 * @Description
 */
public class StatusBarProxy implements IProxy {

    private static final String TAG = StatusBarProxy.class.getSimpleName();

    private static StatusBarProxy sInstance;

    private ICompatConfig compatConfig;

    public static StatusBarProxy getInstance() {
        if (sInstance == null) {
            synchronized (StatusBarProxy.class) {
                if (sInstance == null) {
                    sInstance = new StatusBarProxy();
                }
            }
        }

        return sInstance;
    }

    public ICompatConfig getCompatConfig() {
        return compatConfig;
    }

    public void setCompatConfig(ICompatConfig compatConfig) {
        this.compatConfig = compatConfig;
    }


    @Override
    public boolean checkCompatiblity() {
        return compatConfig.checkCompatiblity();
    }

    @Override
    public boolean checkSpecialRom() {
        return compatConfig.checkSpecialRom();
    }
}
