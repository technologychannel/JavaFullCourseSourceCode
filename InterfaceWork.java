public class InterfaceWork {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.run();

        Bike b1 = new Bike();
        b1.run();
    }
}

interface Vechicle{
    void run();
}
class Car implements Vechicle{
    public void run(){
        System.out.println("Car runs with 4 wheel...");
    }
}

class Bike implements  Vechicle{
    public void run(){
        System.out.println("Bike runs with 2 wheels.");
    }
}