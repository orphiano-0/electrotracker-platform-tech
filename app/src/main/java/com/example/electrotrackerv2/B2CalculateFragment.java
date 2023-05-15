package com.example.electrotrackerv2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.electrotrackerv2.databinding.ActivityC1ResultPageBinding;

import java.text.DecimalFormat;

public class B2CalculateFragment extends Fragment {

    Activity context;

    Button inc1, inc2,inc3, inc4, inc5, inc6, inc7, inc8, inc9, inc10, inc11, inc12;
    Button  dec1, dec2, dec3, dec4, dec5, dec6, dec7, dec8, dec9, dec10, dec11, dec12;

    Button calculateAll;
    TextView txtD1, txtD2, txtD3, txtD4, txtD5, txtD6, txtD7, txtD8, txtD9, txtD10, txtD11, txtD12;

    int desktop, lights, aircon, refri, elecfan, television;

    String resKWH, resPDay, resPWeek, resPMonth, resPYear;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b2_calculate, container, false);


        inc1 = view.findViewById(R.id.incrementBtn1);
        dec1 = view.findViewById(R.id.decrementBtn1);
        txtD1 = view.findViewById(R.id.txtDisplay1);

        inc2 = view.findViewById(R.id.incrementBtn2);
        dec2 = view.findViewById(R.id.decrementBtn2);
        txtD2 = view.findViewById(R.id.txtDisplay2);

        inc3 = view.findViewById(R.id.incrementBtn3);
        dec3 = view.findViewById(R.id.decrementBtn3);
        txtD3 = view.findViewById(R.id.txtDisplay3);

        inc4 = view.findViewById(R.id.incrementBtn4);
        dec4 = view.findViewById(R.id.decrementBtn4);
        txtD4 = view.findViewById(R.id.txtDisplay4);

        inc5 = view.findViewById(R.id.incrementBtn5);
        dec5 = view.findViewById(R.id.decrementBtn5);
        txtD5 = view.findViewById(R.id.txtDisplay5);

        inc6 = view.findViewById(R.id.incrementBtn6);
        dec6 = view.findViewById(R.id.decrementBtn6);
        txtD6 = view.findViewById(R.id.txtDisplay6);

        inc7 = view.findViewById(R.id.incrementBtn7);
        dec7 = view.findViewById(R.id.decrementBtn7);
        txtD7 = view.findViewById(R.id.txtDisplay7);

        inc8 = view.findViewById(R.id.incrementBtn8);
        dec8 = view.findViewById(R.id.decrementBtn8);
        txtD8 = view.findViewById(R.id.txtDisplay8);

        inc9 = view.findViewById(R.id.incrementBtn9);
        dec9 = view.findViewById(R.id.decrementBtn9);
        txtD9 = view.findViewById(R.id.txtDisplay9);

        inc10 = view.findViewById(R.id.incrementBtn10);
        dec10 = view.findViewById(R.id.decrementBtn10);
        txtD10 = view.findViewById(R.id.txtDisplay10);

        inc11 = view.findViewById(R.id.incrementBtn11);
        dec11 = view.findViewById(R.id.decrementBtn11);
        txtD11 = view.findViewById(R.id.txtDisplay11);

        inc12 = view.findViewById(R.id.incrementBtn12);
        dec12 = view.findViewById(R.id.decrementBtn12);
        txtD12 = view.findViewById(R.id.txtDisplay12);


//////////////////////////////////////////////////////////////// 1
        inc1.setOnClickListener(v -> {
            String currentValue = txtD1.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            txtD1.setText(String.valueOf(value));
        });

        dec1.setOnClickListener(v -> {
            String currentValue = txtD1.getText().toString();
            int value = Integer.parseInt(currentValue);
            if (value > 0){
                value--;
                txtD1.setText(String.valueOf(value));
            } else{}
        });
////////////////////////////////////////////////////////////////// 2
        inc2.setOnClickListener(v -> {
            String currentValue = txtD2.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            txtD2.setText(String.valueOf(value));
        });

        dec2.setOnClickListener(v -> {
            String currentValue = txtD2.getText().toString();
            int value = Integer.parseInt(currentValue);
            if (value > 0){
                value--;
                txtD2.setText(String.valueOf(value));
            } else{}
        });
//////////////////////////////////////////////////////////////////// 3
        inc3.setOnClickListener(v -> {
            String currentValue = txtD3.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            txtD3.setText(String.valueOf(value));
        });

        dec3.setOnClickListener(v -> {
            String currentValue = txtD3.getText().toString();
            int value = Integer.parseInt(currentValue);
            if (value > 0){
                value--;
                txtD3.setText(String.valueOf(value));
            } else{}
        });
///////////////////////////////////////////////////////////////////// 4
        inc4.setOnClickListener(v -> {
            String currentValue = txtD4.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            txtD4.setText(String.valueOf(value));
        });

        dec4.setOnClickListener(v -> {
            String currentValue = txtD4.getText().toString();
            int value = Integer.parseInt(currentValue);
            if (value > 0){
                value--;
                txtD4.setText(String.valueOf(value));
            } else{}
        });
////////////////////////////////////////////////////////////////////// 5
        inc5.setOnClickListener(v -> {
            String currentValue = txtD5.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            txtD5.setText(String.valueOf(value));
        });

        dec5.setOnClickListener(v -> {
            String currentValue = txtD5.getText().toString();
            int value = Integer.parseInt(currentValue);
            if (value > 0){
                value--;
                txtD5.setText(String.valueOf(value));
            } else{}
        });
////////////////////////////////////////////////////////////////////// 6
        inc6.setOnClickListener(v -> {
            String currentValue = txtD6.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            txtD6.setText(String.valueOf(value));
        });

        dec6.setOnClickListener(v -> {
            String currentValue = txtD6.getText().toString();
            int value = Integer.parseInt(currentValue);
            if (value > 0){
                value--;
                txtD6.setText(String.valueOf(value));
            } else{}
        });
////////////////////////////////////////////////////////////////////// 7
        inc7.setOnClickListener(v -> {
            String currentValue = txtD7.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            txtD7.setText(String.valueOf(value));
        });

        dec7.setOnClickListener(v -> {
            String currentValue = txtD7.getText().toString();
            int value = Integer.parseInt(currentValue);
            if (value > 0){
                value--;
                txtD7.setText(String.valueOf(value));
            } else{}
        });
/////////////////////////////////////////////////////////////////////// 8
        inc8.setOnClickListener(v -> {
            String currentValue = txtD8.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            txtD8.setText(String.valueOf(value));
        });

        dec8.setOnClickListener(v -> {
            String currentValue = txtD8.getText().toString();
            int value = Integer.parseInt(currentValue);
            if (value > 0){
                value--;
                txtD8.setText(String.valueOf(value));
            } else{}
        });
///////////////////////////////////////////////////////////////////////// 9
        inc9.setOnClickListener(v -> {
            String currentValue = txtD9.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            txtD9.setText(String.valueOf(value));
        });

        dec9.setOnClickListener(v -> {
            String currentValue = txtD9.getText().toString();
            int value = Integer.parseInt(currentValue);
            if (value > 0){
                value--;
                txtD9.setText(String.valueOf(value));
            } else{}
        });

///////////////////////////////////////////////////////////////////////// 10
        inc10.setOnClickListener(v -> {
            String currentValue = txtD10.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            txtD10.setText(String.valueOf(value));
        });

        dec10.setOnClickListener(v -> {
            String currentValue = txtD10.getText().toString();
            int value = Integer.parseInt(currentValue);
            if (value > 0){
                value--;
                txtD10.setText(String.valueOf(value));
            } else{}
        });
///////////////////////////////////////////////////////////////////////// 11
        inc11.setOnClickListener(v -> {
            String currentValue = txtD11.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            txtD11.setText(String.valueOf(value));
        });

        dec11.setOnClickListener(v -> {
            String currentValue = txtD11.getText().toString();
            int value = Integer.parseInt(currentValue);
            if (value > 0){
                value--;
                txtD11.setText(String.valueOf(value));
            } else{}
        });
///////////////////////////////////////////////////////////////////////// 12
        inc12.setOnClickListener(v -> {
            String currentValue = txtD12.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            txtD12.setText(String.valueOf(value));
        });

        dec12.setOnClickListener(v -> {
            String currentValue = txtD12.getText().toString();
            int value = Integer.parseInt(currentValue);
            if (value > 0){
                value--;
                txtD12.setText(String.valueOf(value));
            } else{}
        });



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Wattage of Appliances////////////////
        desktop = 225;     // Desktop Computer//
        lights = 21;       // Lights          //
        aircon = 1252;     // Air Conditioner //
        refri = 170;       // Refrigerator    //
        elecfan = 74;      // Electric fan    //
        television = 180;  // Television      //
        ////////////////////////////////////////

        calculateAll = view.findViewById(R.id.calculateBtn);

        calculateAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double quantity1 = Integer.parseInt(txtD1.getText().toString());
                double hour1 = Integer.parseInt(txtD2.getText().toString());

                double quantity2 = Integer.parseInt(txtD3.getText().toString());
                double hour2 = Integer.parseInt(txtD4.getText().toString());

                double quantity3 = Integer.parseInt(txtD5.getText().toString());
                double hour3 = Integer.parseInt(txtD6.getText().toString());

                double quantity4 = Integer.parseInt(txtD7.getText().toString());
                double hour4 = Integer.parseInt(txtD8.getText().toString());

                double quantity5 = Integer.parseInt(txtD9.getText().toString());
                double hour5 = Integer.parseInt(txtD10.getText().toString());

                double quantity6 = Integer.parseInt(txtD11.getText().toString());
                double hour6 = Integer.parseInt(txtD12.getText().toString());


                double Desk = ((quantity1 * 225) * hour1) / 1000;
                double Lights = ((quantity2 * 21) * hour2) / 1000;
                double Aircon = ((quantity3 * 1252) * hour3) / 1000;
                double Refrigerator = ((quantity4 * 170) * hour4) / 1000;
                double ElectricFan = ((quantity5 * 74) * hour5) / 1000;
                double Television = ((quantity6 * 180) * hour6) / 1000;

                double totalKWh = Desk + Lights + Aircon + Refrigerator + ElectricFan + Television;

                // desktop = 225;     // Desktop Computer//
                // lights = 21;       // Lights          //
                // aircon = 1252;     // Air Conditioner //
                // refri = 170;       // Refrigerator    //
                // elecfan = 74;      // Electric fan    //
                // television = 180;  // Television      //

                double result = totalKWh * 11.4348;

                double perDay = result ;
                double perWeek = result * 7;
                double perMonth = result * 30;
                double perYear = result * 365;

                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                String strtotalKwh = decimalFormat.format(totalKWh);
                String strperDay = decimalFormat.format(perDay);
                String strperWeek = decimalFormat.format(perWeek);
                String strperMonth = decimalFormat.format(perMonth);
                String strperYear = decimalFormat.format(perYear);

//                  This is only for testing if the calculations are right
//                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
//                builder.setTitle("Your Electric Consumption Price")
//                        .setMessage("This is your price per Day: " + strperDay+ " Pesos\n"
//                        + "This is your price per Week: " + strperWeek + " Pesos\n"
//                        + "This is your price per Month: " + strperMonth + " Pesos\n"
//                        + "This is your price per Year: " + strperYear + " Pesos")
//                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                // Handle OK button click
//                            }
//                        })
//                        .show();

                Intent intent = new Intent(getActivity(),C1ResultPage.class);
                intent.putExtra("calcKWH", strtotalKwh);
                intent.putExtra("calcPDay", strperDay);
                intent.putExtra("calcPWeek", strperWeek);
                intent.putExtra("calcPMonth", strperMonth);
                intent.putExtra("calcPYear", strperYear);
                startActivity(intent);



            }
        });

     return view;

    }

}