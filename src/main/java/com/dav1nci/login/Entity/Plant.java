package com.dav1nci.login.Entity;

public class Plant {

    public String name;
    public String description;
    public String age;
    public String image;

    public Plant(String name, String description, String age, String image) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.image = image;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
