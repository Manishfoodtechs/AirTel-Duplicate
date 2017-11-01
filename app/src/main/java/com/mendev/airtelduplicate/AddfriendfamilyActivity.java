package com.mendev.airtelduplicate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class AddfriendfamilyActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private GridLayoutManager gridLayoutManager;
    private AddfnfAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfriendfamily);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_addfnf);
        gridLayoutManager = new GridLayoutManager(this, 1);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new DividerItemDecoration(AddfriendfamilyActivity.this,
                DividerItemDecoration.VERTICAL));

        adapter = new AddfnfAdapter(this);
        mRecyclerView.setAdapter(adapter);
    }
}
