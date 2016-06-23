package com.example.hackmobile.imageroll;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Create an instance of the dialog fragment
        DialogFragment newDialog = new MyDialogFragment();
        newDialog.show (getSupportFragmentManager(), "mydialog");
        // Show dialog
    }
}
