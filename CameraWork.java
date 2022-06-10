public class CameraWork {
    public static void main(String[] args) {
        Camera c1 = new Camera(1, "Sony");
        Camera c2 = new Camera(1, "Canon");

        System.out.println(c1.id);

    }
}

class Camera{
     int id;
    String name;

    Camera(int id, String name){
        this.id = id;
        this.name = name;
    }

    void printDetails(){
        System.out.println("Id is "+this.id);
        System.out.println("Name is "+this.name);
    }

}
