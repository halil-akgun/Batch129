package day02datatypesmethodcreation;

public class Variables01 {

    // primitive data types: char - boolen - byte - short - int - long - float - double
    // float: ondalık sayılar - DECIMAL numbers (ex: 12.89) - 4 byte
    // double: ondalık sayılar - DECIMAL numbers (ex: 12.878965419) - 8 byte


    //Note 1: primitive data type'larini Java olusturmustur, biz olusturamayiz
    //Note 2: primitive data type'larinin isimlerinde sadece kucuk harf kullanilir
    //Note 3: primitive data'lar data type'lara gore memory de farkli farkli yer kaplarlar
    //Note 4: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar

    public static void main(String[] args) {
        //Ornek 1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.
        // Note: Java DECIMAL numbers'ı otomatik double kabul eder. floatta sona F ekle
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        System.out.println(shirtPrice + shoesPrice);

        //Ornek 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin
        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;
        System.out.println(weightCell - weightAmip); // 8.9E-14 --> 8,9 x 10 üzeri -14

    }
}
