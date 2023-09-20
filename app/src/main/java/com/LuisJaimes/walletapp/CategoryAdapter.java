package com.LuisJaimes.walletapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import yuku.ambilwarna.AmbilWarnaDialog;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private ArrayList<Category> dataSet;

    public CategoryAdapter(ArrayList<Category> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_category_list, parent,false);
        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        Category myCategory = dataSet.get(position);
        holder.loadInfo(myCategory);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNameCategory;
        private CircleImageView cvCategory;
        private int defaultColor;
        private Button btnColor;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameCategory = itemView.findViewById(R.id.tv_name);
            cvCategory = itemView.findViewById(R.id.civ_category);
            btnColor = itemView.findViewById(R.id.btn_color);
            defaultColor = ContextCompat.getColor(itemView.getContext(), R.color.primary_color);
            btnColor.setOnClickListener(view -> openColorPicker());
        }

        private void openColorPicker() {
            AmbilWarnaDialog colorPicker = new AmbilWarnaDialog(itemView.getContext(), defaultColor, new AmbilWarnaDialog.OnAmbilWarnaListener() {
                @Override
                public void onCancel(AmbilWarnaDialog dialog) {
                }

                @Override
                public void onOk(AmbilWarnaDialog dialog, int color) {
                    defaultColor = color;
                    btnColor.setBackgroundColor(defaultColor);
                }
            });
            colorPicker.show();
        }

        public void loadInfo(Category myCategory) {
            tvNameCategory.setText(myCategory.getName());
            Picasso.get().load(myCategory.getIcon()).fit().into(cvCategory);
        }
    }
}
