package com.example.byrdct.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

import static android.R.attr.button;

/**
 * Created by byrdct on 11/27/2017.
 */

    public class ProfileFragment extends android.support.v4.app.Fragment{

    TextView mPFirstName;
    TextView getmPFirstName;
    TextView mPLastName;
    EditText fnameEdit;
    EditText lnameEdit;
    Profile mProfile = new Profile();
    DatePicker dob;
    Button update;
    Calendar calendar = Calendar.getInstance();


    @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            super.onCreateView(inflater, container, savedInstanceState);
            View rootView = inflater.inflate(R.layout.fragment_profile, container, false);




        mPFirstName = (TextView) rootView.findViewById(R.id.FirstName);
        mPLastName = (TextView) rootView.findViewById(R.id.LastName);
        mPFirstName.setText(mProfile.getFirstName());
        mPFirstName.setText(mProfile.getLastName());
        fnameEdit = (EditText) rootView.findViewById(R.id.edit_lname);
        lnameEdit = (EditText) rootView.findViewById(R.id.edit_fname);
        update = (Button) rootView.findViewById(R.id.profile);
        dob = (DatePicker) rootView.findViewById(R.id.dob);




        update.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mPFirstName.setText(fnameEdit.getText());
                mPLastName.setText(lnameEdit.getText());
                dob.init(mProfile.getDob().get(Calendar.YEAR), mProfile.getDob().get(Calendar.MONTH), mProfile.getDob().get(Calendar.DAY_OF_MONTH), null );

                int day = dob.getDayOfMonth();
                int month = dob.getMonth();
                int year = dob.getYear();


                        calendar.set(year, month, day);
                        mProfile.setDob(year, month, day);






                    }

                });

        return rootView;

    }
}


