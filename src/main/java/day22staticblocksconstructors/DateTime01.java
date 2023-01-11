package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {
        Date myDate = new Date();
        System.out.println("myDate = " + myDate); // myDate = Sat Jan 07 23:26:28 TRT 2023
        System.out.println("myDate.getTime() = " + myDate.getTime()); // 1673123302131 --> 01.01.1970den bugüne milisaniye

        // içinde bulunduğumuz an - current time
        System.out.println("LocalDate.now() = " + LocalDate.now()); // 2023-01-07
        System.out.println("LocalTime.now() = " + LocalTime.now()); // 23:34:23.233337500
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now()); // 2023-01-07T23:36:41.759364500
        System.out.println("LocalDateTime.now().atZone(ZoneId.of(\"Asia/Tokyo\")) = " +
                LocalDateTime.now(ZoneId.of("Asia/Tokyo"))); // 2023-01-08T05:44:54.710533200
        // ileri tarihe gitme
        System.out.println("LocalDate.now().plusYears(7) = " + LocalDate.now().plusYears(7).
                plusMonths(5).plusDays(35)); // 2030-07-12
        // geri tarihe gitme
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2)); // 2018-10-05

        // ileri ZAMANa gitme
        System.out.println(LocalTime.now().plusHours(3)); // 02:58:06.296433700

        // geri ZAMANa gitme
        System.out.println(LocalTime.now().minusMinutes(45)); // 23:13:06.296433700

        // zamanda belli bir bölümü alma
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute()); // 0:0

        // tarihte belli bir bölümü alma
        System.out.println(LocalDate.now().getMonth() + "." + LocalDate.now().getDayOfMonth()); // JANUARY.8
        System.out.println(LocalDate.now().getMonthValue() + "." + LocalDate.now().getDayOfMonth()); // 1.8

        // iki tarihi karşılaştırma
        // 02/13/2005 - 03/01/2007
        boolean result = LocalDate.of(2005, 02, 13).isBefore(LocalDate.of(2007, 03, 01));
        System.out.println("result = " + result); // true

        // tarih format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy");
        System.out.println(dtf.format(LocalDate.now())); // 8/1/2023 - "d/M/yyyy"
        System.out.println(dtf.format(LocalDate.now())); // 08/1/2023 - "dd/M/yyyy"
        System.out.println(dtf.format(LocalDate.now())); // 08/01/2023 - "dd/MM/yyyy"
        System.out.println(dtf.format(LocalDate.now())); // 08/Jan/2023 - "dd/MMM/yyy"
        System.out.println(dtf.format(LocalDate.now())); // 08/January/23 - "dd/MMMM/yy"
    }
}
