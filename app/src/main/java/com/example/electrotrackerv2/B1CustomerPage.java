package com.example.electrotrackerv2;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener;


public class B1CustomerPage extends AppCompatActivity implements OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1customer_page);


        Toolbar toolbar = findViewById(R.id.toolbar); //Ignore red line errors
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav,
                R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new B2HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_home){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new B2HomeFragment()).commit();
        }
        else if (id == R.id.nav_dashboard){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new B2DashboardFragment()).commit();
        }
        else if (id == R.id.nav_calculate){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new B2CalculateFragment()).commit();
        }
        else if (id == R.id.nav_profile){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new B2ProfileFragment()).commit();
//            Intent intent = new Intent(B1CustomerPage.this, FakeProfile.class);
//            startActivity(intent);
        }
        else if (id == R.id.nav_logout){

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Logout")

                    .setMessage("Are you sure you want to log out?")
                    .setNegativeButton("No", null)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // Perform logout action, such as clearing session or user data

                            // Display a toast message
                            Toast.makeText(B1CustomerPage.this, "Logged out", Toast.LENGTH_SHORT).show();

                            // Start the login activity\
                            Intent intent = new Intent(B1CustomerPage.this, A1Login.class);
                            startActivity(intent);
                            finish(); // Optional: Close the current activity
                        }
                    })
                    .show();

        }


        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}