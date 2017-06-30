package zr.com.statusbarmanager.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import zr.com.statusbarmanager.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mNormalButton, mViewpagerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        setListener();
    }

    private void initView() {
        mNormalButton = (Button) findViewById(R.id.btn_normal);
        mViewpagerButton = (Button) findViewById(R.id.btn_view_pager);
    }

    private void setListener() {
        mNormalButton.setOnClickListener(this);
        mViewpagerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_normal:
                NormalActivity.launch(MainActivity.this);
                break;

            case R.id.btn_view_pager:
                ViewpagerActivity.launch(MainActivity.this);
                break;
        }
    }
}
