public class MyMathWork {
    public static void main(String[] args) {
        int number1 = 500;
        int number2 = 200;

        System.out.println("Max num: "+ Math.max(number1 , number2));
        System.out.println("Min num: "+ Math.min(number1 , number2));
        System.out.println("Round Value of 10.99:  "+Math.round(10.5));
        System.out.println("Floor Value:  "+Math.floor(10.8)); // output 10.0
        System.out.println("Ceil Value:  "+Math.ceil(10.1)); // output 11.0
        System.out.println("Square Root: "+Math.sqrt(25)); // output 5.0
        System.out.println("Cube: "+Math.pow(5,3)); // output 125.0
    }
}
