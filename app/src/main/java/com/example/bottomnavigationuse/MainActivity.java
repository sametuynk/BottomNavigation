package com.example.bottomnavigationuse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.bottomnavigationuse.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //NavHostFragment nesnesi oluşturduk yaptığımız tasarım ekranları bu ekranda görünecek.
        NavHostFragment navHostFragment= (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);


        //BottomNav ile navHostFragment ikisini birleştime yaptık
        NavigationUI.setupWithNavController(binding.bottomNav,navHostFragment.getNavController());

        /*
         * Fragmentlardaki id'ler ile bottom_nav kısmındaki id'leri birbirine eşitledik,
         * birbirleri ile senkronize çalışabilmesi için bu şekilde gerçekleştirdik.
         */

    }
}