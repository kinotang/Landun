package com.landun.landun;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        Uri uri= Uri.parse("weixin://wap/pay?appid%3dwx8888888888888888%26noncestr%3d5K8264ILTKCH16CQ2502SI8ZNMTM67VS%26package%3dWAP%26prepayid%3dwx201410272009395522657a690389285100%26timestamp%3d1540799579%26sign%3dC380BEC2BFD727A4B6845133519F3AD6");
        intent.setData(uri);
        startActivity(intent);
    }

    private void initView(){
//        mWebView = findViewById(R.id.web);
//        WebSettings webSettings = mWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
//        }
//        mWebView.setWebViewClient(new WebViewClient() {
//            @Override
//            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
//                handler.proceed();
//            }
//
//        });
//        mWebView.setWebChromeClient(new WebChromeClient());
//        mWebView.loadUrl("http://test.landun.chiye.tech/mall");
    }

    @Override
    public void onBackPressed() {
//        if (mWebView.canGoBack()){
//            mWebView.goBack();
//        }else {
//            super.onBackPressed();
//        }
    }
}
