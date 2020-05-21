package com.mvvmarchitecture.ui.home.di;

import android.content.Context;

import com.mvvmarchitecture.di.scope.ActivityScope;
import com.mvvmarchitecture.ui.home.view.HomeViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeActivityModule {
    Context context;

    public HomeActivityModule(Context context) {
        this.context = context;
    }

    @ActivityScope
    @Provides
    Context getHomeActivityContext() {
        return context;
    }

    @ActivityScope
    @Provides
    HomeViewModel provideHomeViewModel() {
        return new HomeViewModel();
    }
}
