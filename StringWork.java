public class StringWork {
    public static void main(String[] args) {
        String country = "Nepal";
        String capital = "Kathmandu, ";
        String tempValue = "India";

        System.out.println("The length of country is: "+ country.length());
        System.out.println("The length of capital is: "+ capital.length());

        System.out.println("Address is "+capital.concat(country));
        System.out.println("Is country equal to temp value: "+country.equals(tempValue));

        String value = "Hello i am from Pokhara. Pokhara is beautiful city.";
        String newValue = value.replace("Pokhara", "Kathmandu");
        System.out.println(newValue);

        System.out.println(country.substring(2,5));
        System.out.println(country.toUpperCase());
        System.out.println(country.toLowerCase());

    }
}
