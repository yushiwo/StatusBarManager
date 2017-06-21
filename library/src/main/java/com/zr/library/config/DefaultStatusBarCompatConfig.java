package com.zr.library.config;


import com.zr.library.util.CompatUtil;

/**
 * @author hzzhengrui
 * @Date 17/6/20
 * @Description
 */
public class DefaultStatusBarCompatConfig implements ICompatConfig {
    @Override
    public boolean checkCompatiblity() {
        return CompatUtil.checkCompatiblity();
    }

    @Override
    public boolean checkSpecialRom() {
        return CompatUtil.checkSpecialRom();
    }
}
