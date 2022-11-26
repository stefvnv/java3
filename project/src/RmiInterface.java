/**
 * Research Project
 * RMIInterface
 * Stefana Chiritescu
 * A00282343
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Interface that implements RMI
 */
public interface RmiInterface extends Remote {

    //Abstract methods to be inherited
    public void rmi() throws RemoteException;

    public ArrayList<ClientModel> getClientList() throws RemoteException;
}
