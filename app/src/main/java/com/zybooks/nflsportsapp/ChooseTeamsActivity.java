package com.zybooks.nflsportsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ChooseTeamsActivity extends Activity {

  ListView listView;
  String chosenTeam = "No team chosen";

  String[] footballTeams = {
    "Arizona Cardinals",
    "Atlanta Falcons",
    "Baltimore Ravens",
    "Buffalo Bills",
    "Carolina Panthers",
    "Chicago Bears",
    "Cincinnati Bengals",
    "Cleveland Browns",
    "Dallas Cowboys",
    "Denver Broncos",
    "Detroit Lions",
    "Green Bay Packers",
    "Houston Texans",
    "Indianapolis Colts",
    "Jacksonville Jaguars",
    "Kansas City Chiefs",
    "Las Vegas Raiders",
    "Los Angeles Chargers",
    "Los Angeles Rams",
    "Miami Dolphins",
    "Minnesota Vikings",
    "New England Patriots",
    "New Orleans Saints",
    "New York Giants",
    "New York Jets",
    "Philadelphia Eagles",
    "Pittsburgh Steelers",
    "San Fransisco 49ers",
    "Seattle Seahawks",
    "Tampa Bay Buccaneers",
    "Tennessee Titans",
    "Washington Football Team"
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_choose_teams);

    ArrayAdapter<String> adapter =
        new ArrayAdapter<>(this, R.layout.activity_list_view, footballTeams);

    listView = findViewById(R.id.football_list);
    listView.setAdapter(adapter);

    listView.setOnItemClickListener(
        (parent, view, position, id) -> {
          chosenTeam = footballTeams[position];
          view.setSelected(true);
        });
  }

  public void goToHomePage(View view) {

    if (!chosenTeam.equalsIgnoreCase("No team chosen")) {
      SharedPreferences settings = getSharedPreferences(Globals.PREFS_NAME, 0);
      Editor editor = settings.edit();
      editor.putString("favorite_team", chosenTeam);
      editor.apply();

      Intent intent = new Intent(this, MainActivity.class);
      startActivity(intent);
    } else {
      Toast.makeText(getApplicationContext(), "Please Select a Team", Toast.LENGTH_SHORT).show();
    }
  }
}
