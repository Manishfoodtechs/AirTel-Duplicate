package com.mendev.airtelduplicate;

import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    LinearLayout drwClick;
    LinearLayout drwClick2;
    ImageView menu;
    ImageView menu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        menu = (ImageView) findViewById(R.id.iv_menu);
        menu2 = (ImageView) findViewById(R.id.iv_menu2);
        drwClick = (LinearLayout) findViewById(R.id.drawerClick);
        drwClick2 = (LinearLayout) findViewById(R.id.drawerClick2);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);

        drwClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drawerLayout.openDrawer(GravityCompat.START);
                drwClick.setVisibility(View.GONE);
                drwClick2.setVisibility(View.VISIBLE);

            }
        });

        drwClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drawerLayout.closeDrawer(GravityCompat.START);
                drwClick.setVisibility(View.VISIBLE);
                drwClick2.setVisibility(View.GONE);

            }
        });


    }
}
