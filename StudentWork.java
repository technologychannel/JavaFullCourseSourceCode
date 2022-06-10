public class StudentWork {
    public static void main(String[] args) {
        Student.school = "Diamond School";
        Student s1 = new Student();
        s1.name = "Bimal Sharma";
        s1.address = "Pokhara";

        System.out.println(Student.school);
        System.out.println(s1.name);
        System.out.println(s1.address);

    }
}

class Student{
String name;
String address;
static String school;


}
