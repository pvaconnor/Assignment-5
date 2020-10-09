package com.example.assignment5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] mTitleList = new String[]{getResources().getString(R.string.d1),
                getResources().getString(R.string.d2),
                getResources().getString(R.string.d3),
                getResources().getString(R.string.d4),
                getResources().getString(R.string.d5),
                getResources().getString(R.string.d6)};
        String[] mDescription = new String[]{getResources().getString(R.string.d1),
                getResources().getString(R.string.d2),
                getResources().getString(R.string.d3),
                getResources().getString(R.string.d4),
                getResources().getString(R.string.d5),
                getResources().getString(R.string.d6)};
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this, mTitleList, mDescription);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}