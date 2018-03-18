package com.example.dagger_mvp_template.business.repository;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class MainRepository {

    private final Retrofit retrofit;

    @Inject
    MainRepository(final Retrofit retrofit) {
        this.retrofit = retrofit;
    }
}
