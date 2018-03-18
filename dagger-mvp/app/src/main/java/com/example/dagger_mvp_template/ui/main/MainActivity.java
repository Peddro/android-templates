package com.example.dagger_mvp_template.ui.main;

import com.example.dagger_mvp_template.R;
import com.example.dagger_mvp_template.ui.home.HomeFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.FrameLayout;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MvpView {

    @Inject
    MainPresenter presenter;

    private Button mainButton;
    private FrameLayout homeFragmentLayout;

    @Override
    public void setButtonText(final String text) {
        mainButton.setText(text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = findViewById(R.id.main_button);
        homeFragmentLayout = findViewById(R.id.main_home_fragment);

        presenter.init(this);

        addHomeFragment();
    }

    private void addHomeFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        HomeFragment fragment = new HomeFragment();
        fragmentTransaction.add(R.id.main_home_fragment, fragment);
        fragmentTransaction.commit();
    }
}
