public class RecursionWork {
    public static void main(String[] args) {
        int total = sum(100);
        System.out.println("Total is "+total);
    }
    public static int sum(int num) {
        if (num > 0) {
            return num + sum(num - 1);
        } else {
            return 0;
        }
    }
}
