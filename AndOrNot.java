public class AndOrNot {
    public static void main(String[] args) {
        int userid = 10;
        int pin = 5555;

        System.out.println(userid == 10 && pin == 5555);
        System.out.println(userid == 1 || pin == 56);
        System.out.println(!(userid == 10 && pin == 5555));

    }
}
