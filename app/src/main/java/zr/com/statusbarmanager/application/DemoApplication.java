package zr.com.statusbarmanager.application;

import android.app.Application;

import com.zr.library.StatusBarManager;
import com.zr.library.config.DefaultStatusBarCompatConfig;


/**
 * @author hzzhengrui
 * @Date 17/6/20
 * @Description
 */
public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        StatusBarManager.getsInstance().init(new DefaultStatusBarCompatConfig());
    }
}
