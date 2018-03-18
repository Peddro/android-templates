package com.example.dagger_mvp_template.ui.home;

import com.example.dagger_mvp_template.R;
import com.example.dagger_mvp_template.business.repository.HomeRepository;
import com.example.dagger_mvp_template.ui.helpers.resources.ResourceProvider;

import javax.inject.Inject;

public class HomePresenter {

    private final ResourceProvider resourceProvider;
    private final HomeRepository homeRepository;

    @Inject
    HomePresenter(final ResourceProvider resourceProvider, final HomeRepository homeRepository) {
        this.resourceProvider = resourceProvider;
        this.homeRepository = homeRepository;
    }

    public String getHomeText() {
        return resourceProvider.getString(R.string.home_text);
    }
}
