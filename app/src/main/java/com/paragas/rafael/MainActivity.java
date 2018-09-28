package com.paragas.rafael;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);

    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnAct2) {
            i = new Intent(this, Main2Activity.class);
            startActivity(i);
        }
        else if (v.getId()==R.id.btnMap2){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.5943  + "," + 120.9705));
            chooser =  Intent.createChooser(i, "Choose A Map APP");
            startActivity(chooser);
      }
    }
}