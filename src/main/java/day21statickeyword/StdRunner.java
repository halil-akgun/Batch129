package day21statickeyword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StdRunner {
    public static void main(String[] args) {
        // stdname static olduğundan ona ulaşmak için obje oluşturmadım, sadece class ismi kullanmak yeterli
        System.out.println("Student.stdName = " + Student.stdName);

        // age nonstatic olduğu için ona ulaşmak için obje oluşturmak gerekir
        Student std1 = new Student();
        System.out.println("std1.age = " + std1.age);
        System.out.println("Student.getInitials(\"tom cruise\") = " + Student.getInitials("tom cruise")); // tc
        System.out.println("std1.countVowels(\"halil\") = " + std1.countVowels("halil")); // 2
        // static olanları obje ile çağırmak TAVSİYE EDİLMEZ:
        System.out.println("std1.getInitials(\"ali can\") = " + std1.getInitials("ali can"));

        // list oluşturma kısayol
        List<String> char2 = List.of("x", "y", "z");
        System.out.println("char2 = " + char2);
        // char2.add("q"); --> ekleme yapılamıyor
        // char2.remove("x"); --> çıkarma yapılamıyor  (asList gibi sanırım)


        List<String> char1 = new java.util.ArrayList<>(List.of("a", "b", "c", "d"));
        //List<String> char1 = new ArrayList<>(List.of("a", "b", "c", "d")); --> ArrayList import edilirse böyle
        System.out.println("char1 = " + char1);
        char1.add("e");
        System.out.println("char1 = " + char1);

        String arr[] = {"1","2","3"};
        List<String> brr = new ArrayList<>(List.of(arr));
        System.out.println(brr);
        brr.add("4");
        System.out.println(brr);

    }
}
