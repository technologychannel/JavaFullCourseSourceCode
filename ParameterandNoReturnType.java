public class ParameterandNoReturnType {
    public static void main(String[] args) {
            printAge(1997);
    }
//Parameter and NoReturn Type
    public static void add(int n1, int n2){
        int sum = n1 + n2;
        System.out.println("The sum is "+sum);
    }

    public static void printAge(int birthYear){
        int age = 2022 - birthYear;
        System.out.println("Your age is "+age);
    }
}
