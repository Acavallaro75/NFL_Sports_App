package com.zybooks.nflsportsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class HomeActivity extends Activity {
  String[] stories = new String[5];
  Integer[] images = {
    R.drawable.lf, R.drawable.lf2, R.drawable.oj, R.drawable.tb, R.drawable.sched
  };
  String[] titles = {
    "Leonard Fournette Returns",
    "Leonard Fournette Interview",
    "OJ Howard Recovering Well",
    "7-round Mock Draft",
    "TB Bucs Schedule"
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);

    SharedPreferences settings = getSharedPreferences(Globals.PREFS_NAME, 0);
    String team = settings.getString("favorite_team", "");

    Websites website = new Websites(team);
    stories = website.getTeamStories();

    final ListView list = findViewById(R.id.list);
    ArrayList<Stories> arrayList = new ArrayList<>();

    for (int i = 0; i < stories.length; i++) {
      arrayList.add(new Stories(titles[i], stories[i], images[i]));
    }

    CustomAdapter customAdapter = new CustomAdapter(this, arrayList);
    list.setAdapter(customAdapter);

    list.setOnItemClickListener(
        (parent, view, position, id) -> {
          String link = stories[position];
          Intent intent = new Intent(this, WebpageActivity.class);
          intent.putExtra("Story", link);
          startActivity(intent);
        });
  }
}
