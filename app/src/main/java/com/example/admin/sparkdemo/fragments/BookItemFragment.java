package com.example.admin.sparkdemo.fragments;

import android.app.Fragment;
import android.os.Bundle;

/**
 * Created by Admin on 11/22/2015.
 */
public class BookItemFragment extends Fragment {

    public static BookItemFragment newInstance() {

        Bundle args = new Bundle();

        BookItemFragment fragment = new BookItemFragment();
        return fragment;
    }
}
