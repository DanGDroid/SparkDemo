package com.example.admin.sparkdemo.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.sparkdemo.R;
import com.example.admin.sparkdemo.adapters.BookAdapter;
import com.example.admin.sparkdemo.model.Book;

import java.util.List;

/**
 * Created by Admin on 11/22/2015.
 */
public class MyBookShelfFragment extends Fragment {

    RecyclerView mRecyclerView;
    private BookAdapter adapter;
    private List<Book> books;

    public static MyBookShelfFragment newInstance() {

        Bundle args = new Bundle();

        MyBookShelfFragment fragment = new MyBookShelfFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_my_book_shelf,container,false);
        findViews(view);
       getListOfBooks();
        return  view;
    }

    private void findViews(View view){

        final LinearLayoutManager mLayoutManager =  new GridLayoutManager(getActivity(), 3);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }

    /*
    * get books from server
    * and parse to Book obj the thumbNail and title
    */
    private void getListOfBooks(){

        if (adapter != null) {
            adapter.notifyDataSetChanged();
            mRecyclerView.setAdapter(adapter);
        } else {
            adapter = new BookAdapter(getActivity(), books);
            mRecyclerView.setAdapter(adapter);
        }
    }
}
