package com.example.toolsshop;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listViewTools = findViewById(R.id.listViewTools);
        listViewTools.setOnItemClickListener((parent, view, position, id) -> {

            Intent intent = new Intent(getApplicationContext(), ToolsCategoryActivity.class);
            intent.putExtra("keyPosition", position);
            startActivity(intent);

        });
    }
}