import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class HouseServer {

    public static void main(String[] args) {

        System.out.println("server has started");

        try {
            LocateRegistry.createRegistry(6600);
            House bungalow = new House("smiths", "dublin");//create house
            System.out.println("bungalow created");

            House dormer = new House("burkes", "kerry");//create house
            System.out.println("dormer created");
            Naming.rebind("rmi://localhost:6600/bungalowHouse", bungalow);
            Naming.rebind("rmi://localhost:6600/dormerHouse", dormer);
            //Naming.rebind("bungalowHouse", bungalow);//make house accessible
            //Naming.rebind("dormerHouse", dormer);//make house accessible

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
