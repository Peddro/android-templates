package com.example.dagger_mvp_template.ui.helpers.resources;

import android.content.Context;
import android.support.annotation.StringRes;

public class AndroidResources implements ResourceProvider {

    private final Context context;

    public AndroidResources(Context context) {
        this.context = context;
    }

    @Override public String getString(@StringRes int textId) {
        return context.getString(textId);
    }
}
