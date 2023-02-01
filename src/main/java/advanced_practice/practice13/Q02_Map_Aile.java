package advanced_practice.practice13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q02_Map_Aile {
    public static void main(String[] args) {
//        Map<String, String> adSoyad = new HashMap<>();
//        Map<Map<String,String>,Integer> adSoyadYas = new HashMap<>();
//        adSoyad.put("ali","can");
//        adSoyadYas.put(adSoyad,22);
//        System.out.println(adSoyadYas); // {{ali=can}=22}


        //Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız.

        Family ali = new Family("ali","can",15,"erkan","gulsum");
        System.out.println(ali.getFamilyMap());

    }
}
