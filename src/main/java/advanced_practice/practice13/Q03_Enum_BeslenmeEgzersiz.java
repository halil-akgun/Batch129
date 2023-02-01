package advanced_practice.practice13;

import java.util.Arrays;

public class Q03_Enum_BeslenmeEgzersiz {
    public static void main(String[] args) {
        System.out.println(BeslenmeEgzersiz.Ocak.toplamEgzersizSaati);
        System.out.println(BeslenmeEgzersiz.Ocak.ayinMeyvesi);

        System.out.println(BeslenmeEgzersiz.Haziran);

        System.out.println(Arrays.toString(BeslenmeEgzersiz.values()));
        // toString olmazsa output: [Ocak, Subat, Mart, Nisan, Mayis, Haziran, Temmuz, Agustos, Eylul, Ekim, Kasim, Aralik]

        //Aylara göre sebze ve meyve tavsiyesi içeren ve toplam yapılması gereken egzersiz saatlerini söyleyen bir kod yazınız.
        //20 ssat üstü egzersiz yapılacak ayları ekrana yazdırınız.
        for (BeslenmeEgzersiz w : BeslenmeEgzersiz.values()) {
            if (w.toplamEgzersizSaati>20){
                System.out.println(w);
            }
        }
        BeslenmeEgzersiz beslenme;
        for (BeslenmeEgzersiz w : BeslenmeEgzersiz.values()) {
            System.out.print(w);
            System.out.println(" -> " + w.ayinMeyvesi + w.ayinSebzesi + w.toplamEgzersizSaati);
        }

        

    }
}
