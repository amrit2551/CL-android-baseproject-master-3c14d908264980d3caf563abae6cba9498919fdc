package com.skeleton.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.skeleton.R;
import com.skeleton.adapter.UserInfoAdapter;
import com.skeleton.retrofit.APIError;
import com.skeleton.retrofit.ResponseResolver;
import com.skeleton.retrofit.RestClient;

import java.util.List;

/**
 * main activity
 */

public class MainActivity extends BaseActivity {
    /**
     *
     * @param savedInstanceState method
     */
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RestClient.getApiInterface().getData().enqueue(new ResponseResolver<List<UserInfo>>(this, true) {
            @Override
            public void success(final List<UserInfo> userData) {
                UserInfoAdapter recyclerViewAdapter = new UserInfoAdapter(MainActivity.this, userData);
                recyclerView = (RecyclerView) findViewById(R.id.rv);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(recyclerViewAdapter);


            }

            @Override
            public void failure(final APIError error) {
                Toast.makeText(getApplicationContext(), "failed execution", Toast.LENGTH_LONG).show();
            }
        });
    }
}
