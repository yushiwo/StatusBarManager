package com.zr.library.proxy;

/**
 * @author hzzhengrui
 * @Date 17/6/20
 * @Description
 */
public interface IProxy {

    /**
     * 是否支持沉浸
     * @return
     */
    boolean checkCompatiblity();

    /**
     * 是否需要特殊方式实现沉浸
     * @return
     */
    boolean checkSpecialRom();
}
