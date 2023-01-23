package advanced_practice.practice10.okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OkulMain {
    /*
         1- Değişkenleri ad, soyad, yaş olan bir Ogrenci pojo class'ı oluşturunuz.
         2- Değişkenleri okulAd, maxOgrenciSayisi, ArrayList cinsinden Öğrencileri olan bir Okul pojo class oluşturunuz
         3- Main metodunun olduğu OkulMain isimli bir class oluşturunuz.
         4- Bir okul objesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci ekleyiniz.
            Fakat oluşturacağınız öğrencilerin yaşı 15'i geçmemeli, 8'den küçük olmamalı.
            Bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
     */
    public static void main(String[] args) {
//        System.out.println("new Ogrenci().getAd() = " + new Ogrenci("ali", "can", 33).getAd());
//        Ogrenci ogr = new Ogrenci("ali", "can", 12);
//        Ogrenci ogr2 = new Ogrenci("ali", "can2", 13);
//        List<Ogrenci> liste = new ArrayList<>();
//        liste.add(ogr);
//        liste.add(ogr2);
//        ogr2.setAd("aaaa");
//        Okul okul = new Okul("Birgivi", 50, liste);
//        System.out.println("okul = " + okul);

        Scanner input = new Scanner(System.in);
        Okul okul = new Okul();
        System.out.print("okul adı: ");
        okul.setOkulAdi(input.nextLine());
        System.out.print("okul adı: ");
        okul.setMaxOgrenciSayisi(input.nextInt());

        for (int i = 0; i < okul.getMaxOgrenciSayisi(); i++) {

        }


    }
}
