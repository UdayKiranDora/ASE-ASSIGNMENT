package com.example.random.aseandroids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button but;
    public EditText username;
    public EditText password;
    public void illu(){
        but= (Button)findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 username = (EditText)findViewById(R.id.editText);
                 password = (EditText)findViewById(R.id.editText2);
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Intent hll= new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(hll);
               }

                else{
                    Toast.makeText(getApplicationContext(), "Enter Correct Credentials", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        illu();
    }
}
