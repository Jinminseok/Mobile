package com.example.modile;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class HomeFragment extends Fragment {

    private  View view;
    private String TAG = "HomeFragment";


    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable  Bundle savedInstanceState) {
        Log.i(TAG,"onCreatView");
        view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }
}