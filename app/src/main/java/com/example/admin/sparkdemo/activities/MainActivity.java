package com.example.admin.sparkdemo.activities;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.admin.sparkdemo.R;
import com.example.admin.sparkdemo.fragments.MyBookShelfFragment;

public class MainActivity extends AppCompatActivity {

    private MyBookShelfFragment myBookShelfFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setIcon(R.drawable.spark_logo);
        }
        changeFragment(myBookShelfFragment);
    }

    public void changeFragment(Fragment fragment) {

        getFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
