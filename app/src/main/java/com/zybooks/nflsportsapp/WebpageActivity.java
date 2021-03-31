package com.zybooks.nflsportsapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebpageActivity extends Activity {

  @SuppressLint("SetJavaScriptEnabled")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_webpage);

    WebView webView = findViewById(R.id.webview);
    webView.setWebViewClient(new MyBrowser());

    webView.getSettings().setLoadsImagesAutomatically(true);
    webView.getSettings().setJavaScriptEnabled(true);
    webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
    webView.loadUrl(
        "https://www.buccaneers.com/news/quarterback-tom-brady-signed-bucs-2020-super-bowl-lv-transaction");
  }

  private static class MyBrowser extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
      view.loadUrl(url);
      return true;
    }
  }
}
