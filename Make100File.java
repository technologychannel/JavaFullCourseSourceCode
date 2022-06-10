import java.io.File;

public class Make100File {
    public static void main(String[] args) {
        for(int i =1; i<=100; i++){
            deleteFile("hello"+i+".txt");
        }
    }

    public static void createFile(String filename){
        try{
            File f = new File(filename);
            if(f.createNewFile()){
                System.out.println("File is created.");
            }else{
                System.out.println("File already exists.");
            }
        }catch (Exception ex){
            System.out.println("Something went wrong.");
        }
    }
    public static void deleteFile(String filename){
        try{
            File f = new File(filename);
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
