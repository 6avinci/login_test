package com.dav1nci.login.Controller;

import com.dav1nci.login.Entity.Plant;
import com.dav1nci.login.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

// import java.awt.*;
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

    @GetMapping(value = "/{name}")
    public Plant getPlantByName(@PathVariable("name") String name){
        return plantService.getPlantByName(name);
    }

    @DeleteMapping(value = "/{name}")
    public void deletePlantByName(@PathVariable("name") String name){
        plantService.removePlantByName(name);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePlantByName(@RequestBody Plant plant){
        plantService.insertPlant(plant);
    }
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertPlantByName(@RequestBody Plant plant){
        plantService.insertPlant(plant);
    }
}
