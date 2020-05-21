package com.mvvmarchitecture.di.module;

import android.app.Application;
import android.content.Context;

import com.mvvmarchitecture.repository.local.DBService;
import com.mvvmarchitecture.repository.remote.NetworkService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    Context context;

    public AppModule(Application application) {
        context = application;
    }

    @Singleton
    @Provides
    DBService provideDBServiceContext() {
        return new DBService();
    }

    @Singleton
    @Provides
    NetworkService provideNetworkServiceContext() {
        return new NetworkService();
    }
}
