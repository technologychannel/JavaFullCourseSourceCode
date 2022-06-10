public class HouseWork {
    public static void main(String[] args) {
        // Creating Object: Classname objectName = new Classname();
        House h1 = new House();
        h1.name = "AB House";
        h1.color = "Red";
        h1.price = 2500000;

        House h2 = new House();
        h2.color = "Black";
        h2.name = "BB House";
        h2.price = 16000000;

        h1.printInfo();
        h2.displayColor();


    }
}
// Creating a Class
class House{
    // Properties
    String name;
    String color;
    double price;

    // Functions

    void printInfo(){
        System.out.println("House name is: "+this.name);
        System.out.println("House color is: "+this.color);
        System.out.println("House price is: "+this.price);
        System.out.println("\n");
    }

    void displayColor(){
        System.out.println("House name is: "+this.name);
        System.out.println("House color is: "+this.color);
    }

}
