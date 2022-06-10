import java.util.Scanner;
public class FullName {
    public static void main(String[] args) {
        // Making object of scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fname = sc.nextLine();
        System.out.println("Enter last name: ");
        String lname = sc.nextLine();

        // display full name
        System.out.println("Full name is "+fname + " "+lname);
    }
}
