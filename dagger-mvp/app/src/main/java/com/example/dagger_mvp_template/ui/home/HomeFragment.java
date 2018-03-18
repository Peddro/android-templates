package com.example.dagger_mvp_template.ui.home;

import com.example.dagger_mvp_template.R;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class HomeFragment extends Fragment {

    @Inject
    HomePresenter presenter;

    @Override
    public void onAttach(final Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView homeText = view.findViewById(R.id.home_text);
        homeText.setText(presenter.getHomeText());
    }
}
