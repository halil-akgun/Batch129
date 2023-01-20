package day28exceptions;

public class Exceptions04 {
    public static void main(String[] args) {
        String[] str = {"qwer", "asdf", "zxc"};
        getElementFromArray(str, 1);
        getElementFromArray(str, 3);
    }

    // ArrayIndexOutOfBoundsException
    static void getElementFromArray(String[] arr, int a) {
        try {
            System.out.println("arr[a] = " + arr[a]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
