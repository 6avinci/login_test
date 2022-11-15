package com.dav1nci.login.service;

import com.dav1nci.login.Entity.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Qualifier("mongoData")

@Service
public class PlantService {
    @Autowired
    private final com.dav1nci.login.Dao.PlantDao PlantDao;

    public PlantService(com.dav1nci.login.Dao.PlantDao PlantDao) {
        this.PlantDao = PlantDao;
    }

    public Collection<Plant> getAllPlants(){
        return this.PlantDao.getAllPlants();
    }
    public Plant getPlantByName(String name){
        return this.PlantDao.getPlantByName(name);
    }

    public void removePlantByName(String name) {
        this.PlantDao.removePlantByName(name);
    }

    public void updatePlant(Plant plant){
        this.PlantDao.updatePlant(plant);
    }

    public void insertPlant(Plant plant) {
        PlantDao.insertPlantToDb(plant);
    }
}
