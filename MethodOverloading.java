public class MethodOverloading {

    public static void main(String[] args) {
        add(20.3,30);
    }

    public static void add(int n1, int n2){
        System.out.println("Sum is "+(n1+n2));
    }
    public static void add(double n1, int n2){
        System.out.println("Sum is "+(n1+n2));
    }
    public static void add(int n1, int n2, int n3){
        System.out.println("Sum is "+(n1+n2+n3));
    }
}
