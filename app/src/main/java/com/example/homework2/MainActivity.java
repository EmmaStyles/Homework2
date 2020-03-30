package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private TextView mTv;
    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs3634.beers.MESSAGE";
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.btnView);
        mTv = findViewById(R.id.tvViewRestaurants);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                launchDetailActivity("DetailActivity");
            }
        });

    }

    private void launchDetailActivity(String message){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume Called");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop Called");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause Called");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy Called");
    }

}
