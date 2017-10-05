package com.example.massam.fragmentapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        startFragment startFragment = new startFragment();

//        transaction.add(R.id.fragment_placeholder, startFragment);
        transaction.add(R.id.fragment_placeholder, startFragment);
        transaction.commit();

    }

    public void onSelectFragment(View view){

        Fragment newFragment;

        if (view == findViewById(R.id.btnstartFragment)){
            newFragment = new startFragment();

        }else if (view == findViewById(R.id.btnfragment01)){
            newFragment = new Fragment01();

        }else if (view == findViewById(R.id.btnfragment02)){
            newFragment = new Fragment02();
        }else{
            newFragment = new startFragment();
        }

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_placeholder,newFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }


}
