package dao;

import models.Animal;

import java.util.List;

/**
 * Created by Guest on 8/15/17.
 */
public interface AnimalDao {
    //create
    void add (Animal animal);


    //read
    public List<Animal> getAll();


    //find
    Animal findById(int id);


    //update
    void update(int id, String content);


    //clear all tasks
    void clearAllAnimals();


    void deleteById(int id);
}
