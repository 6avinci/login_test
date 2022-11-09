package com.dav1nci.login.Dao;

import com.dav1nci.login.Entity.Plant;
import org.springframework.stereotype.Repository;

import java.util.Collection;
/*import java.util.HashMap;
import java.util.List;*/
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class PlantDao {

    // public static final List<Plant> TEST_PLANTS;

    final static Map<String, Plant> plants;
   // Plant[] plants

    static {
        plants = Stream.of( new Plant("Dattelpalme", "Ich bin eine Dattelpalme. Ich wachse üblicherweise in warmen Breitengraden und werfe gewöhnungsbedürftige Früchte ab.", "assets/img/user/1.jpg", "Lebenszeit: ca. 150 Jahre"),
                            new Plant( "Holunder", "Ich bin eine Holunderblüte. Aus meiner Frucht kann man vorzügliche Brände brennen!", "assets/img/user/2.jpg", "Lebenszeit: ca. 100 Jahre"),
                            new Plant( "Lilie", "Hier spricht die Lilie. Mir wird immer nachgesagt, ich sei eine sehr schöne Zierpflanze!", "assets/img/user/3.jpg", "Lebenszeit: ca. 2 Jahre"),
                            new Plant( "Magnolie", "Bei mir handelt es sich um eine Magnolie.", "assets/img/user/4.jpg", "Lebenszeit: ca. 100 Jahre"),
                            new Plant( "Maiglöckchen", "Ich, als Maiglöckchen, muss sagen dass ich sehr giftig darauf reagiere, gegessen zu werden!", "assets/img/user/5.jpg", "Lebenszeit: ca. 7 Tage"),
                            new Plant("Rose", "Ich habe Stacheln um mich zu verteidigen. Nenn mich Rose!", "assets/img/user/6.jpg", "Lebenszeit: ca. 5 Jahre"),
                            new Plant("Schilfgras", "Ich, das Schilfgras, sorge dafür dass Bodenbrüter einen guten Platz zum nisten haben!", "assets/img/user/7.jpg", "Lebenszeit: ca. 7 Jahre"),
                            new Plant( "Wacholder", "Bei mir handelt es sich um Wacholder. Unter anderem bin ich eine wighting Zutat für Gin!", "assets/img/user/8.jpg", "Lebenszeit: ca. 600 Jahre"))
                .collect(Collectors.toMap(Plant::getName, Function.identity()));

        plants = new HashMap<>() {
            {
                put(new Plant(1, "Dattelpalme", "Ich bin eine Dattelpalme. Ich wachse üblicherweise in warmen Breitengraden und werfe gewöhnungsbedürftige Früchte ab.", "assets/img/user/1.jpg", "Lebenszeit: ca. 150 Jahre"));
                put(String.valueOf(2), new Plant("Holunder", "Ich bin eine Holunderblüte. Aus meiner Frucht kann man vorzügliche Brände brennen!", "assets/img/user/2.jpg", "Lebenszeit: ca. 100 Jahre"));
                put(String.valueOf(3), new Plant("Lilie", "Hier spricht die Lilie. Mir wird immer nachgesagt, ich sei eine sehr schöne Zierpflanze!", "assets/img/user/3.jpg", "Lebenszeit: ca. 2 Jahre"));
                put(String.valueOf(4), new Plant("Magnolie", "Bei mir handelt es sich um eine Magnolie.", "assets/img/user/4.jpg", "Lebenszeit: ca. 100 Jahre"));
                put(String.valueOf(5), new Plant("Maiglöckchen", "Ich, als Maiglöckchen, muss sagen dass ich sehr giftig darauf reagiere, gegessen zu werden!", "assets/img/user/5.jpg", "Lebenszeit: ca. 7 Tage"));
                put(String.valueOf(6), new Plant("Rose", "Ich habe Stacheln um mich zu verteidigen. Nenn mich Rose!", "assets/img/user/6.jpg", "Lebenszeit: ca. 5 Jahre"));
                put(String.valueOf(7), new Plant("Schilfgras", "Ich, das Schilfgras, sorge dafür dass Bodenbrüter einen guten Platz zum nisten haben!", "assets/img/user/7.jpg", "Lebenszeit: ca. 7 Jahre"));
                put(String.valueOf(8), new Plant("Wacholder", "Bei mir handelt es sich um Wacholder. Unter anderem bin ich eine wichtige Zutat für Gin!", "assets/img/user/8.jpg", "Lebenszeit: ca. 600 Jahre"));
            }
        };

    }

    public Collection<Plant> getAllPlants() {
        return plants.values();
    }

    public Plant getPlantByName(String name) {
        return plants.get(name);
    }

    public void removePlantByName(String name) {
        plants.remove(name);
    }

    public void updatePlant(Plant plant) {
        Plant p = plants.get(plant.getName());
        p.setDescription(plant.getDescription());
        p.setName(plant.getName());
        p.setAge(plant.getAge());
        p.setImage(plant.getImage());
        plants.put(plant.getName(), plant);
    }

    public void insertPlantToDb(Plant plant) {
        plants.put(plant.getName(), plant);
    }
}
