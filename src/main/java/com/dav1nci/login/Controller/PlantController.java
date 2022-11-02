package com.dav1nci.login.Controller;

import com.dav1nci.login.Entity.Plant;
import com.dav1nci.login.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/plants")
public class PlantController {
    @Autowired
    private PlantService plantService;
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Plant> getAllPlants(){
        return plantService.getAllPlants();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Plant getPlantByName(@PathVariable("name") String name){
        return plantService.getPlantByName(name);
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.DELETE)
    public void deletePlantByName(@PathVariable("name") String name){
        plantService.removePlantByName(name);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addPlantByName( Plant plant){
        plantService.updatePlant(plant);
    }
}
