package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Spinner spn;
    private EditText edtText;
    private Switch SwitchTODO;
    private Button BtnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtText=findViewById(R.id.edtText);
        BtnSubmit=findViewById(R.id.BtnSubmit);
        spn=findViewById(R.id.spn);
        SwitchTODO =findViewById(R.id.SwitchTODO);

    }

    public void btnSubmitOnClick(View view) {
            String name = edtText.getText().toString();
            String item=spn.getSelectedItem().toString();
        Boolean switchState = SwitchTODO.isChecked();

            String msg= " Name " +name +"\n" + " Item" + item ;
            String Switch =" Switch Button" + switchState;

            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, Switch, Toast.LENGTH_SHORT).show();


        }

    }
