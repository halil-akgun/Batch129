package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {

        // 7 hariç tüm elemanları 3 arttır.

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(11);

        // 1. yol  -- riskli - indexof w değerini ilk gördüğünde index verir aynı sayıdan başka olabilir
        for (Integer w : nums) {
            if (w == 7) {
                continue;
            }
            nums.set(nums.indexOf(w), w + 3);
        }
        System.out.println(nums); // [15, 16, 7, 14]

        // 2. yol  -- GÜVENLİ
        for (int i = 0; i < nums.size(); i++) {
            int a = nums.get(i);
            if (a == 7) {
                continue;
            }
            nums.set(i, a + 3);
        }

    }
}