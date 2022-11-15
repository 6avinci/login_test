package com.dav1nci.login.Dao;

import com.dav1nci.login.Entity.Plant;

import java.util.Collection;

public interface PlantDao {
    Collection<Plant> getAllPlants();

    Plant getPlantByName(String name);

    void removePlantByName(String name);

    void updatePlant(Plant plant);

    void insertPlantToDb(Plant plant);
}
