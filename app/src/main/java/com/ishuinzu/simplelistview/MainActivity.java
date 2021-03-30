package com.ishuinzu.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listSimple;
    private String[] countriesArray = {
            "Country 1",
            "Country 2",
            "Country 3",
            "Country 4",
            "Country 5",
            "Country 6",
            "Country 7",
            "Country 8",
            "Country 9",
            "Country 10",
            "Country 11",
            "Country 12",
            "Country 13",
            "Country 14",
            "Country 15",
            "Country 16",
            "Country 17",
            "Country 18",
            "Country 19",
            "Country 20",
    };
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listSimple = findViewById(R.id.listSimple);

        //Array Adapter Initialization
        arrayAdapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                countriesArray
        );
        //Setting Adapter
        listSimple.setAdapter(arrayAdapter);
        //Setting On Item Click Listener
        listSimple.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicked Item : " + countriesArray[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}