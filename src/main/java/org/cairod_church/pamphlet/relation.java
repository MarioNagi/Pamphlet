package org.cairod_church.pamphlet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mario on 9/29/2016.
 */
public class relation extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relation);

        TextView relText=(TextView)findViewById(R.id.relText);
        relText.setText("1 – العلاقات\n" +
                "العلاقات الإنسانية هي محور الحياة وما يدل على النجاح فيها، فالإنسان الناجح هو من ينجح في علاقاته على كل المستويات في الأسرة والعمل ومع الأصدقاءثم يستطيع تكوين أسرة سوية، وفوق كل هذا تكوين علاقة مع الله لأننا \"نحن الكثيرين: جسد واحد في المسيح وأعضاء لعضا لبعض كل واحد للآخر\" ( رومية 12: 5) وعليه فإنه \"لا يطلب أحد ما هو لنفسه، بل كل واحد ما هو للآخر\" (1كو1: 24)\n" +
                "\n" +
                "صحة العلاقات من خلال العلاقة الصحيحة مع الله، ويهدف الإنسان إلى القبول من الآخرين ويعتبره قمة النجاح في العلاقات وأكثر ما يفرح الإنسان عندما يصل إليه هو عندما يجد من يقدم له (القبول الغير مشروط) بكل مميزاته وعيوبه ونقائصه وأخطائه وهذا لم يتحقق إلا في حب الله للإنسان وفدائه ويعد الغفران هو أقوى دليل على الحب والقبول الغير مشروط.\n" +
                "\"ولكن الله بيّن محبيته لنا، لأنه ونحن لعد خطاة مات المسيح من أجلنا\" (رومية 5: 8)\n" +
                "\n" +
                "نماذج خاطئة من العلاقات:\n" +
                "-\tالحماية الزائدة (الحب الخانق).\n" +
                "-\tالإعتمادية.\n" +
                "-\tالتسلط.\n" +
                "نماذج صحيحة للعلاقات:\n" +
                "-\tالتواصل الجيد ووجود لغة مشتركة.\n" +
                "-\tالتكافؤ والتفاهم.\n" +
                "-\tالتبادل والتكامل.\n");
    }
}
