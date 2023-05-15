package com.example.electrotrackerv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class C1ResultPage extends AppCompatActivity  {

    int num1, num2;
    private Button btnBack, btnHome;

    TextView KWHtotal, PricesPerUnit;

    String finalKWH, finalPDay, finalPWeek, finalPMonth, finalPYear;

    Button tocustomerpage;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_result_page);

        finalKWH = getIntent().getExtras().getString("calcKWH");
        finalPDay = getIntent().getExtras().getString("calcPDay");
        finalPWeek = getIntent().getExtras().getString("calcPWeek");
        finalPMonth = getIntent().getExtras().getString("calcPMonth");
        finalPYear = getIntent().getExtras().getString("calcPYear");

        tocustomerpage = findViewById(R.id.toCustomerP);

        KWHtotal = findViewById(R.id.resultKwatt);
        PricesPerUnit = findViewById(R.id.resultBill);


        KWHtotal.setText("Total Kilowatts per Hour: " + "\n"+ finalKWH + "KWh");
        PricesPerUnit.setText("Total Amount of Bill: \n"
                  +"Price per Day: Php"  +finalPDay + "\n"
                +"Price per Week: Php"  +finalPWeek + "\n"
                +"Price per Month: Php"  +finalPMonth + "\n"
                +"Price per Year: Php"  +finalPYear);



        tocustomerpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1ResultPage.this, B1CustomerPage.class);
                startActivity(intent);
            }
        });



    }
    }
