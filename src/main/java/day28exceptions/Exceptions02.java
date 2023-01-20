package day28exceptions;

public class Exceptions02 {
    public static void main(String[] args) {
        String s = "123";
        convertStringToInt(s);

        String t = "1a2b";
        convertStringToInt(t);

    }

    // "123" sayıya çevirmek istersen NumberFormatException atar.
    static void convertStringToInt(String s) {
        try {
            System.out.println("Integer.valueOf(s) = " + Integer.valueOf(s));
        } catch (NumberFormatException e) {
            System.out.println("bir stringin sayıya dönüştürülebilmesi için rakam dışı karakter içermemesi gerekir.");
            System.out.println(e.getMessage());
        }
    }
}
