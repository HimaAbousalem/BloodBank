package com.example.bloodbank.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.bloodbank.R;

public class IntroOne extends Fragment {
    @BindView(R.id.Intro_Image)
    ImageView introImage;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_intro, container, false);
        ButterKnife.bind(this, rootView);
        introImage.setImageResource(R.drawable.intro1);
        return rootView;
    }
}
