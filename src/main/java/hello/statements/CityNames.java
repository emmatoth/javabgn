package hello.statements;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CityNames {
    public static void main(String[] args) {
        System.out.print("Tata" + "\n" + "Budapest" + "\n" + "Győr"); //sortörés
        System.out.print("\n");
        System.out.print("Dad\nTengelic\nAlmás");

        LocalDate date = LocalDate.of(2022,1,31);
        System.out.println(date);
        LocalTime time = LocalTime.of(15,50,20);
        System.out.println(time);
        LocalDateTime datetime = LocalDateTime.of(2022,01,31,15,51,30);
        System.out.println(datetime);
    }
}
