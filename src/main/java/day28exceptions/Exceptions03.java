package day28exceptions;

public class Exceptions03 {
    public static void main(String[] args) {
        String s = "Java";
        getCharFromString(s, 3);
        getCharFromString(s, 4);
    }

    // StringIndexOutOfBoundsException
    static void getCharFromString(String s, int idx) {
        try {
            System.out.println("s.charAt(idx) = " + s.charAt(idx));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // ayrıntılı log
            System.out.println("e.getCause() = " + e.getCause()); // hatanın sebebini söyler, ama burada söylemedi
        }
    }
}
