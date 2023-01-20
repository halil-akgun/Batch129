package day28exceptions;

public class Exceptions06 {
    public static void main(String[] args) {
        String s = "Java";
        getNumberOfChars(s);
        String t = "";
        getNumberOfChars(t);
        String u = null;
        getNumberOfChars(u); // NullPointerException
    }

    // stringlerin değeri null olduğunda string classtaki bazı metotları kullanamayız. kullanırsak: // NullPointerException
    static void getNumberOfChars(String s) {
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("null değeri için bazı metotlar kullanılamaz.");
        }
    }
}
