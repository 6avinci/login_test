package com.dav1nci.login.service;

import com.dav1nci.login.Entity.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PlantService {
    @Qualifier("fakeData")
    @Autowired
    private final com.dav1nci.login.Dao.fakePlantDaoImpl fakePlantDaoImpl;

    public PlantService(com.dav1nci.login.Dao.fakePlantDaoImpl fakePlantDaoImpl) {
        this.fakePlantDaoImpl = fakePlantDaoImpl;
    }

    public Collection<Plant> getAllPlants(){
        return this.fakePlantDaoImpl.getAllPlants();
    }
    public Plant getPlantByName(String name){
        return this.fakePlantDaoImpl.getPlantByName(name);
    }

    public void removePlantByName(String name) {
        this.fakePlantDaoImpl.removePlantByName(name);
    }

    public void updatePlant(Plant plant){
        this.fakePlantDaoImpl.updatePlant(plant);
    }

    public void insertPlant(Plant plant) {
        fakePlantDaoImpl.insertPlantToDb(plant);
    }
}
