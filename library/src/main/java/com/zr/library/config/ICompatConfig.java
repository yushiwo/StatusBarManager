package com.zr.library.config;

/**
 * @author hzzhengrui
 * @Date 17/6/20
 * @Description
 * 1、不支持沉浸 <br />
 * 2、支持非常规方式实现沉浸
 */
public interface ICompatConfig {

    /**
     * 检测是否支持状态栏设置
     * @return
     */
    boolean checkCompatiblity();

    /**
     * 检测是否需要特殊设置的Rom
     * @return
     */
    boolean checkSpecialRom();

}
