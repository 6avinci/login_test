package com.dav1nci.login.Dao;

import com.dav1nci.login.Entity.Plant;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Qualifier("mongoData")
@Primary
@Repository
public class MongoPlantDaoImpl implements PlantDao{
    @Override
    public Collection<Plant> getAllPlants() {
        return new ArrayList<Plant>(){
            {
                add(new Plant("Kastanie","Ich trage stachelige Früchte" , "75 Jahre", "not available"));
            }
        };
    }

    @Override
    public Plant getPlantByName(String name) {
        return null;
    }

    @Override
    public void removePlantByName(String name) {

    }

    @Override
    public void updatePlant(Plant plant) {

    }

    @Override
    public void insertPlantToDb(Plant plant) {

    }
}
