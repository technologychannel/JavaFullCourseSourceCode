import java.util.Scanner;
public class ConditionWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are voter.");
            System.out.println("Welcome");
        }else{
            System.out.println("You are not voter.");
        }
    }
}
