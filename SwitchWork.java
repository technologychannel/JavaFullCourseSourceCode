import java.util.Scanner;
public class SwitchWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of day: ");
        int noOfDay = sc.nextInt();

        switch (noOfDay){
            case 1:
                System.out.println("The day is sun.");
                break;
            case 2:
                System.out.println("The day is mon.");
                break;
            case 3:
                System.out.println("The day is tue");
                break;
            case 4:
                System.out.println("The day is wed.");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
