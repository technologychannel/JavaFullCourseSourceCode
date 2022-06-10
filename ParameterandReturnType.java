public class ParameterandReturnType {
    //Parameter and Return Type
    public static void main(String[] args) {
       int sum =  add(50,70);
        System.out.println("The sum is "+sum);
        String firstName = "Bimal";
        String lastName = "Sharma";

       String fullName =  getFullName(firstName, lastName);
        System.out.println(fullName);

        double interest = getSI(50000,2,3);
        System.out.println("SI is "+ interest);
    }

    public static int add(int num1, int num2){
        return num1+num2;
    }

    public static String getFullName(String fname, String lname){
        return "Full name is: "+ fname + " "+ lname;
    }

    public static double getSI(double p, double t, double r){
        return  (p*t*r)/100;
    }

}
