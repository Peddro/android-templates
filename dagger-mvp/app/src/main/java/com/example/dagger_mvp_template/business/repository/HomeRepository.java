package com.example.dagger_mvp_template.business.repository;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Retrofit;

@Singleton
public class HomeRepository {

    private final Retrofit retrofit;

    @Inject
    HomeRepository(final Retrofit retrofit) {
        this.retrofit = retrofit;
    }
}
