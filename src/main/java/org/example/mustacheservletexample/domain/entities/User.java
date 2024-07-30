package org.example.mustacheservletexample.domain.entities;


import java.util.Objects;

public class User {

    private String firstName;

    private String lastName;

    private String country;

    private Integer age;


    public User() {
    }


    public User(String firstName, String lastName, String country, Integer age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }


    public String firstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String lastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String country() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    public Integer age() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) &&
                Objects.equals(country, user.country) && Objects.equals(age, user.age);
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, country, age);
    }
}
