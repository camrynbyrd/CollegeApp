package com.example.byrdct.collegeapp;

import java.util.Calendar;

/**
 * Created by byrdct on 11/27/2017.
 */

public class Profile {
    String firstName;
    String lastName;
    Calendar dob;

    public Profile(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Profile() {

        this.firstName = "Alan";
        this.lastName = "Turing";
        this.dob = Calendar.getInstance();
        dob.set(1999, 00, 01);

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Calendar getDob() {
        return dob;

    }

    public void setDob(int year, int month, int day) {
        dob.set(year, month, day);
    }


}

