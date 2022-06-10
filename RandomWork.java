public class RandomWork {
    public static void main(String[] args) {
        generateRandomNumber(90,800);

    }

    public static void generateRandomNumber(int min, int max){
        int num = (int)(Math.random() * (max - min + 1) + min );
        System.out.println(num);
    }
}
