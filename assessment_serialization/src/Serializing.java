/**
 * Assignment 2 - Serialization
 * Part 1 - Serializing
 * Stefana Chiritescu
 * A00282343
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializing {

    public Serializing() {
        try {
            runner();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    List<Phone> deserializedPhoneList;

    public void runner() throws IOException {
        List<Phone> phoneList = new ArrayList<>();

        phoneList.add(new Phone("Sony", "Experia X", 32, 12.5, 4.6, true, 150));
        phoneList.add(new Phone("Sony", "Experia Z", 64, 14.2, 5.6, true, 175));
        phoneList.add(new Phone("Samsung", "Galaxy M", 64, 14.5, 5.4, true, 180));
        phoneList.add(new Phone("Nokia", "3330", 16, 13.2, 2.3, false, 90));
        phoneList.add(new Phone("Motorola", "M1", 8, 11.3, 4.9, true, 100));
        phoneList.add(new Phone("iPhone", "6", 32, 13.5, 6.4, true, 250));
        phoneList.add(new Phone("Alcatel", "A3", 8, 9.3, 2.4, false, 50));

        try {
            //Deserializing
            FileInputStream fileIn = new FileInputStream("phone.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            deserializedPhoneList = (ArrayList) objectIn.readObject();

            //delete the Alcatel object
            deserializedPhoneList.remove(6);

            //add a new phone to the list
            deserializedPhoneList.add(new Phone("iPhone", "14 Pro Max", 128, 48, 6.69, true, 1000));

            objectIn.close();

            //use enhanced for loop to print each of the objects
            for (Phone phone : deserializedPhoneList) {
                System.out.println(phone.toString());
            }

        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println("Sorry file is not available... will create one!");

            //Serializing
            FileOutputStream fileOut = new FileOutputStream("phone.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(phoneList);
        }
    }

    public static void main(String[] args) {
        new Serializing();
    }
}
