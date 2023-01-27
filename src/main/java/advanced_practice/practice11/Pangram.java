package advanced_practice.practice11;

public class Pangram {
    /*
    Bir cümlenin pangram olup olamadığını kontrol eden bir kod yazınız.
    Not: Pangram, bir dilin alfabesi içerisindeki tüm harfleri içeren anlamlı cümledir.
    TR: Pijamalı hasta yağız şoföre çabucak güvendi.
    ENG: The quick brown fox jumps over the lazy dog.
    */
    public static void main(String[] args) {
        String trAlfabe = "abcçdefgğhiıjklmnoöprsştuüvyz";
        System.out.println(isPangramTR("Pijamalı hasta yağız şoföre çabucak güvendi."));
        System.out.println(isPangramEN("The quick brown fox jumps over the lazy dog."));
    }

    static boolean isPangramTR(String str) {
        String trAlfabe = "abcçdefgğhiıjklmnoöprsştuüvyz";
        str = str.replaceAll(" ", "").toLowerCase();
        for (int i = 0; i < trAlfabe.length(); i++) {
            if (!str.contains("" + trAlfabe.charAt(i))) return false;
        }
        return true;
    }

    static boolean isPangramEN(String str) {
        str = str.replaceAll(" ", "").toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1) return false;
        }
        return true;
    }
}
