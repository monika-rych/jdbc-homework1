package com.rych.jdbc_homework1;

import com.rych.jdbc_homework1.model.Dog;

public class Owner {

    private int id;
    private String name;
    private String gender;
    private String street;
    private String city;
    private String postalCode;
    private Dog dog;

    public Owner(int id, String name, String gender, String street, String city, String postalCode, Dog dog) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.dog = dog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", dog=" + dog +
                '}';
    }
}
