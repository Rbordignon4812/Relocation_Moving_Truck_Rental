package com.example.relocation_moving_truck_rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.EditText;
import android.widget.ImageView;

import java.text.DecimalFormat;

public class Final_Cost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final__cost);
        EditText truckTotal= (EditText) findViewById(R.id.totalResult);
        ImageView image= (ImageView) findViewById(R.id.truckPic);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        int truckSize = sharedPref.getInt("key1",0);
        int miles = sharedPref.getInt("key2",0);

        if(truckSize == 10){
            double truckCost = 19.95;
            float totalMiles = (float)(miles *0.99);
            float totalCost = (float)(truckCost + totalMiles);
            DecimalFormat currency = new DecimalFormat("$###,###.##");
            truckTotal.setText(currency.format(totalCost));
            image.setImageResource(R.drawable.tenfoot);
        }
        else if(truckSize == 17){
            double truckCost = 29.95;
            float totalMiles = (float)(miles *0.99);
            float totalCost = (float)(truckCost + totalMiles);
            DecimalFormat currency = new DecimalFormat("$###,###.##");
            truckTotal.setText(currency.format(totalCost));
            image.setImageResource(R.drawable.seventeenfoot);
        }
        else if(truckSize == 26){
            double truckCost = 39.95;
            float totalMiles = (float)(miles *0.99);
            float totalCost = (float)(truckCost + totalMiles);
            DecimalFormat currency = new DecimalFormat("$###,###.##");
            truckTotal.setText(currency.format(totalCost));
            image.setImageResource(R.drawable.twentysixfoot);
        }

    }
}
