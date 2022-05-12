package com.example.deeprockgalactic;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Document;

public class Wiki extends AppCompatActivity {
    int choice = 0;
    String text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        choice = intent.getIntExtra("selectedVariant",choice);
        setContentView(R.layout.wiki);
        WebView browser=findViewById(R.id.web);
        switch (choice){
            case 0:
                browser.loadUrl("https://translated.turbopages.org/proxy_u/en-ru.ru.1be68ef4-627d286e-08a16add-74722d776562/https/deeprockgalactic.fandom.com/wiki/Deep_Rock_Galactic_Wiki");
                break;
            case 1:
                browser.loadUrl("https://translated.turbopages.org/proxy_u/en-ru.ru.1be68ef4-627d286e-08a16add-74722d776562/https/deeprockgalactic.fandom.com/wiki/Equipment");
                break;
            case 2:
                browser.loadUrl("https://translated.turbopages.org/proxy_u/en-ru.ru.1be68ef4-627d286e-08a16add-74722d776562/https/deeprockgalactic.fandom.com/wiki/Missions");
                break;
            case 3:
                browser.loadUrl("https://translated.turbopages.org/proxy_u/en-ru.ru.1be68ef4-627d286e-08a16add-74722d776562/https/deeprockgalactic.fandom.com/wiki/Hoxxes");
                break;
            case 4:
                browser.loadUrl("https://translated.turbopages.org/proxy_u/en-ru.ru.1be68ef4-627d286e-08a16add-74722d776562/https/deeprockgalactic.fandom.com/wiki/Hazard_Bonus");
                break;
            case 5:
                browser.loadUrl("https://deeprockgalactic.fandom.com/wiki/Abyss_Bar#");
                break;
        }
    }
}
