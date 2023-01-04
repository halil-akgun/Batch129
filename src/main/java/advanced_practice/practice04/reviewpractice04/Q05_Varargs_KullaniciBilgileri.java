package advanced_practice.practice04.reviewpractice04;

public class Q05_Varargs_KullaniciBilgileri {
    public static void main(String[] args) {

        //Ad, soyad, yaş ve bugüne dek yaşanılmış sehirler bilgilerini parametre olarak alıp yazdıran bir method oluşturunuz.

        bilgiler("halil", "akgün", 34, "a", "b", "c");
        System.out.println();
        System.out.println("********************");
        bilgiler2("halil", "akgün", "34", "a", "b", "c");

    }

    public static void bilgiler(String ad, String soyad, int yas, String... sehirler) {
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("yas = " + yas);
        System.out.print("şehirler = ");
        for (String w : sehirler) {
            System.out.print(w + " ");
        }
    }

    public static void bilgiler2(String... bilgiler) {
        for (int i = 0; i < bilgiler.length; i++) {
            if (i == 0) {
                System.out.println("ad: " + bilgiler[i]);
            } else if (i == 1) {
                System.out.println("soyad: " + bilgiler[i]);
            } else if (i == 2) {
                System.out.println("yaş: " + bilgiler[i]);
                System.out.print("şehirler: ");
            } else {
                System.out.print(bilgiler[i] + " ");
            }
        }
    }
}