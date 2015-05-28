package com.example.joaquin.setmood;

import android.support.v4.app.Fragment;

public class MoodActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new MoodFragment();

    }
}
