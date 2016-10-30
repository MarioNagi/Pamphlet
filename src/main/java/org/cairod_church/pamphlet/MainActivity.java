package org.cairod_church.pamphlet;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView logo=(TextView)findViewById(R.id.main_logo);
        TextView youth=(TextView)findViewById(R.id.youth);
        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/GE Dinar One Medium.otf");
        logo.setTypeface(face);
        youth.setTypeface(face);
        Button pamphlet=(Button) findViewById(R.id.pamphlet);
    pamphlet.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent program_intent= new Intent(MainActivity.this, program_content.class);
            startActivity(program_intent);
        }
    });
    }
}
