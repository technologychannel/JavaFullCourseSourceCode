import java.util.HashMap;

public class HashMapWork {

    public static void main(String[] args) {
        HashMap<String, String> countryCapital = new HashMap<String, String>();
        countryCapital.put("nepal", "Kathmandu");
        countryCapital.put("india", "New Delhi");
        countryCapital.put("us","WDC");

       // System.out.println(countryCapital.get("nepal"));
//        for (String i : countryCapital.keySet()) {
//            System.out.println(i);
//        }

//        for (String i : countryCapital.values()) {
//            System.out.println(i);
//        }
        for (String i : countryCapital.keySet()) {
            System.out.println("The capital city of : " + i + "  is: " + countryCapital.get(i));
        }
    }
}


