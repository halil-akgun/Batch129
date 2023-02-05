package day37lambda;

import day36lambda.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda02 {
    /*
        AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
        herhangi bir elemanla eşleşme durumunda true dönecektir.

        AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
        bu şarta uyması durumunda true dönecektir.

        NoneMatch: Şarta göre Stream içindeki hiç bir
        elemanın şartı sağlamaması durumunda true dönecektir.
     */
    public static void main(String[] args) throws IOException {
        // txt icindeki metni konsola yazdir
        Files.lines(Paths.get("src/main/java/day37lambda/lambdaTextFile.txt")).forEach(System.out::println);
        System.out.println("*********************************");

        // her karakteri uppercase yap
        Files.lines(Paths.get("src/main/java/day37lambda/lambdaTextFile.txt")).
                map(String::toUpperCase).forEach(System.out::println);
        System.out.println("*********************************");

        // kelime var mi
        boolean result = Files.
                lines(Paths.get("src/main/java/day37lambda/lambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                anyMatch(t -> t.contains("Java"));
        System.out.println(result);
        System.out.println("*********************************");

        // kelimede a harfi var mi
        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/lambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t -> t.contains("a")); //Her kelime a harfini icerirse sonuc true olur aksi halde false olur.
        System.out.println(result2); // false

        // kelimede x harfi yok mu
        boolean result3 = Files.
                lines(Paths.get("src/main/java/day37lambda/lambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch(t -> t.contains("x"));
        System.out.println(result3); // true

        // 6) LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz
        // 1. yol recommended
        long result4 = Files.
                lines(Paths.get("src/main/java/day37lambda/lambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.endsWith("r")).count();
        System.out.println(result4); // 3
        // 2. yol
        int result5 = Files.
                lines(Paths.get("src/main/java/day37lambda/lambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.endsWith("r")).
                collect(Collectors.toList()).size();
        System.out.println(result5); // 3
    }
}
