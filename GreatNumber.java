public class GreatNumber {
    public static void main(String[] args) {
        int num1 = 9000;
        int num2 = 500;
        int num3 = 1000;

        if(num1 > num2 && num1 > num3){
            System.out.println(num1+ " is great.");
        }else if(num2> num1 && num2 > num3){
            System.out.println(num2+ " is great.");
        }else if(num3 > num2 && num3 > num1){
            System.out.println(num3+ " is great.");
        }else{
            System.out.println("Something went wrong.");
        }

    }
}
