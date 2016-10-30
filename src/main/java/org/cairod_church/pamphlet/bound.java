package org.cairod_church.pamphlet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mario on 9/29/2016.
 */
public class bound extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bound);
        TextView boundText=(TextView)findViewById(R.id.boundText);
        boundText.setText("-\tما هي الحدود؟\n" +
                "الحدود تعرفنا حقيقتين أساسيتين:\n" +
                "1.\tإننا أشخاص متفردون، فلا يوجد إنسان نسخة من إنسان آخر.\n" +
                "2.\tإننا نحتاج لبعض بالرغم من تفردنا واستقلالنا.\n" +
                "\n" +
                "العلاقات الصحيحة لا تطلب التطابق بدعوى الحب الشديد، وإنما نسعى للتوافق والتكامل والتعاون، فنقترب من بعضنا البعض مع احترام الحدود.\n" +
                "\n" +
                "أنواع الحدود:\n" +
                "-\tالتداخل (اللاحدود): الإنكشاف أكثر من اللازم لشخص ليس على علاقة جيدة معه.\n" +
                "-\tالتباعد (السدود): الإنغلاق عن الاخرين وعدم التواصل مهما كانت مكانتهن والثقة فيهم.\n" +
                "-\tحدود صحية: تكوين الثقة بالتدريج وأكون مستعد للمشاركة والمكاشفة بالقدر الذي يتناسب مع حجم العلاقة ونموها.\n" +
                "\n" +
                "حدود الخصوصية:\n" +
                "-\tحدود التلامس بين الاصدقاء والمخطوبين\n" +
                "-\tحدود الاسرار والافصاح عنها في فترة التعارف\n" +
                "-\tحدود الجوانب المادية في فترتي ماقبل الارتباط والخطوبة\n");
    }

}
