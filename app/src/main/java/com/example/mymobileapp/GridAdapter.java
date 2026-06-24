package com.example.mymobileapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    private Context context;
    private List<TableItem> items;

    public GridAdapter(Context context, List<TableItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_table_grid, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TableItem item = items.get(position);

        holder.name.setText(item.getName());
        holder.location.setText(item.getLocation());
        holder.price.setText("$" + String.format("%.2f", item.getPrice()));
        holder.ratings.setText("Qty: " + item.getRatings());
        holder.image.setImageResource(item.getImageResId());

        holder.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,
                        "Added " + item.getName() + " to cart",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, location, price, ratings;
        ImageView image;
        Button btnAdd;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.item_name);
            location = itemView.findViewById(R.id.item_location);
            price = itemView.findViewById(R.id.item_price);
            ratings = itemView.findViewById(R.id.item_ratings);
            image = itemView.findViewById(R.id.item_image);
            btnAdd = itemView.findViewById(R.id.btn_add);
        }
    }
}