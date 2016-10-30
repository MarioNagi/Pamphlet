/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cairod_church.pamphlet;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter_program extends FragmentPagerAdapter {

    private Context mContext;


    public SimpleFragmentPagerAdapter_program(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }



    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new fragment_FirstDay();
        } else if (position == 1){
            return new fragment_SecondDay();
        } else {
            return new fragment_ThirdDay();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.firstday);
        } else if (position == 1){
            return mContext.getString(R.string.secondday);
        } else {
            return mContext.getString(R.string.thirdday);
        }
    }



    @Override
    public int getCount() {
        return 3;
    }
}
