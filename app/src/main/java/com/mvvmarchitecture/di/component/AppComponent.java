package com.mvvmarchitecture.di.component;

import com.mvvmarchitecture.MvvmApp;
import com.mvvmarchitecture.di.module.AppModule;
import com.mvvmarchitecture.repository.local.DBService;
import com.mvvmarchitecture.repository.remote.NetworkService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public
interface AppComponent {
    void inject(MvvmApp mvvmApp);

    NetworkService getNetworkService();

    DBService getDBService();
}
