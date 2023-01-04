package practice.nighttime02;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //Dikdortgenin alanini hesaplayan kodu yaziniz ve kullaniniz
        //Dikdortgenin cevresini hesaplayan kodu yaziniz ve kullaniniz

        System.out.println("dikdörtgenin alanı: " + dikdortgenAlani(10, 5));
        System.out.println("dikdörtgenin çevresi: " + dikdortgenAlani(10, 5));
        kareAlani(10);

    }

    public static int dikdortgenAlani(int a, int b) {
        return a * b;
    }

    public static int dikdortgenCevresi(int a, int b) {
        return 2 * a + 2 * b;
    }

    public static void kareAlani(int a) {
        System.out.print("karenin alanı: " + (a * a));
    }

}
