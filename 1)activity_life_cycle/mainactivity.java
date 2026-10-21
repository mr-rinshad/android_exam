
package com.example.lifecycle;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ActivityLifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMessage("onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showMessage("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showMessage("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showMessage("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showMessage("onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showMessage("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showMessage("onDestroy()");
    }

    private void showMessage(String message) {
        Log.d(TAG, message);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
