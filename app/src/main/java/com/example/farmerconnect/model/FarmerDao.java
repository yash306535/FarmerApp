package com.example.farmerconnect.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;



@Dao
public interface FarmerDao {
    @Insert
    void insert(Farmer farmer);

    @Query("SELECT * FROM farmers")
    List<Farmer> getAllFarmers();
}

