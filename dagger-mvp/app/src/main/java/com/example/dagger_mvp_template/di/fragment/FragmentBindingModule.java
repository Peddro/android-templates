package com.example.dagger_mvp_template.di.fragment;

import com.example.dagger_mvp_template.ui.home.HomeFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBindingModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract HomeFragment homeFragment();

}
