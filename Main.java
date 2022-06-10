import Hostel.Sts;

public class Main {
    public static void main(String[] args) {
        // Creating Object
        Computer c1 = new Computer();
        c1.id = 1;
        c1.price = 80000;
        c1.name = "MSI";

        Computer c2 = new Computer();
        c2.id = 2;
        c2.price = 130000;
        c2.name = "Apple";

        // Print Details From Object

        c1.displayInfo();
        System.out.println("\n");
        c2.displayInfo();

        Sts s1 = new Sts();




    }
}
