package com.skeleton.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.skeleton.R;

/**
 * class home
 */
public class HomeActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private Button btnSkip;
    private ImageView ivBar, ivMenu;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ivMenu.setVisibility(View.VISIBLE);
        ivBar.setVisibility(View.GONE);
        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                drawerLayout.openDrawer(Gravity.START);
            }
        });
    }


//    private void init() {
    // btnSkip = (Button) findViewById(R.id.btnskip);
    // ivMenu = (ImageView) findViewById(R.id.ivMenu);
    ////ivBar = (ImageView) findViewById(R.id.ivToolbarBtn);
}



