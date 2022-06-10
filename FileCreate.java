import java.io.File;
public class FileCreate {
    public static void main(String[] args) {
        try{
            File f = new File("hello.txt");
            if(f.createNewFile()){
                System.out.println("File is created.");
            }else{
                System.out.println("File already exists.");
            }
        }catch (Exception ex){
            System.out.println("Something went wrong.");
        }

    }
}
