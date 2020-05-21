package com.mvvmarchitecture;

import android.app.Application;
import android.util.Log;

import com.mvvmarchitecture.di.component.AppComponent;
import com.mvvmarchitecture.di.component.DaggerAppComponent;
import com.mvvmarchitecture.di.module.AppModule;
import com.mvvmarchitecture.repository.local.DBService;
import com.mvvmarchitecture.repository.remote.NetworkService;

import javax.inject.Inject;


public class MvvmApp extends Application {
    private AppComponent appComponent;

    @Inject
    NetworkService networkService;
    @Inject
    NetworkService networkService2;
    @Inject
    DBService dbService;
    @Inject
    DBService dbService2;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.inject(this);
        Log.d("INSTANCE", "DBSERVICE: " + dbService.toString());
        Log.d("INSTANCE", "DBSERVICE2: " + dbService2.toString());
        Log.d("INSTANCE", "NETWORKSERVICE: " + networkService.toString());
        Log.d("INSTANCE", "NETWORKSERVICE2: " + networkService2.toString());
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}
