package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {

        // Increment 1
        int a = 10;
        a = a + 5; // a += 5;

        // Decrement 1
        int b = 10;
        b = b - 3; // b -= 3;

        // Decrement 2
        int c = 15;
        c = c * 2; // c *= 2;

        // Decrement 2
        int d = 20;
        d = d / 2; // d /= 2;

        // "1" ile Increment - Decrement
        a++;
        b--;


        //"post-increment" ve "pre-increment"
        int i = 10;
        int k = i++;// post-increment cunku increment, variable'in isminden sonra yazildi

        System.out.println(k);//10 ==> "i" artirilmadan "k" ya konuldugu icin "k" nin degeri 10 olur.
        System.out.println(i);//11 ==> "i" satir sonunda artirildigi icin "i" nin degeri 11 olur.

        int m = 15;
        int n = ++m;// pre-increment cunku increment, variable'in isminden once yazildi

        System.out.println(m);// 16 ==> "m" satir sonunda artirildigi icin "m" nin degeri 16 olur.
        System.out.println(n);// 16 ==> "m" artirildiktan sonra "n" ye konuldugu icin "n" nin degeri 16 olur.

    }
}
