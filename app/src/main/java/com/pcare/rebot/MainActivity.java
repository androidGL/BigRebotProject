package com.pcare.rebot;

import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.pcare.common.base.BaseActivity;
import com.pcare.common.base.IPresenter;

@Route(path = "app/main")
public class MainActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected IPresenter bindPresenter() {
        return null;
    }

    public void toTonguePage(View view) {
        ARouter.getInstance().build("/tongue/main")
                .withString("key1","888")
                .navigation();
    }

    public void toInquiryPage(View view) {
        ARouter.getInstance().build("/inquiry/main")
                .withString("key1","666")
                .navigation();
    }
}
