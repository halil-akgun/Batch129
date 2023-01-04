package z_codesignal;

import java.util.ArrayList;
import java.util.List;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {

        int arr[] = {10, 1, 2, 3, 4, 5};
        System.out.println("solution(arr) = " + solution(arr));

    }

    static boolean solution(int[] sequence) {
        List<Integer> temp = new ArrayList<>();
        for (int w : sequence) {
            temp.add(w);
        }
        int counter = 0;
        for (int i = 0; i < temp.size() - 1; i++) {
            for (int j = i + 1; j < i + 2; j++) {
                if ((i == 0) & (!(temp.get(i) < temp.get(j)))) {
                    counter++;
                    temp.remove(i);
                    if (j != temp.size()) j--;
                } else if ((counter == 0) & (!(temp.get(i) < temp.get(j)))) {
                    if (j + 1 == temp.size() - 1) {
                        if (temp.get(j) < temp.get(j + 1) & temp.get(j) > temp.get(j - 2)) {
                            counter++;
                            temp.remove(i);
                            if (j != temp.size()) j--;
                        } else {
                            counter++;
                            temp.remove(j);
                            if (j != temp.size()) j--;
                        }
                    } else {
                        counter++;
                        temp.remove(j);
                        if (j != temp.size()) j--;
                    }

                } else if (!(temp.get(i) < temp.get(j))) {
                    counter++;
                    temp.remove(j);
                    if (j != temp.size()) j--;
                }
            }
        }

        if (counter > 1) {
            return false;
        } else {
            return true;
        }
    }
}
