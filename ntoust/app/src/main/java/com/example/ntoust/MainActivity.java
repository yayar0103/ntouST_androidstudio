package com.example.ntoust;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageButton training;
    private ImageButton watch_boat;
    private ImageButton note;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton button6;
    private ImageButton button7;
    private ImageButton calender;
    private WebView windyWeb;
    private List<String> info;
    private ImageView icon;
    private MarqueeView bulltine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();

        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(MainActivity.this, CalenderActivity.class);
                startActivity(intent1);
            }
        });
        training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent();
                intent2.setClass(MainActivity.this, TrainActivity.class);
                startActivity(intent2);
            }
        });

        watch_boat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent();
                intent3.setClass(MainActivity.this, MantainActivity.class);
                startActivity(intent3);
            }
        });

        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent();
                intent4.setClass(MainActivity.this, MoneyActivity.class);
                startActivity(intent4);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent();
                intent5.setClass(MainActivity.this, MapActivity.class);
                startActivity(intent5);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent();
                intent6.setClass(MainActivity.this, InfoActivity.class);
                startActivity(intent6);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent();
                intent8.setClass(MainActivity.this, PeppleActivity.class);
                startActivity(intent8);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent();
                intent3.setClass(MainActivity.this, ImportActivity.class);
                startActivity(intent3);
            }
        });

        WebSettings webSettings = windyWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        windyWeb.setWebViewClient(new WebViewClient());
        windyWeb.loadUrl("https://www.windy.com/?25.131,121.875,10");

        info = new ArrayList<>();
        info.add("國立臺灣海洋大學帆船代表隊");
        info.add("阿呱呱呱呱阿拉阿拉呱");
        info.add("大家要乖乖練傳阿阿");
        info.add("這阿#@%#@@@#$$%*&好難開發阿QQ");
        bulltine.startWithList(info);
    }


    private void findView() {
        calender = (ImageButton) findViewById(R.id.imageButton1);
        training = (ImageButton) findViewById(R.id.imageButton2);
        watch_boat = (ImageButton) findViewById(R.id.imageButton3);
        note = (ImageButton) findViewById(R.id.imageButton4);
        button4 = (ImageButton) findViewById(R.id.imageButton5);
        button5 = (ImageButton) findViewById(R.id.imageButton6);
        button6 = (ImageButton) findViewById(R.id.imageButton7);
        button7 = (ImageButton) findViewById(R.id.imageButton8);
        windyWeb = (WebView) findViewById(R.id.web);
        bulltine = (MarqueeView) findViewById(R.id.bulltine);
        icon = (ImageView) findViewById(R.id.icon);

    }

}
