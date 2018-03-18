package com.example.dagger_mvp_template.di.app;

import com.example.dagger_mvp_template.AndroidApplication;
import com.example.dagger_mvp_template.ui.helpers.resources.AndroidResources;
import com.example.dagger_mvp_template.ui.helpers.resources.ResourceProvider;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
abstract class AppModule {

    @Provides
    @Singleton
    static Context providesContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    static ResourceProvider provideResourceProvider(Context context) {
        return new AndroidResources(context);
    }

    @Binds
    abstract Application application(AndroidApplication application);
}
