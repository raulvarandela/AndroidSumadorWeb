package com.example.sumadoraweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WebView W_VIEW = this.findViewById(R.id.wView);
        final WebSettings WV_SETTINGS = W_VIEW.getSettings();

        WV_SETTINGS.setJavaScriptEnabled(true);
        W_VIEW.setWebViewClient(new WebViewClient());
    }

    @Override
    protected void onResume() {
        super.onResume();
        final WebView W_VIEW = this.findViewById(R.id.wView);
        W_VIEW.loadUrl("file:///android_asset/sumadora.html");
    }
}