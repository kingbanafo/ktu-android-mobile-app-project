package com.example.mymobileapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private GridAdapter adapter;
    private List<TableItem> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        prepareData();

        // 2 columns for grid
        adapter = new GridAdapter(this, itemList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }

    private void prepareData() {
        itemList = new ArrayList<>();

        // Sample data

        itemList.add(new TableItem("Republic Hotel", "Accra", 999.99, 5, R.drawable.republic));
        itemList.add(new TableItem("Bani Hotel", "Kumasi", 799.50, 3, R.drawable.bani));
        itemList.add(new TableItem("Global Hotel", "Tema", 129.99, 4, R.drawable.global));
        itemList.add(new TableItem("Pillar's Hotel", "HoHoe", 89.99, 4, R.drawable.pillars));
        itemList.add(new TableItem("Capital View Hotel", "Madina", 59.99, 5, R.drawable.capital));
        itemList.add(new TableItem("Sunshine Hotel", "Koforidua", 49.99, 1, R.drawable.sun));
        itemList.add(new TableItem("King David Hotel", "Okurasi", 1299.99, 2, R.drawable.king));
        itemList.add(new TableItem("Oslo House ", "Mankesim", 199.99, 3, R.drawable.oslo));
    }
}