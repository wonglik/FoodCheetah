package com.wonglik.foodcheetah;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.wonglik.foodcheetah.chefFoodPanel.ChefHomeFragment;
import com.wonglik.foodcheetah.chefFoodPanel.ChefOrderFragment;
import com.wonglik.foodcheetah.chefFoodPanel.ChefPendingOrderFragment;
import com.wonglik.foodcheetah.chefFoodPanel.ChefProfileFragment;
import com.wonglik.foodcheetah.customerFoodPanel.CustomerCartFragment;
import com.wonglik.foodcheetah.customerFoodPanel.CustomerHomeFragment;
import com.wonglik.foodcheetah.customerFoodPanel.CustomerOrdersFragment;
import com.wonglik.foodcheetah.customerFoodPanel.CustomerProfileFragment;
import com.wonglik.foodcheetah.customerFoodPanel.CustomerTrackFragment;

public class CustomerFoodPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_food_panel_bottom_navigation);
        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.cust_Home:
                fragment=new CustomerHomeFragment();
                break;
        }
        switch (item.getItemId()){
            case R.id.cart:
                fragment=new CustomerCartFragment();
                break;
        }
        switch (item.getItemId()){
            case R.id.cust_profile:
                fragment=new CustomerProfileFragment();
                break;
        }
        switch (item.getItemId()){
            case R.id.Cust_order:
                fragment=new CustomerOrdersFragment();
                break;
        }
        switch (item.getItemId()){
            case R.id.track:
                fragment=new CustomerTrackFragment();
                break;
        }
        return loadcheffragment(fragment);

    }

    private boolean loadcheffragment(Fragment fragment) {

        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
        return false;
    }
}