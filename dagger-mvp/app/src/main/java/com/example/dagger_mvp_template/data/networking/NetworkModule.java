package com.example.dagger_mvp_template.data.networking;

import com.example.dagger_mvp_template.BuildConfig;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    public NetworkModule() {
    }

    @Provides @Singleton
    HttpLoggingInterceptor provideLoggingInterceptor() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(BuildConfig.DEBUG ? HttpLoggingInterceptor.Level.BODY
                : HttpLoggingInterceptor.Level.BASIC);
        return loggingInterceptor;
    }

    @Provides @Singleton
    OkHttpClient provideHttpClient(HttpLoggingInterceptor loggingInterceptor) {
        return new OkHttpClient.Builder().addInterceptor(loggingInterceptor).build();
    }

    @Provides @Singleton
    Retrofit provideRestAdapter(OkHttpClient client) {
        return new Retrofit.Builder().baseUrl("http://www.some-fake-api.com")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
