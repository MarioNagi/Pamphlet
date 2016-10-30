package org.cairod_church.pamphlet;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class program_content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_content);


        TextView dailyProgram=(TextView) findViewById(R.id.daily_program);
        dailyProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dailyProgram_intent= new Intent(program_content.this, dailyProgram.class);
                startActivity(dailyProgram_intent);
            }
        });

        TextView logo=(TextView) findViewById(R.id.logo);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logo_intent =new Intent(program_content.this,logo.class);
                startActivity(logo_intent);
            }
        });

        TextView upComing=(TextView) findViewById(R.id.upcoming);
        upComing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent upComing_intent =new Intent(program_content.this,upComing.class);
                startActivity(upComing_intent);
            }
        });

        TextView songs=(TextView) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songs_intent =new Intent(program_content.this,songs.class);
                startActivity(songs_intent);
            }
        });

        TextView workGroup=(TextView) findViewById(R.id.workgroup);
        workGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent workGroup_intent =new Intent(program_content.this,workGroup.class);
                startActivity(workGroup_intent);
            }
        });
        ImageButton facebook= (ImageButton)findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/shabab.cairod"));
                    startActivity(intent);

            }
        });
        ImageButton survey= (ImageButton)findViewById(R.id.survey);
        survey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSe-CXyZOxxPaA_kvJSBFRtk7pr8q3AiNJNYI2VXMgk_E24IAQ/viewform"));
                startActivity(intent);

            }
        });
TextView santTextContent=(TextView)findViewById(R.id.santContent);
        santTextContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent santTextContent= new Intent(program_content.this,santContent.class);
                startActivity(santTextContent);
            }
        });
    }



}
