package com.kalcn.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.btnBMI);
        btn.setOnClickListener(listener);

    }

    View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View view) {
            EditText height = (EditText)findViewById(R.id.edtHeight);
            EditText weight = (EditText)findViewById(R.id.edtWeight);
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, Main2Activity.class);
            Bundle bundle = new Bundle();
            bundle.putString("HEIGHT",height.getText().toString());
            bundle.putString("WEIGHT",weight.getText().toString());
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };
}
