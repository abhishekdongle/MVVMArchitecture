package com.mvvmarchitecture.ui.home.di;

import com.mvvmarchitecture.di.component.AppComponent;
import com.mvvmarchitecture.di.module.AppModule;
import com.mvvmarchitecture.di.scope.ActivityScope;
import com.mvvmarchitecture.ui.home.view.HomeActivity;

import dagger.Component;

@ActivityScope
@Component(modules = {HomeActivityModule.class, AppModule.class}, dependencies = AppComponent.class)
public interface HomeActivityComponent {
    void inject(HomeActivity homeActivity);
}