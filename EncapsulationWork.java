public class EncapsulationWork {
    public static void main(String[] args) {
        Bag b1 = new Bag();
        b1.setId(1);
        b1.setName("Black Bag");


        Bag b2 = new Bag();
        b2.setId(2);
        b2.setName("Allo Bag");


        Bag b3 = new Bag();
        b3.setId(3);
        b3.setName("Hemp Bag");

        System.out.println(b1.getName());
        System.out.println(b2.getName());
        System.out.println(b3.getName());

    }
}

class Bag{
    // Properties
   private int id;
   private String name;

   // Creating Getter and Setter

    public void setId(int id) {
        if(id == 0){
            System.out.println("invalid id");
        }else{
            this.id = id;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
