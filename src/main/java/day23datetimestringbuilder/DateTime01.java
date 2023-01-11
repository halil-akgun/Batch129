package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        // time'ı formatla
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime); // 21:42:06.750701700

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm a");
        System.out.println(dtf.format(myTime)); // 09-44 PM

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH-mm");
        System.out.println(dtf2.format(myTime)); // 21-47

    }
}
