package com.dev5151.acmchallenge2.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.dev5151.acmchallenge2.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DhaneshActivityWrite extends AppCompatActivity {
    Button submitButton;
    Button seeEntriesButton;
    LinearLayout linearLayout;
    CoordinatorLayout coordinatorLayout;
    String mName;
    String mUsername;
    String mEmailId;
    String mAge;
    String mCollege;
    String mBranch;
    String mRegNo;
    String mPhoneNo;
    TextInputEditText nameTextField, usernameTextField, emailTextField, ageTextField, collegeTextField, branchTextField, regTextField, phoneTextField;
    private DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhanesh_write);
        initialViews();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSubmit();

            }
        });
        seeEntriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DhaneshActivityWrite.this, DhaneshActivityRead.class));
            }
        });

    }

    private void WriteNewDetails(String name, String username, String emailId, String age, String college, String branch, String regno, String phoneno) {
        UserInfo user = new UserInfo(name, username, emailId, age, college, branch, regno, phoneno);
        mDatabase.child("User Details").push().setValue(user);
        Snackbar snackbar = Snackbar
                .make(linearLayout, "SUBMITTED", Snackbar.LENGTH_SHORT);
        snackbar.setBackgroundTint(Color.parseColor("#FF7200"));
        snackbar.show();

    }

    private void OnSubmit() {
        int k = 1;
        if (TextUtils.isEmpty(nameTextField.getText().toString())) {
            k = 0;
            nameTextField.setError("Required Field");
        }
        if (TextUtils.isEmpty(usernameTextField.getText().toString())) {
            k = 0;
            usernameTextField.setError("Required Field");
        }
        if (TextUtils.isEmpty(emailTextField.getText().toString())) {
            k = 0;
            emailTextField.setError("Required Field");
        }
        if (TextUtils.isEmpty(ageTextField.getText().toString())) {
            k = 0;
            ageTextField.setError("Required Field");
        }
        if (TextUtils.isEmpty(regTextField.getText().toString())) {
            k = 0;
            regTextField.setError("Required Field");
        }
        if (TextUtils.isEmpty(phoneTextField.getText().toString())) {
            k = 0;
            phoneTextField.setError("Required Field");
        }
        if (TextUtils.isEmpty(collegeTextField.getText().toString())) {
            k = 0;
            collegeTextField.setError("Required Field");
        }
        if (TextUtils.isEmpty(branchTextField.getText().toString())) {
            k = 0;
            branchTextField.setError("Required Field");
        }
        if (k == 1) {
            mName = nameTextField.getText().toString();
            mUsername = usernameTextField.getText().toString();
            mEmailId = emailTextField.getText().toString();
            mAge = ageTextField.getText().toString();
            mRegNo = regTextField.getText().toString();
            mCollege = collegeTextField.getText().toString();
            mBranch = branchTextField.getText().toString();
            mPhoneNo = phoneTextField.getText().toString();
            WriteNewDetails(mName, mUsername, mEmailId, mAge, mCollege, mBranch, mRegNo, mPhoneNo);
            nameTextField.getText().clear();
            usernameTextField.getText().clear();
            emailTextField.getText().clear();
            ageTextField.getText().clear();
            regTextField.getText().clear();
            collegeTextField.getText().clear();
            branchTextField.getText().clear();
            phoneTextField.getText().clear();
        } else {
            Snackbar snackbar = Snackbar
                    .make(linearLayout, "FILL ALL THE FIELDS", Snackbar.LENGTH_SHORT);
            snackbar.setBackgroundTint(Color.parseColor("#FF0000"));
            snackbar.show();
        }


    }

    private void initialViews() {
        linearLayout = (LinearLayout) findViewById(R.id.linear);
        submitButton = findViewById(R.id.submit_button);
        seeEntriesButton = findViewById(R.id.see_entries);
        nameTextField = findViewById(R.id.name);
        usernameTextField = findViewById(R.id.username);
        ageTextField = findViewById(R.id.age);
        emailTextField = findViewById(R.id.email);
        collegeTextField = findViewById(R.id.collegename);
        branchTextField = findViewById(R.id.branch);
        regTextField = findViewById(R.id.regno);
        phoneTextField = findViewById(R.id.phone);


    }


}
