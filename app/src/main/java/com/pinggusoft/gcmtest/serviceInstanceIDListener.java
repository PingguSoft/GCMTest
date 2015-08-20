package com.pinggusoft.gcmtest;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;
/**
 * Created by taejunek on 8/20/2015.
 */
public class serviceInstanceIDListener extends InstanceIDListenerService {

    private static final String TAG = "serviceInstanceIDListener";

    @Override
    public void onTokenRefresh() {
        Intent intent = new Intent(this, serviceRegistrationIntent.class);
        startService(intent);
    }
}
