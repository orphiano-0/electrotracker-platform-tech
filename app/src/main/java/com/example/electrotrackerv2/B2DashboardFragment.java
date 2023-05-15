package com.example.electrotrackerv2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class B2DashboardFragment extends Fragment {

    Button gotoCalculate;

    ImageView ref,  gadget, efan, acon,tv, bulb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_b2_dashboard, container, false);

        ///////////////////////////////////////////
        // desktop = 225;     // Desktop Computer//
        // lights = 21;       // Lights          //
        // aircon = 1252;     // Air Conditioner //
        // refri = 170;       // Refrigerator    //
        // elecfan = 74;      // Electric fan    //
        // television = 180;  // Television      //
        ///////////////////////////////////////////

        gotoCalculate = rootView.findViewById(R.id.toCalculate);
        gotoCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new B2CalculateFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        ref =  rootView.findViewById(R.id.img_ref);
        ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               android.app.AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Refrigerator")
                        .setMessage("An open system that dispels heat from a closed space to a warmer area, usually a kitchen or another room. By dispelling the heat from this area, " +
                                "it decreases in temperature, allowing food and other items to remain at a cool temperature. It consumes 170 watts per hour.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Handle OK button click
                            }
                        })
                        .show();

            }
        });

        gadget=  rootView.findViewById(R.id.img_gadget);
        gadget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.app.AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Desktop Computer")
                        .setMessage("an electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program. " +
                                "It consumes 225 watts per hour.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Handle OK button click
                            }
                        })
                        .show();

            }
        });


        bulb =  rootView.findViewById(R.id.img_light);
        bulb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.app.AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Lighting")
                        .setMessage("The glass part of an electric lamp, which gives out light when electricity passes through it. The bulb can consume" +
                                " 21 watts per hour.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Handle OK button click
                            }
                        })
                        .show();

            }
        });


        tv =  rootView.findViewById(R.id.img_tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.app.AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Television")
                        .setMessage("an electronic system of transmitting transient images of fixed or moving objects together with sound over a wire or through space by apparatus that converts " +
                                "light and sound into electrical waves and reconverts them into visible light rays and audible sound. It consumes 180 watts per hour.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Handle OK button click
                            }
                        })

                        .show();
            }
        });

        acon = rootView.findViewById(R.id.img_aircon);
        acon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.app.AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Air Conditioner"  )
                        .setMessage("It provides cold air inside your home or enclosed space by actually removing heat and humidity from the indoor air. It returns the cooled air to the indoor space, and transfers the unwanted heat and humidity outside. It consumes 1252 watts per hour and has a horse" +
                                "horse power of 1.5")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Handle OK button click
                            }
                        })
                        .show();
            }
        });


        efan=  rootView.findViewById(R.id.img_efan);
        efan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.app.AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setTitle("Electric Fan")
                        .setMessage("A motor that moves blades that are attached to a central rotating hub. Most electric fans can consume 74 watts energy per hour. " )
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Handle OK button click
                            }
                        })
                        .show();

            }
        });




        return rootView;
    }
}