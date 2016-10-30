package org.cairod_church.pamphlet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mario on 9/28/2016.
 */
public class song6 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song6);

        TextView song6=(TextView) findViewById(R.id.song6);
        song6.setText("١.\tعلمني  (أنتظرك يا رب)٢\t \tعرفني  (رؤيتك للدرب)٢\n" +
                " \t(فليس لي سواك أنت سندي\t \tوروحك يقودني وكلامك سراجي)٢\n" +
                " \t \t \t \n" +
                "٢.\tلذذني  (بحبك الغني)٢\t \tوقدني  (بنورك السني)٢\n" +
                " \t(فحبك أعظم طوق للنجاة\t \tنبع رجايا في الصلاة كل أمالي في الحياة)٢\n" +
                " \t \t \t \n" +
                "٣.\tيا ربي  (أنر لي قلبي)٢\t \tيا ربي  (افتح لي عيني)٢\n" +
                " \t(لكي أرى ذراعك تحيط بي\t \tوصدرك يضمني وشخصك يعتني بي)٢\n");
    }
}
