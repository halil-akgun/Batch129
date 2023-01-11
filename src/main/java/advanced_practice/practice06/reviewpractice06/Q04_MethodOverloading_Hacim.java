package advanced_practice.practice06.reviewpractice06;

//Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir kod yazın. (Method overloading kullanınız)
public class Q04_MethodOverloading_Hacim {
    public static void main(String[] args) {

        Hacim obj = new Hacim();
        System.out.println("küpün hacmi (3): " + obj.hacimHesapla(3));
        System.out.println("kare prizmanın hacmi (3, 4): " + obj.hacimHesapla(3, 4));
        System.out.println("dikdörtgen prizmanın hacmi (3, 4, 5): " + obj.hacimHesapla(3, 4, 5));

    }
}
