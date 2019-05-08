package com.example.bloodbank.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.bloodbank.R;
import com.example.bloodbank.ui.adapter.IntroPagerAdapter;


public class WelcomeActivity extends AppCompatActivity {
    @BindView(R.id.Welcome_Activity_Pager)
    ViewPager slider;
    @BindView(R.id.Welcome_Activity_Skip)
    Button skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        slider.setAdapter(new IntroPagerAdapter(getSupportFragmentManager(), 0));
        skip.setOnClickListener(v ->
                openLoginActivity()
        );
    }
    public void openLoginActivity(){
        startActivity(new Intent(this, AuthenticationActivity.class));
        finish();
    }
}
