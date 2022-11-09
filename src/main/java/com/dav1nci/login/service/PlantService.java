package com.dav1nci.login.service;

import com.dav1nci.login.Dao.PlantDao;
import com.dav1nci.login.Entity.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PlantService {
    @Autowired
    private final PlantDao plantDao;

    public PlantService(PlantDao plantDao) {
        this.plantDao = plantDao;
    }

    public Collection<Plant> getAllPlants(){
        return this.plantDao.getAllPlants();
    }
    public Plant getPlantByName(String name){
        return this.plantDao.getPlantByName(name);
    }

    public void removePlantByName(String name) {
        this.plantDao.removePlantByName(name);
    }

  /*  public void updatePlant(Plant plant){
        this.plantDao.updatePlant(plant);
    }*/

    public void insertPlant(Plant plant) {
        plantDao.insertPlantToDb(plant);
    }
}
