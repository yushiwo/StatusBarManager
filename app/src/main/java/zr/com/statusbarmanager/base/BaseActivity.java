package zr.com.statusbarmanager.base;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zr.library.StatusBarManager;


/**
 * @author hzzhengrui
 * @Date 17/6/20
 * @Description
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initStatusBar();
    }

    protected void initStatusBar() {
        StatusBarManager.getsInstance().setColor(this, Color.TRANSPARENT);
    }
}
