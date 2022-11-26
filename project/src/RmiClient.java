/**
 * Research Project
 * RMIClient
 * Stefana Chiritescu
 * A00282343
 */

import java.rmi.Naming;
import java.util.ArrayList;

public class RmiClient {

    /**
     * Starts RMI client
     */
    public static void main(String[] args) {
        System.out.println("RMI client started...\n");
        try {

            //Can be executed on one computer and point to an instance of ClientController on another computer on the same network via IP Address
            RmiInterface h1 = (RmiInterface) Naming.lookup("rmi://localhost:6600/controllerObject");

            //Gets the client list remotely
            ArrayList<ClientModel> clients = h1.getClientList();

            //Loops through the list of clients printing their data
            for (ClientModel client : clients) {
                System.out.println(client.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
