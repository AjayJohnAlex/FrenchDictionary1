package com.example.ajay.frenchdictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {


    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);


            //code of line to get user input
            Name = (EditText)findViewById(R.id.Name);
            Password = (EditText)findViewById(R.id.Password);
            Info = (TextView)findViewById(R.id.Info);
            Login = (Button)findViewById(R.id.btnLogin);

            Info.setText("No of attempts remaining: 5");

            Login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    validate(Name.getText().toString(), Password.getText().toString());
                }
            });
        }

        //method to check the input from user
        private void validate(String userName, String userPassword){
            if((userName.equals("Admin")) && (userPassword.equals("1234"))){
                Intent intent = new Intent(LoginPage.this, MainActivity.class);
                startActivity(intent);
            }else{
                //counter ensures that a limited amount of chances are provided
                counter--;

                Info.setText("No of attempts remaining: " + String.valueOf(counter));

                if(counter == 0){
                    Login.setEnabled(false);
                }
            }
        }
    }

