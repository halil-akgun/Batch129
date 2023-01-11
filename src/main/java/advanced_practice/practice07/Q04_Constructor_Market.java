package advanced_practice.practice07;

public class Q04_Constructor_Market {
    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız.
    //Birim fiyatı 99 lira üzeri olan ürünlere %10 vergi indirimi uygulayınız.
    public static void main(String[] args) {
        Market obje1 = new Market("çikolata",20.0, 6);
        System.out.println(obje1);
        Market obje2 = new Market("peynir", 100, 3);
        System.out.println(obje2);
        Market obje3 = new Market("deterjan", 200);
        System.out.println(obje3);
        Market obje4 = new Market();
        System.out.println(obje4);
    }
}
