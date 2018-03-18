package com.example.dagger_mvp_template.ui.helpers.resources;

import android.support.annotation.StringRes;

public interface ResourceProvider {

    String getString(@StringRes int resId);
}
