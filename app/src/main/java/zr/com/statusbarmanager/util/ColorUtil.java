package zr.com.statusbarmanager.util;

import android.graphics.Color;
import android.support.annotation.ColorInt;

import zr.com.statusbarmanager.R;
import zr.com.statusbarmanager.application.DemoApplication;

/**
 * @author hzzhengrui
 * @Date 17/6/30
 * @Description
 */
public class ColorUtil {

    public static @ColorInt int getColor(int index) {
        int color = Color.TRANSPARENT;
        switch (index) {
            case 0:
                color = R.color.color0;
                break;
            case 1:
                color = Color.BLUE;
                break;

            case 2:
                color = Color.GRAY;
                break;
        }

        return color;
    }
}
