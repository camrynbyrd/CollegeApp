package com.example.byrdct.collegeapp;

/**
 * Created by byrdct on 11/27/2017.
 */

public class Guardian {
    String FirstName;
    String LastName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public Guardian(String firstName) {

        FirstName = firstName;
    }
}
