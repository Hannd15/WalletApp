package com.LuisJaimes.walletapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {

    private ArrayList<Account> dataSet;

    public AccountAdapter(ArrayList<Account> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_account_list, parent,false);
        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account myAccount = dataSet.get(position);
        holder.loadInfo(myAccount);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNameAccount, tvTypeAccount, tvBalanceAccount;
        private CircleImageView pi_imagen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameAccount = itemView.findViewById(R.id.tv_name_account);
            tvTypeAccount = itemView.findViewById(R.id.tv_type_account);
            tvBalanceAccount = itemView.findViewById(R.id.tv_balance_account);
            pi_imagen = itemView.findViewById(R.id.pi_imagen);
        }

        public void loadInfo(Account myAccount) {
            tvNameAccount.setText(myAccount.getName());
            tvBalanceAccount.setText(String.valueOf(myAccount.getCurrentValue()));
            tvTypeAccount.setText(myAccount.getType());
            Picasso.get().load(myAccount.getImgUrl()).fit().into(pi_imagen);
        }
    }
}

