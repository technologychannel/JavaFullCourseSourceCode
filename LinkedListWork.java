import java.util.Collections;
import java.util.LinkedList;
public class LinkedListWork {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Milan");
        names.add("Menuka");
        names.add("Sarita");
        names.add("Kuber");

        names.addFirst("Ambika");
        Collections.sort(names);

        // to print details
        for(String name: names){
            System.out.println(name);
        }
    }
}
