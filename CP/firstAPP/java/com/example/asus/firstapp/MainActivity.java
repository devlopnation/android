package com.example.asus.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView nameView ;
    TextView lastNameView ;
    TextView genderView ;
    TextView dataView ;
    Button submit ;
    Button clear ;
    EditText nameET ;
    EditText lastNameET ;
    EditText genderET ;
    String data = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameView = (TextView) findViewById(R.id.textView5);
        lastNameView = (TextView) findViewById(R.id.textView3);
        genderView = (TextView) findViewById(R.id.textView4);
        dataView = (TextView) findViewById(R.id.textView);
        submit = (Button) findViewById(R.id.button);
        clear = (Button) findViewById(R.id.button2);
        nameET = (EditText) findViewById(R.id.editText2);
        lastNameET = (EditText) findViewById(R.id.editText3);
        genderET = (EditText) findViewById(R.id.editText);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Submit();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();
            }
        });

    }

    public void Submit(){
        UserModel model = new UserModel();
        model.setName(nameET.getText().toString());
        model.setLastName(lastNameET.getText().toString());
        model.setGender(genderET.getText().toString());
        data = "Name : " + model.getName() + "\n" +
                "Last Name : " + model.getLastName() + "\n" +
                "Gender : " + model.getGender() ;
        if(isValid(model.getGender()) && isValid(model.getLastName())  &&isValid(model.getName())){
            dataView.setText(data);
        }else {
            Toast.makeText(MainActivity.this,"Enter The details " ,Toast.LENGTH_SHORT).show();
        }

    }
    public void Clear(){
        nameET.setText("");
        lastNameET.setText("");
        genderET.setText("");
        dataView.setText("");
    }

    public boolean isValid(String object){
        boolean valid = false;
        if(object!=null && object.length() >0){
            valid = true;
        }
        return valid;
    }
}
