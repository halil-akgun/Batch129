package advanced_practice.practice12;

import java.util.HashMap;
import java.util.Map;

public class Q02_Map_FiyatToplami {
    /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
    */
    public static void main(String[] args) {
        HashMap<String, Double> products = new HashMap<>();
        products.put("Kemer", 19.99);
        products.put("Gömlek", 29.99);
        products.put("Ayakkabı", 89.99);
        products.put("Kazak", 24.99);
        products.put("Kravat", 19.99);

        System.out.println("sumPrices(products) = " + sumPrices(products));
    }

    static double sumPrices(Map<String, Double> map) {
        double sum = 0;
        for (Double w : map.values()) {
            sum += w;
        }
        return sum;
    }
}
