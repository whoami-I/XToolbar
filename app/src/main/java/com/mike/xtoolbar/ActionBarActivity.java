package com.mike.xtoolbar;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ActionBarActivity extends AppCompatActivity {

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Title");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case android.R.id.home:
                finish();
                break;
            case R.id.delete:
                Toast.makeText(this, "click delete", Toast.LENGTH_SHORT).show();
                break;
            case R.id.share:
                Toast.makeText(this, "click share", Toast.LENGTH_SHORT).show();
                break;
            case R.id._1:
                Toast.makeText(this, "click 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id._2:
                Toast.makeText(this, "click 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id._3:
                Toast.makeText(this, "click 3", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.clear();
        getMenuInflater().inflate(R.menu.more, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
