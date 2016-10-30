package org.cairod_church.pamphlet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Mario on 9/28/2016.
 */
public class workGroup extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workgroup);

        TextView relation = (TextView)findViewById(R.id.relation);
        relation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relation =new Intent(workGroup.this,relation.class);
                startActivity(relation);
            }
        });
        TextView bound = (TextView)findViewById(R.id.bound);
        bound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bound =new Intent(workGroup.this,bound.class);
                startActivity(bound);
            }
        });

    }
}
