package com.example.lostfoundapp;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ViewItemActivity extends AppCompatActivity {

    private DatabaseHelper db;
    private ListView listViewItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_items);

        db = new DatabaseHelper(this);
        listViewItems = findViewById(R.id.listViewItems);

        ArrayList<String> itemList = db.getAllAdverts();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listViewItems.setAdapter(adapter);
    }
}
