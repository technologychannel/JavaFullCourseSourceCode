import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        try{
            File f = new File("hello.txt");
            if(f.delete()){
                System.out.println("File is deleted.");
            }else{
                System.out.println("File not available.");
            }
        }catch (Exception ex){
            System.out.println("Something went wrong.");
        }
    }
}
