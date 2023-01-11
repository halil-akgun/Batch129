package advanced_practice.practice06;

//Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir kod yazın. (Method overloading kullanınız)
public class Q04_MethodOverloading_Hacim {
    public static void main(String[] args) {

        Hacim hacim = new Hacim();
        int kupunHacmi = hacim.hacimHesapla(5);
        System.out.println("kupunHacmi = " + kupunHacmi);
        int karePrizmaninHacmi = hacim.hacimHesapla(5, 4);
        System.out.println("karePrizmaninHacmi = " + karePrizmaninHacmi);
        int dikdortgenPrizmaninHacmi = hacim.hacimHesapla(2, 3, 4);
        System.out.println("dikdortgenPrizmaninHacmi = " + dikdortgenPrizmaninHacmi);

    }
}
