package day23datetimestringbuilder.reviewday23datetimestringbuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        // time'ı formatla
        LocalTime time = LocalTime.now();
        System.out.println(time); // 21:13:08.771353100

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm-a");
        System.out.println(dtf.format(time)); // 09:14-PM

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(">> HH:mm <<");
        System.out.println(dtf2.format(time)); // >> 21:16 <<

        LocalDate date = LocalDate.now();

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(dtf3.format(date)); // 10.01.2023

    }
}
