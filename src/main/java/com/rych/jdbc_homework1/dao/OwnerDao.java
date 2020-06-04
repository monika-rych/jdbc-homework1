package com.rych.jdbc_homework1.dao;

import com.rych.jdbc_homework1.Owner;

import java.util.List;

public interface OwnerDao {

    List<Owner> readAllOwners();

    boolean saveOwner(Owner owner);

    boolean updateOwner(Owner owner);

    boolean deleteOwner(Owner owner);
}
