package com.example.relocation_moving_truck_rental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Rent_the_Truck extends AppCompatActivity {
    int miles;
    int intTruckSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_the__truck);
        final EditText truckSize=(EditText) findViewById(R.id.trucksizeTXT);
        final EditText milesEntered=(EditText) findViewById(R.id.milesTxt);
        final SharedPreferences SharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        Button button2 =(Button) findViewById(R.id.calculate);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                intTruckSize = Integer.parseInt(truckSize.getText().toString());
                miles = Integer.parseInt(milesEntered.getText().toString());
                if(intTruckSize != 10 ){
                    if(intTruckSize != 17){
                        if(intTruckSize != 26){
                            Toast.makeText(Rent_the_Truck.this,"sorry! This size isn't available\nplease choose 10', 17', or 26'",Toast.LENGTH_LONG).show();
                        }
                    }
                }
                else {

                    SharedPreferences.Editor editor = SharedPref.edit();
                    editor.putInt("key1", intTruckSize);
                    editor.putInt("key2", miles);
                    editor.commit();
                    startActivity(new Intent(Rent_the_Truck.this,Final_Cost.class));
                }
            }
        });
    }
}
