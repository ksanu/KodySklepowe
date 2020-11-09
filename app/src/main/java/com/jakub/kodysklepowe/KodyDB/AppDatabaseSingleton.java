package com.jakub.kodysklepowe.KodyDB;


import android.content.*;

import androidx.room.Room;

/**
 * This is an alternative version of the AppDatabase class that uses the Singleton Design Pattern with
 * lazy initialization.
 */
public class AppDatabaseSingleton {
    private static AppDatabase instance;

    /**
     * The constructor must be private to restrict instantiation of the class from other classes.
     */
    private AppDatabaseSingleton() {}

    /**
     * This method returns the instance of the AppDatabaseSingleton class.
     * The instance is created at the first call of this method - lazy initialization.
     * @param context This should be obtained by invoking getApplicationContext() inside Context
     *                class or its subclasses (Activity, etc).
     * @return This returns the one and only instance of the AppDatabase class.
     */
    public static AppDatabase getInstance(Context context)
    {

        if(instance == null){
            instance = Room.databaseBuilder(context,
                    AppDatabase.class, "codesDB").build();

        }
        return instance;
    }

}