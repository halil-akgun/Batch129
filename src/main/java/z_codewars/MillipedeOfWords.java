package z_codewars;

import java.util.ArrayList;
import java.util.Iterator;

public class MillipedeOfWords {
    public static void main(String[] args) {

        /*
        Millipede of words
        The set of words is given. Words are joined if the last letter of one word and
        the first letter of another word are the same. Return true if all words of the set
        can be combined into one word. Each word can and must be used only once. Otherwise return false.

        Input
        Array of 3 to 7 words of random length. No capital letters.

        Example true
        Set: excavate, endure, desire, screen, theater, excess, night.
        Millipede: desirE EndurE ExcavatE ExcesS ScreeN NighT Theater.

        Example false
        Set: trade, pole, view, grave, ladder, mushroom, president.
        Millipede: presidenT Trade.
        */

//        ArrayList<String> millipede = new ArrayList<>();
//        // millipede={ excavate, endure, desire, screen, theater, excess, night};
//        millipede.add("excavate");
//        millipede.add("endure");
//        millipede.add("desire");
//        millipede.add("screen");
//        millipede.add("theater");
//        millipede.add("excess");
//        millipede.add("night");
        ArrayList<String> millipede = new ArrayList<>();
        // excavate, endure, desire, screen, theater, excess, night
        millipede.add("excavate");
        millipede.add("endure");
        millipede.add("desire");
        millipede.add("screen");
        millipede.add("theater");
        millipede.add("excess");
        millipede.add("night");

//        ArrayList<String> result = new ArrayList<>();
//        ArrayList<String> firstWord = new ArrayList<>();
//        int counter = 0;
//        for (int i=0; i< millipede.size();i++) {
//            counter = 0;
//            for (int j=0; j< millipede.size();j++) {
//                if (i != j) {
//                    if (millipede.get(i).charAt(0) == millipede.get(j).charAt(millipede.get(j).length() - 1)) {
//                        break;
//                    } else {
//                        counter++;
//                    }
//                }
//            }
//            if (counter == millipede.size() - 1) {
//                firstWord.add(millipede.get(i));
//            }
//        }
//        System.out.println(firstWord);
//
//
//        if (firstWord.size()>1){
////            return false;
//            System.out.println("false = " + false);
//        } else if (firstWord.size() == 1) {
//
//        }


        ArrayList<String> firstLetters = new ArrayList<>();
        ArrayList<String> lastLetters = new ArrayList<>();

        for (String w : millipede) {
            firstLetters.add(w.substring(0, 1));
            lastLetters.add(w.substring(w.length() - 1));
        }
//        Iterator<String> a = firstLetters.iterator();
//        Iterator<String> b = lastLetters.iterator();
//
//        while (a.hasNext()) {
//            String s = a.next(); // must be called before you can call i.remove()
//            for (String k : lastLetters) {
//                if (s.equalsIgnoreCase(k)) {
//                    firstLetters.remove(k);
//                    lastLetters.remove(k);
//                    break;
//                }
//            }
//            //a.remove();
//        }

        for (int i = 0; i < firstLetters.size(); i++) {
            for (String w : firstLetters) {
                for (String k : lastLetters) {
                    if (w.equalsIgnoreCase(k)) {
                        // firstLetters.remove(k);
                        lastLetters.remove(k);
                        break;
                    }
                }
                // break;
            }
        }

        int counter = 0;
        int false1 = 0;
        for (int i = 0; i < millipede.size(); i++) {
            for (int j = 0; j < millipede.size(); j++) {
                if (i != j) {
                    char firstCharI = millipede.get(i).charAt(0);
                    char lastCharJ = millipede.get(j).charAt(millipede.get(j).length() - 1);
                    char firstCharJ = millipede.get(j).charAt(0);
                    char lastCharI = millipede.get(i).charAt(millipede.get(i).length() - 1);
                    if ((firstCharI == lastCharJ) & (firstCharJ == lastCharI)) {
                        for (int k = 0; k < millipede.size(); k++) {
                            char firstCharK = millipede.get(k).charAt(0);
                            char lastCharK = millipede.get(k).charAt(millipede.get(k).length() - 1);
                            if (i != k & j != k) {
                                if ((firstCharI == lastCharK) | (firstCharJ == lastCharK) | (firstCharK == lastCharI) | (firstCharK == lastCharJ)) {
                                    counter++;
                                }
                            }
                        }
                        if (counter == 0) {
                            false1++;
                            counter = 0;
                        }
                    }
                }
            }
        }

        System.out.println(millipede);
        System.out.println(lastLetters.size());
        System.out.println(false1);

        if (lastLetters.size() > 1 | false1 > 0) {
            //            return false;
            System.out.println("false = " + false);
        } else {
//            return true;
            System.out.println("true = " + true);
        }


    }
}