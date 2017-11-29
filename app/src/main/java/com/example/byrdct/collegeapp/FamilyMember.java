package com.example.byrdct.collegeapp;

/**
 * Created by byrdct on 11/29/2017.
 */

public class FamilyMember {
    private String firstName;
    private String lastName;

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

    public FamilyMember() {
        firstName = "Ada";
        lastName = "Lovelace";

    }
}