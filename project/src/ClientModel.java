/**
 * Research Project
 * MVC - ClientModel
 * Stefana Chiritescu
 * A00282343
 */

import java.io.Serializable;

public class ClientModel implements Serializable {

    //Model variables
    private final String id;
    private final String ownerName;
    private final String petName;
    private final String address;
    private final String species;
    private final String breed;
    private final String dateOfBirth;
    private final String neutered;

    /**
     * Constructor
     */
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

    /**
     * Returns ID
     */
    public String getId() {
        return id;
    }

    /**
     * Returns owner name
     */
    public String getOwnerName() {
        return ownerName;
    }


    /**
     * Returns pet name
     */
    public String getPetName() {
        return petName;
    }


    /**
     * Returns owner address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Returns pet species
     */
    public String getSpecies() {
        return species;
    }


    /**
     * Returns pet breed
     */
    public String getBreed() {
        return breed;
    }


    /**
     * Returns pet date of birth
     */
    public String getDOB() {
        return dateOfBirth;
    }


    /**
     * Returns pet neutered status
     */
    public String getNeutered() {
        return neutered;
    }


    /**
     * Overrides toString method to print all details of a client, inherited from RMI interface
     */
    @Override
    public String toString() {
        return "Client - "
                + "ID: " + id
                + ", Owner: " + ownerName
                + ", Pet name: " + petName
                + ", Address: " + address
                + ", Species: " + species
                + ", Breed: " + breed
                + ", Pets' Date of birth: " + dateOfBirth
                + ", Neutered: " + neutered;
    }
}
