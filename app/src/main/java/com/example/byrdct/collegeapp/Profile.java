package com.example.byrdct.collegeapp;

/**
 * Created by byrdct on 11/27/2017.
 */

public class Profile {
    String FirstName;
    String LastName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public Profile(String firstName) {

        FirstName = firstName;
    }
}
