package com.example.farmerconnect.model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Farmer.class}, version = 1)
public abstract class FarmerDatabase extends RoomDatabase {
    private static FarmerDatabase instance;

    public abstract FarmerDao farmerDao();

    public static synchronized FarmerDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            FarmerDatabase.class, "farmer_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}

