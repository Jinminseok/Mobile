package com.example.modile;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ChlendarFragment extends Fragment {

    private View view;
    private String TAG = "ChlendarFragment";

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable  Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_chlendar, container, false);
        return view;
    }
}