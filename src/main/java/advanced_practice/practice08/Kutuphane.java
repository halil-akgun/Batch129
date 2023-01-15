package advanced_practice.practice08;

public class Kutuphane {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNumarasi;
    static int kitapSayisi;

    @Override
    public String toString() {
        return "Kutuphane{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", sayfaSayisi=" + sayfaSayisi +
                ", seriNumarasi='" + seriNumarasi + '\'' +
                '}';
    }

    public Kutuphane(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        kitapSayisi++;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        seriNumarasi = kitapAdi.substring(0, 2) + yazarAdi.substring(0, 2) + kitapSayisi;
    }

    public void kitapBilgileri() {
        System.out.println("kitapAdi = " + kitapAdi);
        System.out.println("yazarAdi = " + yazarAdi);
        System.out.println("sayfaSayisi = " + sayfaSayisi);
        System.out.println("seriNumarasi = " + seriNumarasi);
        System.out.println("*******************************");
    }
}
