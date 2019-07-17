package com.pavgp.audiotodo.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;


import com.pavgp.audiotodo.R;
import com.pavgp.audiotodo.fragments.ReminderFragment;

public class ReminderActivity extends AppDefaultActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int contentViewLayoutRes() {
        return R.layout.reminder_layout;
    }

    @NonNull
    @Override
    protected ReminderFragment createInitialFragment() {
        return ReminderFragment.newInstance();
    }


}
