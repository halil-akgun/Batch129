package advanced_practice.practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_Manav {
    /*
	     Basit bir 5 ürünlü manav alışveris programı yazınız.
	 * 1. Adim : Ürün ve fiyat listesi oluştur.
	 * 2. Adim : Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
	 * 3. Adim : Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
	 * 4. Adim : Alışveriş bitince ödemesi gereken tutarı göster.
	 * 5. Adim : Başka bir ürün almak isteyip istemediğini sor.
	 * 			 İstemiyorsa ödenecek tutarı göster, istiyorsa tekrar ürün seçtir.
	 * 			 Bu iþlemi alışveriş bitene kadar tekrarla.
	 */
    static List<String> urunListesi = new ArrayList<>();
    static double toplamOdeme;

    public static void main(String[] args) {
        urunListesi.add("ürün kodu 1 - Domates - Fiyatı: 20");
        urunListesi.add("ürün kodu 2 - Biber - Fiyatı: 10");
        urunListesi.add("ürün kodu 3 - Patates - Fiyatı: 10");
        urunListesi.add("ürün kodu 4 - Elma - Fiyatı: 15");
        urunListesi.add("ürün kodu 5 - Muz - Fiyatı: 30");
        for (String w : urunListesi) {
            System.out.println(w);
        }
        musteriSecimi();
    }

    static void musteriSecimi() {
        Scanner scan = new Scanner(System.in);
        System.out.print("ürün kodu: ");
        int kod = scan.nextInt();
        System.out.print("kilo: ");
        int kilo = scan.nextInt();
        toplamOdeme += Integer.parseInt(urunListesi.get(kod - 1).split(" ")[urunListesi.get(kod - 1).split(" ").length - 1]) * kilo;

        System.out.println("devam etmek için d'ye, kasa için herhangi bir tuşa basın.");
        if (scan.next().equalsIgnoreCase("d")) {
            musteriSecimi();
        } else {
            System.out.println("Hesap: " + toplamOdeme);
        }
    }
}
