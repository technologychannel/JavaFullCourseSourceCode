import java.io.FileWriter;

public class FileWriterWork {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("hello.txt",true);
            fw.write("Thanks");
            fw.close();
            System.out.println("Success");

        }catch (Exception ex){
            System.out.println("Something went wrong.");
        }
    }
}
