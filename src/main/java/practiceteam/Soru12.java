package practiceteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru12 {

    public static void main(String[] args) {

        //Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod
        //yazınız.
        //Not:

        //Mountain Array ==> [0, 2, 5, 3, 1]
        //Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerinden sonra
        // sürekli azalan değer alıyorsa Mauntain Array' dir.

        //Mountain Array Değil ==> [5, 2, 7, 1, 4]
        //Bir array elemanları en büyük değerine kadar sürekli azalan, en büyük değerinden sonra
        // sürekli artan değer alıyorsa Mauntain Array değildir.

        List <Integer> sayi = new ArrayList<>();

        sayi.add(0);
        sayi.add(2);
        sayi.add(5);
        sayi.add(5);
        sayi.add(3);
        sayi.add(2);
        sayi.add(0);



        boolean isMountain=true;

        for (int j = 1; j <sayi.size() ; j++) {

            if ( sayi.get(j) == sayi.get(j-1)){

                System.out.println("mountain degil");
                isMountain=false;
                break;
            }
        }
        if (isMountain) extracted(sayi);


    }

    private static void extracted(List<Integer> sayi) {

        List <Integer> sayi1 = new ArrayList<>();


        for (int i = 1; i< sayi.size(); i++){

            if (sayi.get(i)> sayi.get(i-1)){

                sayi1.add(0);
            }else if (sayi.get(i)< sayi.get(i-1)){

                    sayi1.add(2);
                System.out.println("artı");


            }



        }


        List<Integer> sayi2 = new ArrayList<>();

        sayi2.addAll(sayi1);
        System.out.println(sayi);
        System.out.println(sayi1);


        Collections.sort(sayi2);
        System.out.println(sayi2);
        if(sayi1.equals(sayi2)){

            System.out.println("mountain array");
        }else System.out.println("degildir");
    }


}
