package advanced_practice.practice04.reviewpractice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06_MountainArray {
    public static void main(String[] args) {

     /*
     Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
     Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
     */
        int[] arr = {-999, 1, 2, 5, 7, 9, 22, 8, 3, 1, -100};

        List<Integer> brr = new ArrayList<>();
        for (int w : arr) {
            brr.add(w);
        }
        System.out.println(brr);

        int max = brr.get(0);
        for (Integer w : brr) {
            max = Math.max(max, w);
        }
        System.out.println("max = " + max);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < brr.size(); i++) {
            if (i < brr.indexOf(max)) {
                left.add(brr.get(i));
            } else {
                right.add(brr.get(i));
            }
        }
        System.out.println("left = " + left);
        System.out.println("right = " + right);

        List<Integer> leftCopy = new ArrayList<>(left);
        List<Integer> rightCopy = new ArrayList<>(right);
        Collections.sort(leftCopy);
        Collections.sort(rightCopy);
        Collections.reverse(rightCopy);

        System.out.println("leftCopy = " + leftCopy);
        System.out.println("rightCopy = " + rightCopy);

        if (left.equals(leftCopy) & right.equals(rightCopy)) {
            System.out.println("Mountain.");
        } else {
            System.out.println("Not Mountain.");
        }


    }
}
