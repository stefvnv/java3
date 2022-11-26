import java.rmi.Naming;

public class HouseClient {

    public static void main(String[] args) {
        System.out.println("client started....");
        String url = "rmi:///";
        try {
            HouseInterface h1 = (HouseInterface)Naming.lookup("rmi://localhost:6600/bungalowHouse");
            System.out.println("bungalow owners: " + h1.getOwner());

            //HouseInterface h2 = (HouseInterface)Naming.lookup(url+"dormerHouse");
            //System.out.println("dormer owners: " + h2.getOwner());
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
