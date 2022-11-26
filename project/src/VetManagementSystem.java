import java.rmi.RemoteException;

public class VetManagementSystem {

    /**
     * Starts the application
     */
    public static void main(String[] args) {
        try {
            new ClientController();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
