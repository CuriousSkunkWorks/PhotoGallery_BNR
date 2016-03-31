package com.example.shaun.photogallery_bnr;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Shaun on 3/31/16.
 */
public abstract class SingleFragmentActivity extends FragmentActivity {

    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}
