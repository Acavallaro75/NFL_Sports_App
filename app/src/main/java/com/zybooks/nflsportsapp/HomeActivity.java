package com.zybooks.nflsportsapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

public class HomeActivity extends Activity {

  String[] stories = new String[5];
  String[] teams = {
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
    setContentView(R.layout.activity_home);
    setStories();
  }

  public void setStories() {

    SharedPreferences settings = getSharedPreferences(Globals.PREFS_NAME, 0);
    String team = settings.getString("favorite_team", "");

    Websites website = new Websites(team);
    stories = website.getTeamStories();
  }
}
