package preClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P11_ArrayLists {
    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("C");
        a.add("E");
        a.add("F");
        System.out.println("a = " + a); // a = [A, C, E, F]
        a.add("B");
        a.add(1, "L");
        System.out.println("a = " + a); // a = [A, L, C, E, F, B]
        a.set(3, "D");
        System.out.println("a = " + a); // a = [A, L, C, D, F, B]
        a.remove("F");
        System.out.println("a = " + a); // a = [A, L, C, D, B]
        a.sort(Comparator.naturalOrder());
        System.out.println("a = " + a); // a = [A, B, C, D, L]
        System.out.println("a.contains(\"L\") = " + a.contains("L")); // true
        System.out.println("a.contains(\"M\") = " + a.contains("M")); // false
        System.out.println("a.size() = " + a.size()); // a.size() = 5
        a.clear();
        System.out.println("a.isEmpty() = " + a.isEmpty()); // true

    }
}
