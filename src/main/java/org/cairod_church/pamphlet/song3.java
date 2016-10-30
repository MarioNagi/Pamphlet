package org.cairod_church.pamphlet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mario on 9/28/2016.
 */
public class song3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song3);

        TextView song3=(TextView) findViewById(R.id.song3);
        song3.setText("أدنو أليك أرتاح تلقانى بالأفراح .. يفيض دمع العين حبا و ليس جراح\n" +
                "ق : حبيبي سباني بحبه سباني .. شفاني و رواني بغمرة رواني\n" +
                "جذبني حبه إليه آتى وعيني عليه .. جلست بين أيديه ووقتي نساني\n" +
                " + جماله فتان وقلبه حنان .. محضره ملأن بالجود والإحسان\n" +
                "+  شوقي يا رب إليك إليك وليس سواك .. أكون ملكًا ليك فمبتغاى رضاك \n");
    }
}
