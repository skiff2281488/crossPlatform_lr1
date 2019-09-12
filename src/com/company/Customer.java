package com.company;

public class Customer {
    private String firstName;
    private String lastName;
    private int yearBorn;
    private String mobileNumber;

    public Customer(String firstName, String lastName, int yearBorn, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBorn = yearBorn;
        this.mobileNumber = mobileNumber;
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

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
