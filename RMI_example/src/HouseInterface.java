import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HouseInterface extends Remote {
    public  String getOwner()throws RemoteException;
    public String getAddress() throws RemoteException;
}
