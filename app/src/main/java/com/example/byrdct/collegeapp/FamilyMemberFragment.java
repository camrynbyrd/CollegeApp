package com.example.byrdct.collegeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.button;

/**
 * Created by byrdct on 11/27/2017.
 */

    public class FamilyMemberFragment extends android.support.v4.app.Fragment{

    TextView mFMFirstName;
    TextView mFMLastName;
    EditText mFMEdit;
    FamilyMember mFamilyMember = new FamilyMember();

    Button UpdateButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_family_member, container, false);

        mFMFirstName = (TextView) rootView.findViewById(R.id.FirstName);
        mFMLastName = (TextView) rootView.findViewById(R.id.LastName);
        mFMFirstName.setText(mFamilyMember.getFirstName());
        mFMFirstName.setText(mFamilyMember.getLastName());
        mFMEdit = (EditText) rootView.findViewById(R.id.EditFamilyMember);

        button = (Button) rootView.findViewById(R.id.UpdateButton);

        return rootView;
    }
}


