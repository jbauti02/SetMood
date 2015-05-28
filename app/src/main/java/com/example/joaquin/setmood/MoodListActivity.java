package com.example.joaquin.setmood;

import android.support.v4.app.Fragment;

public class MoodListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new MoodListFragment();

    }
}
