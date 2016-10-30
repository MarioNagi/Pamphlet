package org.cairod_church.pamphlet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Mario on 9/28/2016.
 */
public class santContent extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.santcontent);

        TextView relation = (TextView)findViewById(R.id.sant1);
        relation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relation =new Intent(santContent.this,sant1.class);
                startActivity(relation);
            }
        });
        TextView bound = (TextView)findViewById(R.id.sant2);
        bound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bound =new Intent(santContent.this,sant2.class);
                startActivity(bound);
            }
        });

    }
}
