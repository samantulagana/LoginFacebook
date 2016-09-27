package com.android.loginfacebook;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by Gana  on 09.27.2016.
 */
public class IntentUtil {

    private Activity activity;

    // constructor
    public IntentUtil(Activity activity) {
        this.activity = activity;
    }

    public void showAccessToken() {
        Intent i = new Intent(activity, AccessTokenActivity.class);
        activity.startActivity(i);
    }
}