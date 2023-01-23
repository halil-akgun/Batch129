package day30exceptionsinterface;

public class Exceptions01 {
    /*
    1- exception olsa da olmasa da çalıştırmamız gereken kodları finally içine yazarız
    2- DB ile bağlantıyı kesme işini yapan kodlar gibi kodlar her halükarda çalıştırılmalıdır.
        bu tarz kodları finally içine koyarız.
    3- TRY tek başına kullanılamaz
        try + 1 catch mümkün
        try + 2 catch mümkün
        try + çoklu catch mümkün
        try + çoklu catch + finally mümkün
        try + finally mümkün
     4- çoklu finally olmaz
     */
    public static void main(String[] args) {
        int a = 12;
        int b = 4;
        int[] c = {3, 6, 9, 12};
        m(c, a, b);

    }

    public static void m(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("cut the connection with the DB");
        }
        //finallyblock exception olsa da olmasa da her zaman calisir.
        //finally block try-catch block'dan sonra kullanilir.
    }


}
