package advanced_practice.practice02;

public class Q04_RandomMethod_RastgeleHarf {
    public static void main(String[] args) {

        /*
        Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
        ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
        ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
        ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
        ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
        Diğerleri için “Diğer Karakterleri” yazdırınız.
        */

        String harf = rastgeleHarf().toLowerCase();
        System.out.println(harf);

        switch (harf) {
            case "a":
                System.out.println("İlk Karakter");
                break;
            case "b":
                System.out.println("İkinci Karakter");
                break;
            case "c":
                System.out.println("Üçüncü Karakter");
                break;
            case "d":
                System.out.println("Dördüncü Karakter");
                break;
            default:
                System.out.println("Diğer Karakterler");
        }

    }

    public static String rastgeleHarf() {
        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex = alfabe.length(); // rondom en fazla 0.9999 olduğu için son karakteri (z) elde edebilmek için +1 gerekir
        // length()-1+1 = length()
        int rastgeleIndex = (int) (Math.random() * maxIndex);

        return alfabe.substring(rastgeleIndex, rastgeleIndex + 1);
    }
}
