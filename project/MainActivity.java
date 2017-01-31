package com.uws.pnai.project;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button createButton;
    Button accessButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createButton=(Button)findViewById(R.id.newReport);
        accessButton=(Button)findViewById(R.id.accessReport);


        createButton.setOnClickListener(this);
        accessButton.setOnClickListener(this);



    }

    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {
            case R.id.newReport:
                 intent = new Intent(this, NewreportActivity.class);
                 startActivity(intent);
                 break;

            case R.id.accessReport:
                 intent = new Intent(this, ArchiveActivity.class);
                 startActivity(intent);
                 break;




        }
    }
}
