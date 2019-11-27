package com.selviany.belajar.aseanprofiles;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_ASEAN = "extra_asean";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail");
        }


        ImageView imageView = findViewById(R.id.img_detail);
        TextView country = findViewById(R.id.tv_country_detail);
        TextView date = findViewById(R.id.date_detail);
        TextView capital = findViewById(R.id.capital_name);
        TextView land = findViewById(R.id.land_detail);
        TextView population = findViewById(R.id.population_detail);
        TextView language = findViewById(R.id.language_detail);
        TextView currency = findViewById(R.id.currency_detail);
        TextView desc = findViewById(R.id.tv_item_desc);

        Asean asean = getIntent().getParcelableExtra(EXTRA_ASEAN);

        Glide.with(this).load(asean.getImages()).into(imageView);
        country.setText(asean.getCountry());
        date.setText(asean.getDate());
        capital.setText(asean.getCapital());
        land.setText(asean.getLand());
        population.setText(asean.getPopulation());
        language.setText(asean.getLanguage());
        currency.setText(asean.getCurrency());
        desc.setText(asean.getDesc());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                Intent listItem = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(listItem);
                break;
            case R.id.action_about:
                Intent intent = new Intent(DetailActivity.this, AboutActivity.class);
                startActivity(intent);
                break;
            default:
        }
    }


}
