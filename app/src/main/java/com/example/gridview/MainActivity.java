package com.example.gridview;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
public class MainActivity extends AppCompatActivity {
    int[] cimages = {R.drawable.baseline_airplane_ticket_24,R.drawable.baseline_airplay_24,
            R.drawable.baseline_apartment_24,R.drawable.baseline_attach_money_24,
            R.drawable.baseline_bubble_chart_24,R.drawable.baseline_color_lens_24,
            R.drawable.baseline_currency_bitcoin_24,R.drawable.baseline_explore_24,
            R.drawable.baseline_fastfood_24,R.drawable.baseline_forest_24 };
    String[] country;
    GridView gridView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        country = getResources().getStringArray(R.array.countryNames);

        gridView = findViewById(R.id.gridview1);

        CustomAdapter adapter = new CustomAdapter(this,country , cimages);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long l) {
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("countries" , country[position]);
                startActivity(i);

            }
        });


    }


}