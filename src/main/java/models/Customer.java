package models;

/**
 * Created by Guest on 8/15/17.
 */
public class Customer {
    private String name;
    private String phone;
    private String animalTyoePreference;
    private String breedPreference;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAnimalTyoePreference() {
        return animalTyoePreference;
    }

    public void setAnimalTyoePreference(String animalTyoePreference) {
        this.animalTyoePreference = animalTyoePreference;
    }

    public String getBreedPreference() {
        return breedPreference;
    }

    public void setBreedPreference(String breedPreference) {
        this.breedPreference = breedPreference;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
