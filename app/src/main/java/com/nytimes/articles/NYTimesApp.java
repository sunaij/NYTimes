package com.nytimes.articles;

import android.app.Activity;
import android.app.Application;

import com.nytimes.articles.di.components.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * File Description
 * <p>
 * Author: Sunaij Iqbal
 * Created: 30/03/2019
 * Modified: 30/03/2019
 */
public class NYTimesApp extends Application implements HasActivityInjector {

    private static NYTimesApp sInstance;


    public static NYTimesApp getAppContext() {
        return sInstance;
    }



    private static synchronized void setInstance(NYTimesApp app) {
        sInstance = app;
    }
    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeComponent();
        setInstance(this);
    }

    private void initializeComponent() {
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingInjector;
    }
}
