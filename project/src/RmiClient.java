/**
 * Research Project
 * RMIClient
 * Stefana Chiritescu
 * A00282343
 */

import java.rmi.Naming;
import java.util.ArrayList;

public class RmiClient {
    public static void main(String[] args) {
        System.out.println("client started....");
        try {

            // this can be executed on one computer and point to an instance of ClientController on another computer on the same network via IP Address to remotely get the details
            RmiInterface h1 = (RmiInterface) Naming.lookup("rmi://localhost:6600/controllerObject");

            ArrayList<ClientModel> clients = h1.getClientList();
            for (ClientModel client : clients) {
                System.out.println(client.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
