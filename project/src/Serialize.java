/**
 * Research Project
 * Serialize
 * Stefana Chiritescu
 * A00282343
 */

import java.io.*;
import java.util.ArrayList;

public class Serialize {
    private ArrayList<ClientModel> clientList;


    /**
     * Constructor
     */
    public Serialize() {
        try {
            runner();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Returns the deserialized list
     */
    public ArrayList<ClientModel> getClientList() {
        return deserializedClientList;
    }

    ArrayList<ClientModel> deserializedClientList;


    /**
     * Serializes/deserializes the data at the beginning of the program
     */
    public void runner() throws IOException {
        clientList = new ArrayList<>();

        clientList.add(new ClientModel("653", "Molly Anderson", "Sierra", "432 Rochester Drive, Athlone", "Dog", "Siberian Husky", "07/01/2017", "No"));
        clientList.add(new ClientModel("942", "Elliot Martin", "Matilda", "8692 Springfield, Dublin", "Cat", "Bengal", "23/06/2020", "Yes"));
        clientList.add(new ClientModel("765", "George Black", "Wolfy", "42 River St., Athlone", "Dog", "German Shepherd", "21/05/2015", "No"));
        clientList.add(new ClientModel("663", "Kerry Houston", "Robyn", "98 Animalview, Longford", "Guinea Pig", "Himalayan", "23/06/2022", "Yes"));
        clientList.add(new ClientModel("138", "Peter Leen", "Spotty", "872 Cow St,, Ballymahon", "Dog", "Dalmatian", "05/08/2021", "No"));
        clientList.add(new ClientModel("986", "Mary Perry", "Maxwell", "7 Patrick St., Dublin", "Lizard", "Long-Tailed Gecko", "06/11/2021", "No"));
        clientList.add(new ClientModel("904", "Ben Tenders", "Mittens", "982 Sunset St., Mullingar", "Cat", "British Shorthair", "23/06/2017", "Yes"));
        clientList.add(new ClientModel("874", "Beatrice West", "Luna", "343 Bungalow Road, Athlone", "Dog", "Akita", "02/12/2022", "No"));
        clientList.add(new ClientModel("496", "Bobby Brown", "Pooch", "67 Lord St., Dublin", "Horse", "Arabian", "29/08/2001", "No"));

        try {
            //Deserializing
            FileInputStream fileIn = new FileInputStream("client.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            System.out.println("Deserializing...");


            deserializedClientList = (ArrayList) objectIn.readObject();
            objectIn.close();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println("File did not exist and has now been created.\nRun program again.");

            //Serializing
            FileOutputStream fileOut = new FileOutputStream("client.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(clientList);
        }
    }


    /**
     * Serializes the list that is passed in
     */
    public void runner(ArrayList<ClientModel> updatedList) throws IOException {
        System.out.println("Re-serializing...");

        //Serializing
        FileOutputStream fileOut = new FileOutputStream("client.ser");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(updatedList);
    }
}