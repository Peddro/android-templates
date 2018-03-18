package com.example.dagger_mvp_template.di.app;

import com.example.dagger_mvp_template.AndroidApplication;
import com.example.dagger_mvp_template.data.networking.NetworkModule;
import com.example.dagger_mvp_template.di.activity.ActivityBindingModule;
import com.example.dagger_mvp_template.di.fragment.FragmentBindingModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                AppModule.class,
                AndroidSupportInjectionModule.class,
                ActivityBindingModule.class,
                FragmentBindingModule.class,
                NetworkModule.class
        }
)
interface AppComponent extends AndroidInjector<AndroidApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<AndroidApplication> {
    }
}
