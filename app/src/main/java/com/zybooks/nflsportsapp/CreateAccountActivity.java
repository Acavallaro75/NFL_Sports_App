package com.zybooks.nflsportsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateAccountActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_create_account);
  }

  public void goToSelectTeams(View view) {
    EditText emailText = findViewById(R.id.email);
    String email = emailText.getText().toString();
    EditText passwordText = findViewById(R.id.password);
    String password = passwordText.getText().toString();
    EditText firstNameText = findViewById(R.id.first_name);
    String firstName = firstNameText.getText().toString();
    EditText lastNameText = findViewById(R.id.last_name);
    String lastName = lastNameText.getText().toString();

    if (email.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty()) {
      if (email.isEmpty()) {
        emailText.setHint(R.string.empty_email);
        emailText.setHintTextColor(getResources().getColor(R.color.redText));
      } else if (!isEmailValid(email)) {
        emailText.setHint(R.string.invalid_email);
        emailText.setHintTextColor(getResources().getColor(R.color.redText));
      }

      if (password.isEmpty()) {
        passwordText.setHint(R.string.empty_password);
        passwordText.setHintTextColor(getResources().getColor(R.color.redText));
      } else if (password.length() < 8) {
        passwordText.setHint(R.string.short_password);
        passwordText.setHintTextColor(getResources().getColor(R.color.redText));
      }

      if (firstName.isEmpty()) {
        firstNameText.setHint(R.string.empty_first_name);
        firstNameText.setHintTextColor(getResources().getColor(R.color.redText));
      }

      if (lastName.isEmpty()) {
        lastNameText.setHint(R.string.empty_last_name);
        lastNameText.setHintTextColor(getResources().getColor(R.color.redText));
      }
    } else {

      SharedPreferences settings = getSharedPreferences(Globals.PREFS_NAME, 0);
      Editor editor = settings.edit();
      editor.putString("email", email);
      editor.putString("password", password);
      editor.putString("first_name", firstName);
      editor.putString("last_name", lastName);
      editor.apply();

      Intent intent = new Intent(this, ChooseTeamsActivity.class);
      startActivity(intent);
    }
  }

  public static boolean isEmailValid(String email) {
    String expression = "^[\\w.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
    Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
  }
}
