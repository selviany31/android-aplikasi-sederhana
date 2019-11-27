package com.selviany.belajar.aseanprofiles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About");
        }
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode (int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                Intent listItem = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(listItem);
                break;
            case R.id.action_about:
                //Intent intent = new Intent(AboutActivity.this, AboutActivity.class);
                //startActivity(intent);
                break;
            default:
        }
    }
}
