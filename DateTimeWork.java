package Hostel;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class DateTimeWork {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Local Date is "+date);

        LocalTime time = LocalTime.now();
        System.out.println("Local time is "+time);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local Datetime is "+ldt);


        System.out.println("Year is "+date.getYear());
        System.out.println("Month is "+date.getMonth());
        System.out.println("Day is "+date.getDayOfMonth());
    }
}
