package zr.com.statusbarmanager.config;

import com.zr.library.config.ICompatConfig;
import com.zr.library.util.CompatUtil;

/**
 * @author hzzhengrui
 * @Date 17/7/28
 * @Description
 */
public class StatusBarCompactConfig implements ICompatConfig {
    @Override
    public boolean checkCompatiblity() {
        if (CompatUtil.checkCompatiblity()) {
            // TODO: 17/7/28 自定义的兼容性判断逻辑
        } else {
            return false;
        }
    }

    @Override
    public boolean checkSpecialRom() {
        if (CompatUtil.checkSpecialRom()) {
            return true;
        } else {
            // TODO: 17/7/28 自定义特殊ROM判断逻辑
        }
    }
}
