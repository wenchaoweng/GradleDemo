package com.example.wwc.gradledemo.di;
import com.example.wwc.gradledemo.ui.activity.LoginActivity;
import com.example.wwc.gradledemo.ui.activity.SplashActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector
    abstract SplashActivity splashActivity();

    @ActivityScoped
    @ContributesAndroidInjector
    abstract LoginActivity loginActivity();
}
