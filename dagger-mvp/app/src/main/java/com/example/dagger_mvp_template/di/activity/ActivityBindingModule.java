package com.example.dagger_mvp_template.di.activity;

import com.example.dagger_mvp_template.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ActivityScope @ContributesAndroidInjector
    abstract MainActivity mainActivity();

}
