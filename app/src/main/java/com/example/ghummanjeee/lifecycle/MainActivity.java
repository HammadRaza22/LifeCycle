package com.example.ghummanjeee.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "ONCREATE", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("start", "onStart");
        Toast.makeText(this, "ONSTART", Toast.LENGTH_SHORT).show();
    }

    protected void onPause(){
        super.onPause();
        Log.e("Pause","onPause");
        Toast.makeText(this, "ONPAUSE", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "ONRESUME", Toast.LENGTH_SHORT).show();
    }

    protected void onRestart(){
        super.onRestart();
        Log.e("Restart","onRestart");
        Toast.makeText(this, "ONRESTART", Toast.LENGTH_SHORT).show();
    }
    protected void onStop(){
        super.onStop();
        Log.e("stop","onStop");
        Toast.makeText(this, "ONSTOP", Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Destroy","onDestroy");
        Toast.makeText(this, "ONDESTROY", Toast.LENGTH_SHORT).show();
    }

}
