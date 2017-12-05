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

import static android.R.attr.button;

/**
 * Created by byrdct on 11/27/2017.
 */

    public class ProfileFragment extends android.support.v4.app.Fragment{

    TextView mPFirstName;
    TextView mPLastName;
    EditText mPEdit;
    Profile mProfile = new Profile();
    DatePicker DateButton;




    Button button;

    @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            super.onCreateView(inflater, container, savedInstanceState);
            View rootView = inflater.inflate(R.layout.fragment_profile, container, false);




        mPFirstName = (TextView) rootView.findViewById(R.id.FirstName);
        mPLastName = (TextView) rootView.findViewById(R.id.LastName);
        mPFirstName.setText(mProfile.getFirstName());
        mPFirstName.setText(mProfile.getLastName());
        mPEdit = (EditText) rootView.findViewById(R.id.EditName);
        button = (Button) rootView.findViewById(R.id.profile);
        DateButton  = (DatePicker) rootView.findViewById(R.id.dob);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPFirstName.setText(mPEdit.getText());
                mPFirstName.setText(mPEdit.getText());

            }
        });


        return rootView;

    }
}


