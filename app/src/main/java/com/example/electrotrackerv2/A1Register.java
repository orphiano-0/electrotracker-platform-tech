package com.example.electrotrackerv2;

import static androidx.core.content.ContentProviderCompat.requireContext;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.electrotrackerv2.databinding.ActivityA1RegisterBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class A1Register extends AppCompatActivity {


    ActivityA1RegisterBinding binding;
    String userName, fullName, email, password;
    FirebaseDatabase db;
    DatabaseReference reference;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_register);



        binding = ActivityA1RegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userName = binding.userName.getText().toString();
                fullName = binding.fullName.getText().toString();
                email = binding.email.getText().toString();
                password = binding.password.getText().toString();


                if (!userName.isEmpty() && !fullName.isEmpty() && !email.isEmpty() && !password.isEmpty()){

                    A2User users = new A2User(userName, fullName, email, password);
                    db = FirebaseDatabase.getInstance();
                    reference =  db.getReference("Users"); // this will create a node for the database and that will ba called as Users
                    reference.child(userName).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            binding.userName.setText("");
                            binding.fullName.setText("");
                            binding.email.setText("");
                            binding.password.setText("");
                            Toast.makeText(A1Register.this, "Successfully Updated ", Toast.LENGTH_SHORT).show();;

                        }
                    });

                }


                // Alert Dialog that will display the requirements to login
                AlertDialog alertDialog = new AlertDialog.Builder(A1Register.this).create();
                alertDialog.setTitle("Don't forget your Login Details");
                alertDialog.setMessage("username: " + userName.toString() +"\n"
                        +"password: " + password.toString() );
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                gotoLP(); // Method for going to Login Page

                            }
                        });
                alertDialog.show();


            }
        });


        binding.gotoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoLP();
            }
        });




    }

    public void gotoLP(){
        Intent intent = new Intent(this, A1Login.class);
        startActivity(intent);
    }



}