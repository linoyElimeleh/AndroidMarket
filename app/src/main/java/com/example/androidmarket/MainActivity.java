package com.example.androidmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.widget.Button;

//todo change to login page
public class MainActivity extends AppCompatActivity {
    NavController navCtl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);

        Button registerButton = findViewById(R.id.login_register_btn);
        registerButton.setOnClickListener((v) -> {
           // Navigation.findNavController(v).navigate(R.id.action_);
        });

//        NavHost navHost = (NavHost) getSupportFragmentManager().findFragmentById(R.id.login_navhost);
//        navCtl = navHost.getNavController();

        //    NavigationUI.setupActionBarWithNavController(this, navCtl);
    }
}