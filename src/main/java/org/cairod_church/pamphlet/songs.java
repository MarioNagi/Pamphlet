package org.cairod_church.pamphlet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Mario on 9/28/2016.
 */
public class songs extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);


        TextView song1=(TextView)findViewById(R.id.song1);
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song1=new Intent(songs.this,song1.class);
                startActivity(song1);
            }
        });
        TextView song2=(TextView)findViewById(R.id.song2);
        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song2=new Intent(songs.this,song2.class);
                startActivity(song2);
            }
        });
        TextView song3=(TextView)findViewById(R.id.song3);
        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song3=new Intent(songs.this,song3.class);
                startActivity(song3);
            }
        });
        TextView song4=(TextView)findViewById(R.id.song4);
        song4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song4=new Intent(songs.this,song4.class);
                startActivity(song4);
            }
        });
        TextView song5=(TextView)findViewById(R.id.song5);
        song5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song5=new Intent(songs.this,song5.class);
                startActivity(song5);
            }
        });
        TextView song6=(TextView)findViewById(R.id.song6);
        song6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song6=new Intent(songs.this,song6.class);
                startActivity(song6);
            }
        });
    }
}