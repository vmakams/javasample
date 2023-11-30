package org.example;

public class EmployeeInfo {

    String firstName;
    String lastName;
    String gender = "Male";
    int age;
    String address;
    String city;
    String state;
    String country;
    String zipcode;

    public void employeeInfo() {
        this.firstName = "Venkata Sudhakar";
        this.lastName = "Makam";
        this.age = 27;
        this.address = "2510 Ganesh Street Apt B";
        this.city = "Herndon";
        this.state = "Virginia";
        this.country = "USA";
        this.zipcode = "12204";
        System.out.println(this.firstName);
    }
}
