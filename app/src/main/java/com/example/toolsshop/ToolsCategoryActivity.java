package com.example.toolsshop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class ToolsCategoryActivity extends AppCompatActivity {

    private ArrayList<Drill> drills;
    private ArrayList<Perforator> perforators;
    private ArrayList<GrinderTool> grinderTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        int key = intent.getIntExtra("keyPosition", 0);

        setContentView(R.layout.activity_tool_category);
        ListView listViewDrills = findViewById(R.id.listViewDrills);
        ImageView image = findViewById(R.id.imageViewTool);


        drills = new ArrayList<>();

        drills.add(new Drill(getString(R.string.drill_interskol_title), getString(R.string.drill_interskol_info), R.drawable.interskol));
        drills.add(new Drill(getString(R.string.drill_makita_title), getString(R.string.drill_makita_info), R.drawable.makita));
        drills.add(new Drill(getString(R.string.drill_dewalt_title), getString(R.string.drill_dewalt_info), R.drawable.dewalt));
        ArrayAdapter<Drill> adapterDrill = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, drills);

        perforators = new ArrayList<>();

        perforators.add(new Perforator(getString(R.string.perforator_denzel_title), getString(R.string.perforator_denzel_info), R.drawable.denzel));
        perforators.add(new Perforator(getString(R.string.perforator_kalibr_title), getString(R.string.perforator_kalibr_info), R.drawable.kalibr));
        perforators.add(new Perforator(getString(R.string.perforator_ryobi_title), getString(R.string.perforator_ryobi_info), R.drawable.ryobi));
        ArrayAdapter<Perforator> adapterPerforator = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, perforators);

        grinderTools = new ArrayList<>();

        grinderTools.add(new GrinderTool(getString(R.string.grinderTool_vihr_title), getString(R.string.grinderTool_vihr_info), R.drawable.vihr));
        grinderTools.add(new GrinderTool(getString(R.string.grinderTool_bosch_title), getString(R.string.grinderTool_bosch_info), R.drawable.bosch));
        grinderTools.add(new GrinderTool(getString(R.string.grinderTool_metabo_title), getString(R.string.grinderTool_metabo_info), R.drawable.metabo));
        ArrayAdapter<GrinderTool> adapterGrinderTool = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, grinderTools);


        switch (key) {
            case 0:
                image.setImageResource(R.drawable.drill);
                listViewDrills.setAdapter(adapterDrill);
                break;
            case 1:
                image.setImageResource(R.drawable.perforator);
                listViewDrills.setAdapter(adapterPerforator);
                break;
            case 2:
                image.setImageResource(R.drawable.grind);
                listViewDrills.setAdapter(adapterGrinderTool);
                break;
            default:
                break;
        }


        listViewDrills.setOnItemClickListener((parent, view, position, id) -> {

            Intent intent1 = new Intent(getApplicationContext(), ToolsDetailActivity.class);

            switch (key) {
                case 0:
                    Drill drill = drills.get(position);
                    intent1.putExtra("title", drill.getTitle());
                    intent1.putExtra("info", drill.getInfo());
                    intent1.putExtra("resId", drill.getImageResourceId());
                    break;
                case 1:
                    Perforator perforator = perforators.get(position);
                    intent1.putExtra("title", perforator.getTitle());
                    intent1.putExtra("info", perforator.getInfo());
                    intent1.putExtra("resId", perforator.getImageResourceId());
                    break;
                case 2:
                    GrinderTool grinderTool = grinderTools.get(position);
                    intent1.putExtra("title", grinderTool.getTitle());
                    intent1.putExtra("info", grinderTool.getInfo());
                    intent1.putExtra("resId", grinderTool.getImageResourceId());
                    break;
                default:
                    break;
            }

            startActivity(intent1);
        });
    }
}