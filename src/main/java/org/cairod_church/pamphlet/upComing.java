package org.cairod_church.pamphlet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mario on 9/28/2016.
 */
public class upComing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upcoming);
        TextView ad=(TextView)findViewById(R.id.ad);
        ad.setText("رحلة الفيوم ووادى الريان\n" +
                " يوم 22 اكتوبر\n" +
        " الاشتراك ب 95 \n" +
        "الاشتراك مع نهى شكرى\n" +
        " للاستعلام : ت 01211477151");

    }
}
