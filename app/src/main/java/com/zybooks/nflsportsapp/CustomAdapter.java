package com.zybooks.nflsportsapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Stories> {
  private final ArrayList<Stories> stories;
  private final Activity context;

  public CustomAdapter(Activity context, ArrayList<Stories> stories) {
    super(context, R.layout.row_item, stories);
    this.context = context;
    this.stories = stories;
  }

  @SuppressLint("InflateParams")
  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View row = convertView;
    LayoutInflater inflater = context.getLayoutInflater();
    if (convertView == null) row = inflater.inflate(R.layout.row_item, null, true);
    TextView title = row.findViewById(R.id.textViewTitle);
    TextView link = row.findViewById(R.id.textViewLink);
    ImageView image = row.findViewById(R.id.storyImage);

    title.setText(stories.get(position).title);
    link.setText(stories.get(position).link);
    image.setImageResource(stories.get(position).image);
    return row;
  }
}
