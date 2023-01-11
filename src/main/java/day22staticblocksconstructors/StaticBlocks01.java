package day22staticblocksconstructors;

public class StaticBlocks01 {

    // bir variable oluşturduğumuzda değer atamazsak o variable'ı "initialize" (başlatmak) etmedik demektir.
    // static variablelar static blocklar içinde initialize edilirse o classın içinde herşeyden önce hazır hale getirilmiş olur.
    // bazen main method çalıştırılmadan önce variable'ların hazır hale getirilmesi gerekir bu yüzden static blocklar kullanılır.

    //note 1: static blocklar static variableları initialize etmek için kullanılırlar
    //Note 2: "static block" lar class icinde "herseyden once" calistirilirlar (mainden de önce)

    static double pi;
    static String shape;

    static {
        pi = 3.14;
        System.out.println("static");
    }

    static {
        shape = "Circle";
        System.out.println("static circle");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }

}
