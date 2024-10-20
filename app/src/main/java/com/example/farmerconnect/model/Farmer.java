package com.example.farmerconnect.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "farmers")
public class Farmer {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String profileDetails;
    private String email;
    private double rating;

    // Getters and Setters
}
