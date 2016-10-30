package org.cairod_church.pamphlet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.cairod_church.pamphlet.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_ThirdDay extends Fragment {


    public fragment_ThirdDay() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View  myInflatedView=inflater.inflate(R.layout.fragment_fragment__third_day, container, false);
        TextView thirdDay=(TextView)myInflatedView.findViewById(R.id.thirdDayText);
        thirdDay.setText("7:00  ص                : قداس  \n" +
                "9:00  ص                : فطار \n" +
                " 10:00  ص             : تجهيز الشنط \n" +
                "11:00  ص              : دراسة كتاب  (2)\n" +
                "12:00 ظ                 : تقييم المؤتمر \n" +
                "12:30 ظ                 : التحرك لزيارة  دير الانبا بولا \n" +
                "4:30  م                  : التحرك من دير الانبا بولا للعودة \n" +
                "8:30  م                  : العودة الى القاهرة بالسلامة .\n");
        // Inflate the layout for this fragment
        return myInflatedView;
    }

}
