/**
 * Created by Guest on 8/15/17.
 */
public class Animal {
    private String name;
    private String gender;
    private String dateOfAdmittance;
    private String animalType;
    private String breed;


    public Animal(){
        this.name = name;
        this.gender = gender;
        this.animalType = animalType;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfAdmittance() {
        return dateOfAdmittance;
    }

    public void setDateOfAdmittance(String dateOfAdmittance) {
        this.dateOfAdmittance = dateOfAdmittance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
