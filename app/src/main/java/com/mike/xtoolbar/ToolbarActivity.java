package com.mike.xtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ToolbarActivity extends AppCompatActivity {

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle("Title");
        mToolbar.inflateMenu(R.menu.more);
        final Context mContext = this;
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int itemId = item.getItemId();
                switch (itemId) {
                    case R.id.delete:
                        Toast.makeText(mContext, "click delete", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.share:
                        Toast.makeText(mContext, "click share", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id._1:
                        Toast.makeText(mContext, "click 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id._2:
                        Toast.makeText(mContext, "click 2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id._3:
                        Toast.makeText(mContext, "click 3", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
