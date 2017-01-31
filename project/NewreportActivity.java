package com.uws.pnai.project;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class NewreportActivity extends ActionBarActivity implements View.OnClickListener {

    Button userButton;
    Button guideButton;
    Button cameraButton;
    Button locationButton;
    Button weatherButton;
    Button helpButton;
    Button detailsButton;
    Button walkthroughButton;
    Button voiceButton;
    Button textButton;
    Button drawingButton;
    Button witnessButton;
    Button faqButton;
    Button localButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newreport);

        userButton=(Button)findViewById(R.id.addUser);
        guideButton=(Button)findViewById(R.id.guide);
        cameraButton=(Button)findViewById(R.id.camera);
        locationButton=(Button)findViewById(R.id.location);
        weatherButton=(Button)findViewById(R.id.weather);
        helpButton=(Button)findViewById(R.id.help);
        detailsButton=(Button)findViewById(R.id.details);
        walkthroughButton=(Button)findViewById(R.id.walkthrough);
        voiceButton=(Button)findViewById(R.id.voice);
        textButton=(Button)findViewById(R.id.text);
        drawingButton=(Button)findViewById(R.id.drawing);
        witnessButton=(Button)findViewById(R.id.witness);
        faqButton=(Button)findViewById(R.id.faq);
        localButton=(Button)findViewById(R.id.local);

        userButton.setOnClickListener(this);
        guideButton.setOnClickListener(this);
        cameraButton.setOnClickListener(this);
        locationButton.setOnClickListener(this);
        weatherButton.setOnClickListener(this);
        helpButton.setOnClickListener(this);
        detailsButton.setOnClickListener(this);
        walkthroughButton.setOnClickListener(this);
        voiceButton.setOnClickListener(this);
        textButton.setOnClickListener(this);
        drawingButton.setOnClickListener(this);
        witnessButton.setOnClickListener(this);
        faqButton.setOnClickListener(this);
        localButton.setOnClickListener(this);


    }

    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.addUser:
                intent = new Intent(this, UserActivity.class);
                startActivity(intent);
                break;

            case R.id.guide:
                intent = new Intent(this, GuideActivity.class);
                startActivity(intent);
                break;

            case R.id.camera:
                intent = new Intent(this, CameraActivity.class);
                startActivity(intent);
                break;

            case R.id.location:
                intent = new Intent(this, LocationActivity.class);
                startActivity(intent);
                break;

            case R.id.weather:
                intent = new Intent(this, WeatherActivity.class);
                startActivity(intent);
                break;

            case R.id.help:
                intent = new Intent(this, HelpActivity.class);
                startActivity(intent);
                break;

            case R.id.details:
                intent = new Intent(this, DetailsActivity.class);
                startActivity(intent);
                break;

            case R.id.walkthrough:
                intent = new Intent(this, WalkthroughActivity.class);
                startActivity(intent);
                break;

            case R.id.voice:
                intent = new Intent(this, VoiceActivity.class);
                startActivity(intent);
                break;

            case R.id.text:
                intent = new Intent(this, TextActivity.class);
                startActivity(intent);
                break;

            case R.id.drawing:
                intent = new Intent(this, DrawingActivity.class);
                startActivity(intent);
                break;

            case R.id.witness:
                intent = new Intent(this, WitnessActivity.class);
                startActivity(intent);
                break;

            case R.id.faq:
                intent = new Intent(this, FAQActivity.class);
                startActivity(intent);
                break;

            case R.id.local:
                intent = new Intent(this, LocalActivity.class);
                startActivity(intent);
                break;


        }
    }
}
