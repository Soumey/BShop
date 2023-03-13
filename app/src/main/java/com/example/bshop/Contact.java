package com.example.bshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Fragment fragment=new MapFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.map_layout,fragment).commit();
    }
}