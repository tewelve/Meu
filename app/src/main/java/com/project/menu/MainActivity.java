package com.project.menu;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.mymenu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_red){
            finish();
        }else if(id==R.id.action_green){
            Toast.makeText(this, "Settings Option", Toast.LENGTH_SHORT).show();
        }else if(id== R.id.action_blue){
            Toast.makeText(this, "Profile Clicked", Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}