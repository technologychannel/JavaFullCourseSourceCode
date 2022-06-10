public class ArrayWork {
    public static void main(String[] args) {

        String [] names = {"Milan","Bishworaj", "Hari", "Gopal", "Sarmila", "Menuka"};

        // Index: 0 bata count hunxa.
        // Length: 1 bata count hunxa.
        System.out.println("Total Names: " + names.length);

        // Change Milan to Shyam
        names[0] = "Shyam";


//       for(int i = 0; i<names.length; i++){
//           System.out.println(names[i]);
//       }

        for(String name: names){
            System.out.println(name);
        }


    }
}
