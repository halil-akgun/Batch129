package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
        java'da metod oluşturma
        1- main metodunun dışında oluşturulur
        2- access modifier + return type + metod ismi + () + {}

        metodu kullanma
        1- main metodunun içinde kullanılır
        2- metod ismi + ()
     */

    public static void main(String[] args) {

        int sonuc = add(3, 5);
        System.out.println(sonuc);

        long sonuc2 = multiply(3, 5);
        System.out.println(sonuc2);

        int islem1 = firsTwoMultiplyThirdAdd(2, 3, 5);
        System.out.println(islem1);

        double cube = getCube(2);
        System.out.println(cube);



    }

    public static int add(int a, int b) {
        return a + b;
    }

    protected static long multiply(int a, int b) {
        return a * b;
    }

    private static int firsTwoMultiplyThirdAdd(int a, int b, int c) {
        return (a * b) + c;
    }

    // access modifier'ı default yapmak için access modifier (default) yazılmaz
    static double getCube(double a) {
        return a * a * a;
    }

}





