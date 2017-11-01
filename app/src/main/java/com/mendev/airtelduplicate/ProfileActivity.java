package com.mendev.airtelduplicate;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    LinearLayout drwClick;
    LinearLayout drwClick2;
    LinearLayout lyAddfnf;
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
        drawerLayout.setVisibility(View.VISIBLE);


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
        setFragment(0);
        setupDrawerContent(navigationView);
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        selectDrawerItem(menuItem);
                        return true;
                    }
                });
    }

    public void selectDrawerItem(MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.profile:
                setFragment(0);
                break;
            case R.id.product:
                setFragment(1);
                break;
            default:
                setFragment(2);
                break;

        }

        drawerLayout.closeDrawers();
        menuItem.setChecked(true);

    }

    public void setFragment(int position) {
        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (position) {
            case 0:
                ProfileFragment frament_profile = new ProfileFragment();
                fragmentTransaction.replace(R.id.fragment, frament_profile);
                drwClick.setVisibility(View.VISIBLE);
                drwClick2.setVisibility(View.GONE);
                break;
            case 1:
                Toast.makeText(ProfileActivity.this, "Clicked Product", Toast.LENGTH_LONG);
                break;

        }

        fragmentTransaction.commit();
    }
}
