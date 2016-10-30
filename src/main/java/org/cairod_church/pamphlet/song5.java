package org.cairod_church.pamphlet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mario on 9/28/2016.
 */
public class song5 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song5);

        TextView song5=(TextView) findViewById(R.id.song5);
        song5.setText(" - 1يسوع أنت تعلم أن شهوات العالم تخدعني\n" +
                ") طهر قلبي طهر فكري إسمع صراخي وارحمني )2\n" +
                "القرار- ( طهرني طهرني )2 يسوع أنت تعلم إني أحبك ( من قلبي )2\n" +
                " - 2دنست قلبي دنست فكري صلبتك بجرمي\n" +
                ") أبعدتك نسيتك لم تعد أنت الكل لي )2\n" +
                "- 3 قدس سمعي عفف نظري إحفظ أوقاتي وحبي\n" +
                "( أحفظ وعدك أمشي خلفك مهما خالفت في وعدي )2\n" +
                " - 4يسوع الآن تعلم أني فرحان بوجودك في قلبي\n" +
                ") هللي نفسي رنمي روحي ده يسوع حبيبي طهرني )2 \n");
    }
}
