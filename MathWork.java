public class MathWork {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        System.out.println("Max Number: "+Math.max(n1,n2));
        System.out.println("Min Number: "+Math.min(n1,n2));
        System.out.println("Round Value: "+Math.round(10.5));
        System.out.println("Floor Value: "+Math.floor(10.99)); // output 10.0
        System.out.println("Ceil Value: "+Math.ceil(10.1)); // output 11.0
        System.out.println("Square Root: "+Math.sqrt(25)); // output 5.0
        System.out.println("Cube: "+Math.pow(5,3)); // output 125.0
    }

}
