import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class House extends UnicastRemoteObject implements HouseInterface {
    private String owner;
    private String address;

    public House(String owner, String address) throws RemoteException {
        this.owner = owner;
        this.address = address;
    }

    protected House(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    @Override
    public String getOwner() throws RemoteException {
        return this.owner;
    }

    @Override
    public String getAddress() throws RemoteException {
        return this.address;
    }
}
