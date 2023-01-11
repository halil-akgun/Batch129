package day23datetimestringbuilder.reviewday23datetimestringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
/*
    javada string class veya stringbuilder ile string oluşturulabilir.
    String class stringleri "immutable"dir. (dğiştirilemez)
    StringBuilder class stringleri "mutable"dir. (dğiştirilebilir)
 */
        // immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String'i degistirdikten sonra ayni String assign ederseniz, Java yine yeni bir container olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler.
        String a = "money";
        a += "more";

        // mutable
        // StringBuilder ile string üretmenin 1. yolu
        StringBuilder stb1 = new StringBuilder("asd");
        System.out.println(stb1);

        // StringBuilder ile string üretmenin 2. yolu
        StringBuilder stb2 = new StringBuilder();
        stb2.append("qwert");
        System.out.println(stb2);

        // StringBuilder ile string üretmenin 3. yolu
        StringBuilder stb3 = new StringBuilder(2);
        stb3.append("HG");
        System.out.println(stb3);

        //insert() methodu verilen sayi karakteri kadar es gecip istenen characteri eklemeye yarar.
        //insert() methodu append() gibi StringBuilder'i direkt degistirir
        stb2.insert(2, "123");
        System.out.println(stb2);

        // ters çevirir
        stb2.reverse();
        System.out.println(stb2);

        // deleteCharAt
        stb2.deleteCharAt(0);
        System.out.println(stb2);

        // delete
        stb2.delete(2, 5);
        System.out.println(stb2);

        // sözlük sırasına göre bakar  --  ilk harf eşitse sonrakilere bakar,  kelimeler aynı olursa=>0
        // Java - Kava --> -1  j k'den bir geri
        StringBuilder stb4 = new StringBuilder("hal");
        StringBuilder stb5 = new StringBuilder("bal");
        System.out.println(stb4.compareTo(stb5)); // 6  -> 'h' 'b' den 6 ileride

        // setCharAt
        stb5.setCharAt(2, 'ş');
        ;
        System.out.println(stb5);

        // replace
        stb5.replace(0, 1, "k");
        System.out.println(stb5);

        // substring() methodu String Class metodudur. String return eder. StringBuilder'in orjinal degerini degistiremez.
        // Java data tipleri uyusmadigindan dolayi degisimi kabul etmez.
        // string metodu SB'ı değiştiremez, ayrı bir değişkene koymak gerelir

    }
}
