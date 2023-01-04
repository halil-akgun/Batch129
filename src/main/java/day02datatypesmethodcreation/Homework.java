package day02datatypesmethodcreation;

public class Homework {
    public static void main(String[] args) {

        int dikdortgenC = dikdortgenCevresi(3, 5);
        System.out.println(dikdortgenC);

        int dikdortgenA = dikdortgenAlani(3, 5);
        System.out.println(dikdortgenA);

        double daireC = daireCevresi(5);
        System.out.println(daireC);

        double daireA = daireAlani(5);
        System.out.println(daireA);
    }

    public static int dikdortgenCevresi(int a, int b) {
        return a * 2 + b * 2;
    }

    public static int dikdortgenAlani(int a, int b) {
        return a * b;
    }

    public static double daireCevresi(int a) {
        return 2 * a * 3.1415926;
    }

    public static double daireAlani(int a) {
        return a * a * 3.1415926;
    }

}
