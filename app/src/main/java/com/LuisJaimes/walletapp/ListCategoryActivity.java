package com.LuisJaimes.walletapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;

public class ListCategoryActivity extends AppCompatActivity {

    private ArrayList<Category> listCategoryRV = new ArrayList<>();
    private RecyclerView myRecycleCategory;
    private ExtendedFloatingActionButton fbAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_category);
        fbAdd=findViewById(R.id.fb_add);
        fbAdd.setOnClickListener(view -> {
            Intent myIntent=new Intent(ListCategoryActivity.this, NewCategoryActivity.class);
            startActivity(myIntent);
        });
        loadFakeDataCategory();
        myRecycleCategory=findViewById(R.id.rv_list_category);
        CategoryAdapter myAdapter = new CategoryAdapter(listCategoryRV);
        myRecycleCategory.setAdapter(myAdapter);
        myRecycleCategory.setLayoutManager(new LinearLayoutManager(ListCategoryActivity.this));
    }

    private void loadFakeDataCategory(){
        Category myCategory1 = new Category("Restaurante", "Aqui se come.", "https://i.pinimg.com/564x/23/86/84/2386849a71c7f23d310e35331d84a33c.jpg");
        Category myCategory2 = new Category("Gasolinera", "Aqui se recarga gasolina.", "https://i.pinimg.com/564x/8b/50/f8/8b50f84b4fa7e9c5dfafd4a5888226e5.jpg");
        Category myCategory3 = new Category("Arriendo", "Aqui se debe plata.", "https://i.pinimg.com/564x/c4/99/57/c49957718de823347fba93e871538f40.jpg");
        listCategoryRV.add(myCategory1);
        listCategoryRV.add(myCategory2);
        listCategoryRV.add(myCategory3);
    }
}