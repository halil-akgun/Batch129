package advanced_practice.practice07;

import java.time.LocalDate;

public class Market {
    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;

    Market(String urunAdi, double fiyat, int aySonra) {
        this.urunAdi = urunAdi;  //  isim parametre ile aynı ise this kullanılır
        if (fiyat > 99) {
            fiyat *= 0.9;
        }
        urunFiyati = fiyat;
        sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }

    Market(String urunAdi, double fiyat) {
        this.urunAdi = urunAdi;  //  isim parametre ile aynı ise this kullanılır
        if (fiyat > 99) {
            fiyat *= 0.9;
        }
        urunFiyati = fiyat;
        sonKullanmaTarihi = "bu ürünün son kullanma tarihi yoktur.";
    }

    Market() {}


    @Override
    public String toString() {
        return "Market{" +
                "urunAdi='" + urunAdi + '\'' +
                ", urunFiyati=" + urunFiyati +
                ", sonKullanmaTarihi='" + sonKullanmaTarihi + '\'' +
                '}';
    }
}
