package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEditText;

    public void onclickBtn(View view){
        double amount = 0;
        if (!mEditText.getText().toString().equals(""))
            amount = Double.valueOf(mEditText.getText().toString());

        Toast.makeText(this, amount + "€ = " + amount*0.93 + "$"  , Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = findViewById(R.id.editText);
    }
}
