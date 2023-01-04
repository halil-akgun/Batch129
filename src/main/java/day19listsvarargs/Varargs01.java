package day19listsvarargs;

public class Varargs01 {
    public static void main(String[] args) {
        /*
        Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
        Method'un parantezleri icine yazilanlara "parametre" denir
        Method'u cagirirken kullanilan sayilara da "argument" denir.

        Note 1: Bir method'da 1 den fazla Varargs Parametre kullanilamaz cunku ikincisi "Unreachable Code" olur.
        Note 2: "Varargs", Varargas disindaki parametrelerle kullanilabilir ama "Varargs" her zaman "son parametre" olmalidir
        */
        addTwoNumbers(3, 5);

        add(1,2,3,4,5,6);

    }

    public static void addTwoNumbers(int a, int b) {
        System.out.println(a + b);
    }

    // istediğiniz miktarda sayıyı toplayan method
    public static void add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum += w;
        }
        System.out.println(sum);
    }
}
