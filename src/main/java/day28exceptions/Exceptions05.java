package day28exceptions;

public class Exceptions05 {
    public static void main(String[] args) {
        int a = 16;
        int b = 0;
        String c = "my java";
        getCharFromString(c, a, b);
    }

    // StringIndexOutOfBoundsException

    //try kisminda birden fazla Exception olusturma ihtimali olan kod varsa,coklu "cath" kullanabilirsiniz.

    //Coklu "cath" kullandiginizda Exception Class'lar arasinda "parent-child" iliskisi yoksa, catch'lerin sirasi
    //onemli degildir. Ama kod'daki siralamaya uymak tavsiye edilir.

    //Coklu "cath" kullandiginizda Exception Class'lar arasinda "parent-child" iliskisi varsa, catch'lerin sirasi
    //onemlidir, child olan class ustte olmalidir.

    //Exception Class'lar arasinda "parent - child" iliskisi varsa, ya child class'i uste yazarak child ve parent class'lar
    //icin ozellestirilmis code'lar yazarsiniz.(Hirsiz icin 155, hasta icin 112 gibi)
    //Veya child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz.(Hirsiz icin 911, hasta icin 911 gibi)
    static void getCharFromString(String c, int a, int b) {
        try {
            int idx = a / b;
            char ch = c.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("sıfıra bölme olmaz");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("olmayan index kullandın");
        }
    }
}
