package com.LuisJaimes.walletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();
    private RecyclerView myRecycleAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();
        myRecycleAccount=findViewById(R.id.rv_list_account);
        AccountAdapter myAdapter = new AccountAdapter(listAccountRV);
        myRecycleAccount.setAdapter(myAdapter);
        myRecycleAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));
    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia", "Cuenta de Ahorros", 215666.0, "https://th.bing.com/th/id/OIP.v7FeDLAz5NNViW1OqcUX1wHaEK?pid=ImgDet&rs=1");
        Account myAccount2 = new Account("Davivienda", "Cuenta debito", 846465431.0, "https://th.bing.com/th/id/OIP.-fGLTKfGstMZpewFgh9QNQHaIU?pid=ImgDet&rs=1");
        Account myAccount3 = new Account("Efecto", "Efectivo", 984561.0, "https://i1.sndcdn.com/artworks-vlPwaDU3OFmgIcas-sDgZDg-t500x500.jpg");
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }
}