package com.example.homedashboardwithbottomnav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView bankCardView, ideaCardView, addCardView, linkCardView, expandCardView, shareCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        bankCardView = (CardView) findViewById(R.id.bankingCardViewId);
        ideaCardView = (CardView) findViewById(R.id.ideasCardViewId);
        addCardView = (CardView) findViewById(R.id.addCardViewId);
        linkCardView = (CardView) findViewById(R.id.linksCardViewId);
        expandCardView = (CardView) findViewById(R.id.expandCardViewId);
        shareCardView = (CardView) findViewById(R.id.shareCardViewId);


        bankCardView.setOnClickListener(this);
        ideaCardView.setOnClickListener(this);
        addCardView.setOnClickListener(this);
        linkCardView.setOnClickListener(this);
        expandCardView.setOnClickListener(this);
        shareCardView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.bankingCardViewId) {
            Intent intent = new Intent(MainActivity.this, BankingActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.ideasCardViewId) {
            Intent intent = new Intent(MainActivity.this, IdeasActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.addCardViewId) {
            Intent intent = new Intent(MainActivity.this, AddActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.linksCardViewId) {
            Intent intent = new Intent(MainActivity.this, LinksActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.expandCardViewId) {
            Intent intent = new Intent(MainActivity.this, SettingActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.shareCardViewId) {
            Intent intent = new Intent(MainActivity.this, ShareActivity.class);
            startActivity(intent);
        }


    }
}