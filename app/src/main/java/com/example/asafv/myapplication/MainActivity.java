package com.example.asafv.myapplication;

import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    static String savedTAG = "";
    static int savedID = 0;
    static boolean secondClick = false;
    final String TAG = "exe1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "d-onCreate");
        Log.e(TAG, "e-onCreate");
        Log.v(TAG, "v-onCreate");
        Log.w(TAG, "w-onCreate");

    }

    public void mainFunc(View view) {

        //insert test for already marked tile

        //if()
        
        if (!secondClick) {
            savedTAG = view.findViewById(view.getId()).getTag().toString();
            savedID = view.getId();
            secondClick = !secondClick;

            Log.d(TAG, savedTAG);
            view.findViewWithTag(savedTAG).setBackgroundColor(Color.YELLOW);
        } else {
            if(view.getId()!=savedID) {                                                     //test for same tile
                if (view.findViewById(view.getId()).getTag().toString() == savedTAG) {      //test for same tag
                    Log.d(TAG, view.findViewById(view.getId()).getTag().toString());
                    ImageButton img1 = (ImageButton)findViewById(savedID);
                    ImageButton img2 = (ImageButton)findViewById(view.getId());

                    img1.setImageResource(R.mipmap.ic_star);
                    img2.setImageResource(R.mipmap.ic_star);
                    //img1.setAnimation(Animation.REVERSE);
                    findViewById(savedID).setBackgroundColor(Color.LTGRAY);
                    findViewById(view.getId()).setBackgroundColor(Color.LTGRAY);
                } else {
                    try {
                        Log.e(TAG, findViewById(view.getId()).getTag().toString() + " != " + savedTAG);
                        findViewById(savedID).setBackgroundColor(Color.LTGRAY);
                        findViewById(view.getId()).setBackgroundColor(Color.LTGRAY);
                    } catch (Exception e) {
                        Log.e(TAG, e.getMessage() + " --- ID = " + savedTAG);
                    }

                }
                savedID = 0;
                savedTAG = "";
                secondClick = !secondClick;
            }else{
                Log.e(TAG, "Cannot select the same tile twice. try again");

            }




        }

    }

    public void btn2Click() {
        Log.d(TAG, "Clicked!");

    }

    @Override
    protected void onStart() {

        Log.d(TAG, "d-onStart");
        super.onStart();
    }

    @Override
    protected void onPause() {

        Log.d(TAG, "d-onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {

        Log.d(TAG, "d-onResume");
        super.onResume();
    }

    @Override
    protected void onStop() {

        Log.d(TAG, "d-onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {

        Log.d(TAG, "d-onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "d-onDestroy");
        super.onDestroy();
    }
}
