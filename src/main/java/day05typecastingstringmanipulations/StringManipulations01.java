package day05typecastingstringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        /*
          Bir methodu öğrenirken 3 şeyi mutlaka öğrenin;
          1)Bu method ne iş yapar?
          2)Bu methodun farklı kullanımları nasıldır?
          3)Bu method size ne return eder?
         */

        String s = "Java is easy";

        // Example 1: tümünü büyük harf yapma
        System.out.println(s.toUpperCase());

        // Example 2: tümünü küçük harf yapma
        System.out.println(s.toLowerCase());

        //Example 3: "s" String'indeki ilk character'i aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar); // J

        //Example 4: "s" String'indeki ikinci ve sondan ikinci character'i aliniz ve ekrana yanyana yazdiriniz.
        System.out.println(s.charAt(1) + "" + s.charAt(s.length() - 2));

        //Example 5: "s" String'inde kullanilan character sayisini bulunuz.
        int sLenght = s.length();
        System.out.println(sLenght);

        //Example 6 : "s" String'indeki ilk 4  karakteri bulunuz
        System.out.println(s.substring(0, 4)); // ilk index dahil, son index dahil değil

        //Example 7: "s" String'indeki "is" kelimesini aliniz.
        System.out.println(s.substring(5, 7));

        //Example 8: "s" String'indeki "easy" kelimesini aliniz.
        System.out.println(s.substring(8));

        //Example 9: "s" String'inde "money" kelimesinin var olup olmadığını kontrol ediniz
        System.out.println(s.contains("money")); // büyük-küçük harf duyarlıdır

        //Example 10: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Example 11: "s" String'inin 6. characterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isBegin = s.startsWith("i", 5); // 5: ilk beş karakteri at
        System.out.println(isBegin);

    }
}
