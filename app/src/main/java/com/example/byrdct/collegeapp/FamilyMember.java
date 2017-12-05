package com.example.byrdct.collegeapp;

/**
 * Created by byrdct on 11/29/2017.
 */

public abstract class FamilyMember {
    public String firstName;
    public String lastName;

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