package advanced_practice.practice05;

public class Q06_Arrays_Simetrik {
    public static void main(String[] args) {

        // Bir Array'in simetrik olup olmadığını kontrol eden bir method oluşturunuz.
        int arr[]={0,1,2,3,4,5,6,4,3,2,1,0};
        System.out.println("isSymmetrical(arr) = " + isSymmetrical(arr));

    }

    public static boolean isSymmetrical(int[] arr) {
        boolean isSymmetrical = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (!(arr[i] == arr[arr.length - 1 - i])) isSymmetrical = false;
        }
        return isSymmetrical;
    }
}
