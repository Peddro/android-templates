package com.example.dagger_mvp_template.ui.main;

import com.example.dagger_mvp_template.R;
import com.example.dagger_mvp_template.business.repository.MainRepository;
import com.example.dagger_mvp_template.ui.helpers.resources.ResourceProvider;

import javax.inject.Inject;

public class MainPresenter {

    private final ResourceProvider resourceProvider;
    private final MainRepository mainRepository;

    @Inject
    MainPresenter(final ResourceProvider resourceProvider, final MainRepository mainRepository) {
        this.resourceProvider = resourceProvider;
        this.mainRepository = mainRepository;
    }

    void init(MvpView view) {
        view.setButtonText(resourceProvider.getString(R.string.hello_world));
    }
}
