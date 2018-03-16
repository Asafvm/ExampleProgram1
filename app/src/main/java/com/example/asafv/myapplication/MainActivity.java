package com.example.asafv.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    final String TAG = "exe1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG, "d-onCreate");
        Log.e(TAG, "e-onCreate");
        Log.v(TAG, "v-onCreate");
        Log.w(TAG, "w-onCreate");

        Button btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener();



    }


    public void btn2Click(){
        Log.d(TAG, "Clicked!");

    }
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
