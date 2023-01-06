package day21statickeyword;

import java.util.List;

public class StdRunner {
    public static void main(String[] args) {
        // stdname static olduğundan ona ulaşmak için obje oluşturmadım, sadece class ismi kullanmak yeterli
        System.out.println("Student.stdName = " + Student.stdName);

        // age nonstatic olduğu için ona ulaşmak için obje oluşturmak gerekir
        Student std1 = new Student();
        System.out.println("std1.age = " + std1.age);
        System.out.println("Student.getInitials(\"tom cruise\") = " + Student.getInitials("tom cruise"));
        System.out.println("std1.countVowels(\"halil\") = " + std1.countVowels("halil"));
        // static olanları obje ile çağırmak TAVSİYE EDİLMEZ:
        System.out.println("std1.getInitials(\"ali can\") = " + std1.getInitials("ali can"));

        List<String> char1 = List.of("a", "b", "c", "d");
        System.out.println("char1 = " + char1);

    }
}
