package advanced_practice.practice08;

public class Q05_InheritanceQ05_Inheritance {
    //Dairenin alanını hesalayan bir method oluşturunuz.(matematik işlemleri için inheritance kullanınız)
    public static void main(String[] args) {
        daireAlani(5);
    }

    static void daireAlani(int r) {
        Daire daireObj = new Daire();
        System.out.println(daireObj.carpma(daireObj.piSayisi, daireObj.karesiniAl(r)));
    }
}
