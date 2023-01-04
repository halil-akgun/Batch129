package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive:       char    - boolean - byte - short - int     - long - float - double
        //Wrapper Class: Character - Boolean - Byte - Short - Integer - Long - Float - Double
        //Wrapper Class'lar non-primitive'dir o yuzden memory'de cok yer kaplarlar, o yuzden sart degilse Wrapper Class kullanmayi tercih etmeyiz.

        int n = 12;//"n" yazip "nokta" koyarsaniz hic method goremezsiniz, cunku "primitive" ler method icermez.
        Integer m = 12;//"m" yazip "nokta" koyarsaniz bircok method gorursunuz, cunku "wrapper class" lar method icerir.

        byte p = 23;
        Byte r = 43;


        //Example 1: short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);


        //Example 2: int data type'inin minimum degeri ile byte data type'inin maximum degerinin toplamini bulunuz.
        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInt + maxByte);

        System.out.println(Integer.MIN_VALUE + Byte.MAX_VALUE);


        // autoboxing: primitive'den wrapper'a çevirme
        int num = 22;
        Integer wrapperNum = num;

        // unboxing: wrapper'dan primitive'ye çevirme
        Byte k = 43;
        byte primitiveK = k;


        char initial = 'A';
        Character initialWrapper = initial;
        Boolean isOld = true;
        boolean isOldWrapper = isOld;
        System.out.println(initialWrapper + " - " + isOldWrapper);


        //Java'da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur.
        //Java'da "+" sembolu iki String arasinda veya bir String ve bir sayi arasinda kullanilirsa "concatenation islemi" olur.
        //Note: Concatenation islemlerinde Java matematikteki islem önceligi kurallarini kullanir.
        //Islem onceligi kurallari: i)Once uslu sayilar ii)Parantez ici islemler yapilir iii)Carpma ve bolme iv) Toplama ve cikarma
        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt + shoes); //23005200

        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat); //7500


        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio); //$11000$3000

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio); // HATA --> hepsi rakam olmalı
    }

}