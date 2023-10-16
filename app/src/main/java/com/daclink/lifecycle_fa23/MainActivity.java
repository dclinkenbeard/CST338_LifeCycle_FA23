package com.daclink.lifecycle_fa23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daclink.lifecycle_fa23.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG =  "LifeCycleDemo";

    Button button;
    TextView mTextView;
    boolean m1 = true;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate(Bundle) called");

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();
        setContentView(view);

        button = binding.button;
        mTextView = binding.textView;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (m1){
                    mTextView.setText(R.string.message2);
                    m1 = false;
                } else {
                    mTextView.setText(R.string.message1);
                    m1 = true;
                }
            }
        });
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }
}

