package advanced_practice.practice12;

import java.util.HashMap;
import java.util.Map;

public class Q05_Map_AdSoyad {
    /*
      İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
*/
    public static void main(String[] args) {
        String[] arr = {"John", "Mark", "Ali"};
        String[] brr = {"Doe", "Twain", "Can"};
        Map<String, String> names = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            names.put(arr[i], brr[i]);
        }
        System.out.println(names);
    }
}
