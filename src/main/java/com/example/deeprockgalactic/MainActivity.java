package com.example.deeprockgalactic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] variants = {"Лобби","Классы","Типы миссии","Типы локации", "Уровни опасности", "Пиво"};
    int choice = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, R.layout.simple_list_item, R.id.text1, variants);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                choice = i;
                Intent intent = new Intent(MainActivity.this, Wiki.class);
                intent.putExtra("selectedVariant",choice);
                startActivity(intent);
            }
        });
    }
}