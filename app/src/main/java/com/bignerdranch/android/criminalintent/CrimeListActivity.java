package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by meng on 27/02/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
