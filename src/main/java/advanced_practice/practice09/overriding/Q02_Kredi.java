package advanced_practice.practice09.overriding;

public class Q02_Kredi {

    //Bir bankadan kredi alan müşterileri kredi türlerine göre objeler oluşturarak kaydeden bir kod yazınız.
    //Emekli: %12 standart faiz, İşçi: %15 iiçi oranı, Memur: %10 memur oranı
    public static void main(String[] args) {
        Emekli emekli = new Emekli();
        System.out.println("emekli.faizHesapla(100) = " + emekli.faizHesapla(100));
        Isci isci = new Isci();
        System.out.println("isci.faizHesapla(100) = " + isci.faizHesapla(100));
        Memur memur = new Memur();
        System.out.println("memur.faizHesapla(100) = " + memur.faizHesapla(100));
    }
}
