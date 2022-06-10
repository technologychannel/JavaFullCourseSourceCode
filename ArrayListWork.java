import java.util.ArrayList;
import java.util.Collections;
public class ArrayListWork {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Milan");
        names.add("Menuka");
        names.add("Sarita");
        names.add("Kuber");

        Collections.sort(names, Collections.reverseOrder());

        for(String name: names){
            System.out.println(name);
        }

    }
}
