package advanced_practice.practice04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q06_MountainArray {
    public static void main(String[] args) {

     /*
     Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
     Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
     */
        int[] arr = {-999, 1, 2, 5, 7, 9, 22, 8, 3, 1, -100};
        // arrayi liste çevir
        List<Integer> list = new ArrayList<>();
        for (int w : arr) {
            list.add(w);
        }
        System.out.println("list = " + list);

        // max'ı bul
        int max = list.get(0);
        for (Integer w : list) {
            max = Math.max(max, w);
        }
        System.out.println("max = " + max);

        // list1
        List<Integer> list1 = new ArrayList<>();
        for (Integer w : list) {
            if (w == max) {
                break;
            }
            list1.add(w);
        }
        System.out.println("list1 = " + list1);

        // list2
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i < list.indexOf(max)) {
                continue;
            }
            list2.add(list.get(i));
        }
        System.out.println("list2 = " + list2);

        // yedekleyip sırala
        List<Integer> list1Copy = new ArrayList<>(list1);
        List<Integer> list2Copy = new ArrayList<>(list2);

        Collections.sort(list1Copy);
        Collections.sort(list2Copy);
        Collections.reverse(list2Copy);
        System.out.println("list1Copy = " + list1Copy);
        System.out.println("list2Copy = " + list2Copy);

        // kontrol
        if (list1.equals(list1Copy) & list2.equals(list2Copy)) {
            System.out.println("mountain array");
        } else {
            System.out.println("mountain array değil");
        }


    }
}
