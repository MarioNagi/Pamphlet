package org.cairod_church.pamphlet;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class fragment_FirstDay extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  myInflatedView=inflater.inflate(R.layout.fragment_fragment__first_day, container, false);
        TextView firstDay=(TextView) myInflatedView.findViewById(R.id.firstDay);
        firstDay.setText("10:00  م             : التجمع\n" +
                "12:30  ص           : التحرك\n" +
                "5:00   ص            : وصول دير الانبا انطونيوس  \n" +
                "         (حضور القداس -فطار -زيارة المغارة والدير)  \n" +
                "10:00 ص            : التحرك من دير الانبا انطونيوس \n" +
                "12:00  ظ             : الوصول للفندق  ( مبيت الانبا بولا ) \n" +
                "12:30    ظ            : التسكين \n" +
                "2 ظ الى 6:00  ظ        : فترة راحة \n" +
                "6:00  م                : الكلمة الأولى \n" +
                "7:30  م                : عشاء \n" +
                "8.30 م                 : خلوة ( 1 ) \n" +
                "9:30  م              : مجموعات عمل\n" +
                "10:30  م              : صلاة نوم  \n");
        return myInflatedView;
    }

}
