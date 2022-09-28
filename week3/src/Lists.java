/**
 * Lab 2
 * Part 2 - Lists
 * <p>
 * Stefana Chiritescu
 * A00282343
 */

import java.util.ArrayList;

public class Lists {
    private ArrayList<Billing> theListofPeople = new ArrayList();

    public Lists() {
        theListofPeople.add(new Billing("Martina", 55354, 999734));
        theListofPeople.add(new Billing("Claire", 89845, 150));
        theListofPeople.add(new Billing("Tina", 84584, 6));
        theListofPeople.add(new Billing("Turner", 34534, 873));
    }

    public Billing getRefForName(String bName) {
        for (Billing b : theListofPeople) {
            if (b.getAccountName().equals(bName)) {
                return b;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String name = "Claire";
        System.out.println("name is: " + name);

        Lists list = new Lists();
        Billing b = list.getRefForName("Claire");

         b.printDetails();

    }
}
