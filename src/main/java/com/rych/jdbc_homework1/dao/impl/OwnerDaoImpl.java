package com.rych.jdbc_homework1.dao.impl;

import com.rych.jdbc_homework1.Owner;
import com.rych.jdbc_homework1.dao.OwnerDao;
import com.rych.jdbc_homework1.model.Dog;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OwnerDaoImpl implements OwnerDao {

    private Connection dbConnection;

    public OwnerDaoImpl(Connection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public List<Owner> readAllOwners() {

        List<Owner> owners = new ArrayList<>();

        String query = "" +
                "  SELECT O.ID, O.NAME, O.STREET, O.CITY, O.GENDER, O.DOG_ID, D.NAME, D.BREED\n"  +
                "  FROM OWNERS O \n"  +
                "  JOIN DOG D on O.DOG_ID = D.ID \n";

        try {
            Statement statement = dbConnection.createStatement();

            int readId;
            String readName;
            String readStreet;
            String readCity;
            String readPostalCode;
            String readGender;
            int readDogId;


            String readDogName;
            String readDogBreed;

            Owner readOwner;
            Dog readDog;

            ResultSet resultFromDb = statement.executeQuery(query);
            while (resultFromDb.next()) {
                readId = resultFromDb.getInt(1);
                readName = resultFromDb.getString(2);
                readStreet = resultFromDb.getString(3);
                readCity = resultFromDb.getString(4);
                readPostalCode = resultFromDb.getString(5);
                readGender = resultFromDb.getString(6);
                readDogId = resultFromDb.getInt(7);
                readDogName = resultFromDb.getString(8);
                readDogBreed = resultFromDb.getString(9);


                readDog = new Dog(readDogId,readDogName,readDogBreed);
                readOwner = new Owner(readId, readName, readStreet, readCity, readPostalCode, readGender, readDog );
                System.out.println(String.format("Person read from db: [%s]", readOwner));

                owners.add(readOwner);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return owners;
    }

    @Override
    public boolean saveOwner(Owner owner) {
        return false;
    }

    @Override
    public boolean updateOwner(Owner owner) {
        return false;
    }

    @Override
    public boolean deleteOwner(Owner owner) {
        return false;
    }
}
