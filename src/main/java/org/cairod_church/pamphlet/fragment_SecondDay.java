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
public class fragment_SecondDay extends Fragment {


    public fragment_SecondDay() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myInflatedView =inflater.inflate(R.layout.fragment_fragment__second_day, container, false);
                TextView secondDay=(TextView)myInflatedView.findViewById(R.id.secondDayText);

        secondDay.setText("7:00 ص              : قداس \n" +
                " 9:00ص               : فطار \n" +
                " 10:30  ص             : جوله حره \n" +
                "12:00  ص               : ترانيم\n" +
                "12:30  ظ                  : دراسة كتاب ( 1 )\n" +
                "2:00    ظ                 :الكلمة الثانية \n" +
                "3 – 5:00 م               : راحة \n" +
                "5:30   م                   : عشية او صلاة غروب \n" +
                "6:00  م                    :خلوة (  2  )\n" +
                "7:00  م                    : عشاء \n" +
                "8:00 م                     : كلمة الثالثة \n" +
                "9:30 م                     : محموعات عمل\n" +
                "10:30 م                   : فيلم \n" +
                "11:00 م                   : صلاة نوم \n" +
                "\n");


        // Inflate the layout for this fragment
        return myInflatedView;
    }

}
