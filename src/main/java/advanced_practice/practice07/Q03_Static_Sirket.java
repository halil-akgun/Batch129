package advanced_practice.practice07;

public class Q03_Static_Sirket {
    //Basit bir şirket bütçesi kodu yazınız.
    public static void main(String[] args) {
        Sirket dep1 = new Sirket();
        dep1.kasadanButceyeParaAl(500);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);
        System.out.println("Sirket.kasa = " + Sirket.kasa);
        dep1.paraKazan(1000);
        System.out.println("Sirket.kasa = " + Sirket.kasa);

        Sirket.kasadanParaHarca(300);
        System.out.println("Sirket.kasa = " + Sirket.kasa);

        dep1.departmanHarcamasi(200);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);

        Sirket dep2 = new Sirket();
        dep2.kasadanButceyeParaAl(700);
        System.out.println("dep2.depButcesi = " + dep2.depButcesi);
        dep2.departmanHarcamasi(300);
        System.out.println("dep2.depButcesi = " + dep2.depButcesi);


    }
}
