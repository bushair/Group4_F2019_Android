package com.example.group4_f2019_mad3125_fp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.graphics.Color;
import android.content.Intent;
import android.content.DialogInterface;
import android.content.*;
import android.widget.CompoundButton;
public class MainActivity extends  AppCompatActivity  {
    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;
    public static  final String KEY_NAME="name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsername=findViewById(R.id.edt_UserName);
        edtPassword=findViewById(R.id.edt_Password);
        btnLogin=findViewById(R.id.btn_Login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtUsername.getText().toString().trim().equals("user@employee.com") && edtPassword.getText().toString().trim().equals("s3cr3t")){
                    Intent nintent=new Intent(MainActivity.this,ThirdActivity.class);
                    startActivity(nintent);
                }
                else{
                
        });

    }  public void showAlert()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Login error");


       // alertDialogBuilder.setNegativeButtonIcon(getResources().getDrawable(R.drawable.ic_launcher_foreground));
        AlertDialog mAlertDialog=alertDialogBuilder.create();
        mAlertDialog.show();
    }
}