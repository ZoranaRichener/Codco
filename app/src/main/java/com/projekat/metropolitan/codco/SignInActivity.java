package com.projekat.metropolitan.codco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.app.AlertDialog;
import android.database.Cursor;
import android.widget.Toast;


public class SignInActivity extends AppCompatActivity {

    DataBaseHelper myDb;
    EditText editName, editSurname, editUsername, editPassword;
    Button btnAddData;
    Button btnShow;
    Button btnDelete;
    Button btnUpdate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        editName = (EditText) findViewById(R.id.et_name);
        editSurname = (EditText) findViewById(R.id.et_surname);
        editUsername = (EditText) findViewById(R.id.et_username);
        editPassword = (EditText) findViewById(R.id.et_password);
        btnAddData = (Button) findViewById(R.id.buttonRegister);
        btnUpdate = (Button) findViewById(R.id.button_edit);
        btnDelete = (Button) findViewById(R.id.button_delete);
        btnShow = (Button) findViewById(R.id.buttonShow);


        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this,WelcomeSignIn.class);
                startActivity(intent);
            }
        });

       // AddData();
      /*  viewAll();
        UpdateData();
        DeleteData(); */



    }
   /* public void DeleteData() {
        btnDelete.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer deletedRows = myDb.deleteData(editUsername.getText().toString());
                        if(deletedRows > 0)
                            Toast.makeText(SignInActivity.this,"Uspesno brisanje",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(SignInActivity.this,"Neuspesno brisanje",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
    public void UpdateData() {
        btnUpdate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isUpdate = myDb.updateData(editUsername.getText().toString(),
                                editName.getText().toString(),
                                editSurname.getText().toString(),
                                editUsername.getText().toString(),
                                editPassword.getText().toString());
                        if(isUpdate == true)
                            Toast.makeText(SignInActivity.this,"Uspesno azuriranje",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(SignInActivity.this,"Azuriranje neuspesno",Toast.LENGTH_LONG).show();
                    }
                }
        );
    } */
  /*  public  void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(
                                editName.getText().toString(),
                                editSurname.getText().toString(),
                                editUsername.getText().toString() ,
                                editPassword.getText().toString());
                        if(isInserted == true)
                            Toast.makeText(SignInActivity.this,"Uspesan unos",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(SignInActivity.this,"Neuspesan unos",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }



    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

*/



}



