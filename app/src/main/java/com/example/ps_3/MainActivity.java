package com.example.ps_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends SingleFragmentActivity  {


    @Override
    protected Fragment createFragment() {
        return new TaksFragment();
    }
}