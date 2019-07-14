package com.eugene.alc40phase1challenge;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        WebView vWebView = findViewById(R.id.web_view);
       vWebView.setWebViewClient(new WebViewClient() {
           @Override
           public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
               handler.proceed();
           }
       });
       vWebView.loadUrl("https://andela.com/alc/");
    }
}
