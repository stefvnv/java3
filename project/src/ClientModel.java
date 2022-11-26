/**
 * Research Project
 * MVC - ClientModel
 * Stefana Chiritescu
 * A00282343
 */

import java.io.Serializable;

public class ClientModel implements Serializable{
    private String id;
    private String ownerName;
    private String petName;
    private String address;
    private String species;
    private String breed;
    private String dateOfBirth;
    private String neutered;

    public ClientModel(String id, String ownerName, String petName, String address, String species, String breed, String dateOfBirth, String neutered) {
        this.id = id;
        this.ownerName = ownerName;
        this.petName = petName;
        this.address = address;
        this.species = species;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.neutered = neutered;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDOB() {
        return dateOfBirth;
    }

    public void setDOB(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNeutered() {
        return neutered;
    }

    public void setNeutered(String neutered) {
        this.neutered = neutered;
    }


    @Override
    public String toString() {
        return "ClientModel{" +
                "id='" + id + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", petName='" + petName + '\'' +
                ", address='" + address + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", neutered='" + neutered + '\'' +
                '}';
    }
}
