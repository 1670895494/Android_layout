package com.example.a11585.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d("MainActivityLife","调用onCreate");
        }
        @Override
        protected void onStart(){
            super.onStart();
            Log.d("MainActivityLife","调用onStart");
        }
        @Override
        protected void onResume(){
            super.onResume();
            Log.d("MainActivityLife","调用onResume");
        }
        @Override
        protected void onPause(){
            super.onPause();
            Log.d("MainActivityLife","调用onPause");
        }
        @Override
        protected void onStop(){
            super.onStop();
            Log.d("MainActivityLife","调用onStop");

        }
        protected void onDestroy(){
            super.onDestroy();
            Log.d("MainActivityLife","调用onDestroy");

        }
        protected void onRestart(){
            super.onRestart();
            Log.d("MainActivityLife","调用onRestart");

        }

    }
