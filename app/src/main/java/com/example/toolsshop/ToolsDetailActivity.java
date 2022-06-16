package com.example.toolsshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ToolsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_detail);

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        TextView textViewInfo = findViewById(R.id.textViewInfo);
        ImageView imageViewTool = findViewById(R.id.imageViewTool);

        Intent intent = getIntent();
        textViewTitle.setText(intent.getStringExtra("title"));
        textViewInfo.setText(intent.getStringExtra("info"));
        imageViewTool.setImageResource(intent.getIntExtra("resId", 0));
    }
}