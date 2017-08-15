package dao;

import org.sql2o.Sql2o;

/**
 * Created by Guest on 8/15/17.
 */
public class Sql2oAnimalDao implements AnimalDao{

    private final Sql2o sql2o;

    public Sql2oAnimalDao(Sql2o sql2o){
        this.sql2o = sql2o; //making the sql2o object available everywhere so we can call methods in it
    }

}
