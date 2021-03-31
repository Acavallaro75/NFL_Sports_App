package com.zybooks.nflsportsapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void goToHomePage(View view) {

    SharedPreferences settings = getSharedPreferences(Globals.PREFS_NAME, 0);
    String storedEmail = settings.getString("email", "");
    String storedPassword = settings.getString("password", "");

    EditText emailText = findViewById(R.id.username_input);
    String email = emailText.getText().toString();
    EditText passwordText = findViewById(R.id.pass);
    String password = passwordText.getText().toString();

    if (email.isEmpty() || password.isEmpty()) {
      if (email.isEmpty()) {
        emailText.setHint(R.string.empty_email);
        emailText.setHintTextColor(getResources().getColor(R.color.redText));
      }

      if (password.isEmpty()) {
        passwordText.setHint(R.string.empty_password);
        passwordText.setHintTextColor(getResources().getColor(R.color.redText));
      }
    } else {

      if (email.equalsIgnoreCase(storedEmail) && password.equals(storedPassword)) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
      } else {
        Toast.makeText(getApplicationContext(), "Invalid Combination", Toast.LENGTH_SHORT).show();
      }
    }
  }

  public void goToCreateAccountPage(View view) {
    Intent intent = new Intent(this, CreateAccountActivity.class);
    startActivity(intent);
  }
}
