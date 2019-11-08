package com.pcare.common.base;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import java.util.LinkedList;

/**
 * @Author: gl
 * @CreateDate: 2019/10/16
 * @Description: 基础application
 */
public class BaseApplication extends Application {
    private static BaseApplication instance;
    private final String TAG = "LogCallback";

    public static BaseApplication getInstance() {
        if(null == instance){
            synchronized (BaseApplication.class){
                if(null == instance){
                    instance = new BaseApplication();
                }
                return instance;
            }
        }else
            return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    /**
     * 返回一个存储所有存在的activity的列表
     *
     * @return
     */
//    public LinkedList<BaseCommonActivity> getActivityList() {
//        if (mActivityList == null) {
//            mActivityList = new LinkedList<>();
//        }
//        return mActivityList;
//    }
    /**
     * 退出所有activity
     */
//    public static void killAll() {
//        Intent intent = new Intent(BaseCommonActivity.ACTION_RECEIVER_ACTIVITY);
//        intent.putExtra("type", "killAll");
//        getContext().sendBroadcast(intent);
//    }
}
