package org.cairod_church.pamphlet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mario on 9/28/2016.
 */
public class song4 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song4);

        TextView song4=(TextView) findViewById(R.id.song4);
        song4.setText("1سأدنو منك ياربي وألمس ثوبك الآن لروحك حاجة القلب أعده إلي ملأن \n" +
                "القرار:- وإني الأن أقترب فمد يديك باركني وروحي في تضطرب فضم الروح وأملكني \n" +
                " - 2تلفت وانظرن نفسي فبالإيمان ألمسك وأكرم صاحب اللمس كثوب البر يلبسك \n" +
                " - 3إليك أجي يا شبعي ويا كنزي الذي يبقى فقربك أعمق المتع هو الأحلى هو الأنقى \n" +
                "وإني الأن أمسكك بإيمان وإصرار فباركني لأطلقك وأطلق فيك أشعاري \n");
    }
}
