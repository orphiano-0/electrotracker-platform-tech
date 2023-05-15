package com.example.electrotrackerv2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class B2ProfileFragment extends Fragment {

    TextView NAME, EMAIL, USERNAME;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b2_profile, container, false);

        NAME = view.findViewById(R.id.profName);
        EMAIL = view.findViewById(R.id.profEmail);
        USERNAME = view.findViewById(R.id.profUsername);


        return view;

    }

}


