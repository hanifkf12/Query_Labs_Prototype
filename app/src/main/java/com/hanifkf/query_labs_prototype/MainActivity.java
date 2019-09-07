package com.hanifkf.query_labs_prototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0f);
        NavController navController = Navigation.findNavController(this,R.id.myNavHostFragment);
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigation);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.beritaFragment,R.id.scannerFragment,R.id.notifikasiFragment,R.id.profilFragment).build();
        NavigationUI.setupActionBarWithNavController(this,navController, appBarConfiguration);
        NavigationUI.setupWithNavController(bottomNav, navController);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this,R.id.myNavHostFragment);
        return navController.navigateUp();
    }
}
