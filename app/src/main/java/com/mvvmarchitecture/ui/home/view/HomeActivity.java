package com.mvvmarchitecture.ui.home.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.mvvmarchitecture.MvvmApp;
import com.mvvmarchitecture.R;
import com.mvvmarchitecture.di.component.AppComponent;
import com.mvvmarchitecture.ui.home.di.DaggerHomeActivityComponent;
import com.mvvmarchitecture.ui.home.di.HomeActivityComponent;
import com.mvvmarchitecture.ui.home.di.HomeActivityModule;

import javax.inject.Inject;

public class HomeActivity extends AppCompatActivity {
    private HomeActivityComponent component;

    @Inject
    HomeViewModel homeViewModel;

    @Inject
    HomeViewModel homeViewModel2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        AppComponent appComponent = ((MvvmApp) getApplicationContext()).getAppComponent();
        // Todo seperate component creation.
        component = DaggerHomeActivityComponent.builder()
                .appComponent(appComponent)
                .homeActivityModule(new HomeActivityModule(this)).build();
        component.inject(this);


        Log.d("INSTANCE", "HOMEACTIVITY_NetworkService: " + appComponent.getNetworkService().toString());
        Log.d("INSTANCE", "HOMEACTIVITY_NetworkService: " + appComponent.getNetworkService().toString());
        Log.d("INSTANCE", "HOMEACTIVITY_homeViewModel: " + homeViewModel.toString());
        Log.d("INSTANCE", "HOMEACTIVITY_homeViewModel2: " + homeViewModel2.toString());
        Log.d("INSTANCE", "HOMEACTIVITY_callService: " + homeViewModel.callService());

    }
}
