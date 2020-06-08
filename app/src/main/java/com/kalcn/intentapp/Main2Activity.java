package com.kalcn.intentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        calBMI();
    }

    private void calBMI() {
        double height,weight,bmi;
        Bundle bundle = this.getIntent().getExtras();
        if(bundle !=null){
            height = Double.parseDouble(bundle.getString("HEIGHT"));
            weight = Double.parseDouble(bundle.getString("WEIGHT"));
            height = height/100.00;
            bmi =weight/(height*height);
            TextView result = (TextView)findViewById(R.id.txvBMI);
            result.setText("BMI = " + Double.toString(bmi));
        }
    }

    public void btnClose(View view) {
        finish();
    }
}
