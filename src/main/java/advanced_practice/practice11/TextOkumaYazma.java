package advanced_practice.practice11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextOkumaYazma {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/main/java/advanced_practice/practice11/text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        System.out.println(bufferedReader.readLine()); // ilk satır
//        System.out.println(bufferedReader.readLine()); // ikinci satır

        String satir = bufferedReader.readLine();
        String yeniDosya = "";

//        while (satir != null) {
//            System.out.println(satir);
//            satir = bufferedReader.readLine();
//        }
        while (satir != null) {
            yeniDosya += satir + "  ===> Satı kelime sayısı: " + satir.split(" ").length + "\n";
            satir = bufferedReader.readLine();
        }
        System.out.println("yeniDosya = " + yeniDosya);
        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("src/main/java/advanced_practice/practice11/textWrite.txt");
        fileWriter.write(yeniDosya);
        fileWriter.close();
    }
}
