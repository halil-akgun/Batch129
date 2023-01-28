package advanced_practice.practice12;

import java.util.Random;

public class Q04_Random_AdOlusturma {
    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.
    public static void main(String[] args) {
        System.out.println(solution("Ali"));

        // GÜLSÜM'den
//        String alfabe = "abcdefghijklmnopqrstuvwxyz";
//        String name = "ali";
//        String[] n = name.split("");
//        String[] harf = alfabe.split("");
//        Random r = new Random();
//        int denemeSayisi = 0;
//        String rharf;
//        String sonuc="";
//        int idx = 0;
//        do {
//            for (int i = 0; i >=0; i++) {
//                rharf = harf[r.nextInt(harf.length)];
//                denemeSayisi++;
//                if (rharf.equals(n[idx])) {
//                    sonuc+=rharf;
//                    idx++;
//                    break;
//                }
//            }
//        }while (!name.equals(sonuc)) ;
//        System.out.println( denemeSayisi + " denemede bulundu.");






    }

    static int solution(String str) {
        String alfabe = "abcçdefgğhıijklmnoöpqrstuüvwxyzABCÇDEFGĞHIIJKLMNOÖPQRSTUÜVWXYZ";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j > 0; j++) {
                counter++;
                if (alfabe.charAt((int) (Math.random() * alfabe.length())) == str.charAt(i)) {
                    break;
                }
            }
        }
        return counter;
    }
}
