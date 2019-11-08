package com.pcare.tongue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.pcare.common.base.BaseActivity;
import com.pcare.common.base.IPresenter;

@Route(path = "/tongue/main")
public class MainActivity extends BaseActivity {

    @Autowired
    public String key1;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main_tongue;
    }

    @Override
    public void start() {
        super.start();
        Toast.makeText(this, "收到传送过来的数据：" + key1, Toast.LENGTH_LONG).show();
    }

    @Override
    protected IPresenter bindPresenter() {
        return null;
    }
}
