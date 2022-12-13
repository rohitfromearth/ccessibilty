package com.example.ccessibilty;

import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exter_perm(View view ){
        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{WRITE_EXTERNAL_STORAGE},
                1);

    }
    public void access_ser(View view ){
        startActivity(new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS));

    }

}