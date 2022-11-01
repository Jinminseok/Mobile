package com.example.modile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {
    BottomNavigationView btnv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnv = findViewById(R.id.menu_bottom_navigation);

        //처음화면
        getSupportFragmentManager().beginTransaction().add(R.id.main_frame, new HomeFragment()).commit();

        btnv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id) {
                    case R.id.home :
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new HomeFragment()).commit();
                        break;
                    case R.id.calendar:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new ChlendarFragment()).commit();
                        break;
                    case R.id. mypage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new MypageFragment()).commit();
                        break;
                    case R.id. notice:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new NoticeFragment()).commit();
                        break;
                }
                return true;
            }
        });

    }
}