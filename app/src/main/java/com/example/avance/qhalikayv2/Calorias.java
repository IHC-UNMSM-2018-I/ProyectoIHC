package com.example.avance.qhalikayv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Calorias extends AppCompatActivity implements View.OnClickListener {
    private ImageView imagen1;
    private TextView vegetales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calorias);

        imagen1 = (ImageView)findViewById(R.id.brocoli);
        imagen1.setOnClickListener(this);

        vegetales = (TextView)findViewById(R.id.vegetalesMas);
        vegetales.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.vegetalesMas : Intent intent = new Intent(this, Vegetales.class);
                                     startActivity(intent);
                                     break;
            case R.id.brocoli :   Intent intent2 = new Intent(this, Vegetales.class);
                                  startActivity(intent2);
                                  break;
        }
    }
}
