# HelloWorld_ActivityLife
HelloWorld and ActivityLife
~~~
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView6"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="TextView" />
</LinearLayout>
~~~
## 了解Activity生命周期（和简单的hello world ）

~~~
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
© 2019 GitHub, Inc.
~~~

## ![Image text](https://github.com/1158509577/HelloWorld_ActivityLife/blob/master/image/result.png)
