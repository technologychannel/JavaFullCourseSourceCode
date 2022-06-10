import java.util.Scanner;
public class IfElseIfWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of day: ");
        int noOfDay = sc.nextInt();
        if(noOfDay == 1){
            System.out.println("The day is sun.");
        }else if(noOfDay == 2){
            System.out.println("The day is mon.");
        }else if(noOfDay == 3){
            System.out.println("The day is tue.");
        }else if(noOfDay == 4){
            System.out.println("The day is wed.");
        }else if(noOfDay == 5){
            System.out.println("The day is thu.");
        }else  if(noOfDay == 6){
            System.out.println("The day is fri.");
        }else if(noOfDay == 7){
            System.out.println("The day is sat.");
        }else{
            System.out.println("Invalid Option");
        }
    }
}
