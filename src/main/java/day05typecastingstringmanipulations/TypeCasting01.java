package day05typecastingstringmanipulations;

public class TypeCasting01 {

    /*
      Numeric primitive data type'larının birbirine dönüştürülmesine "Type Casting" denir.
      Numeric Data Type'lar byte-short-int-long-float-double
      Note 1: Küçük data type'larını büyük data type'larına çevirmeyi Java otomatik olarak yapabilir.
              Bu işleme "AutoWidening" (Otomatik Genişletme) denir.
      Note 2: Büyük data type'larını küçük data type'larına çevirmek riskli bir iştir,Java bu riskli işi otomatik olarak yapmaz.
              Bu işlemi kod yazanlar yapar.
              Bu işleme "ExplicitNarrowing"(Açıktan daraltma) denir.
     */

    public static void main(String[] args) {

        // byte'ı int'e çevirme
        byte age = 34;
        int ageInt = age;

        // long'u short'a çevirme
        long weight = 234;
        int eightInt = (int) weight; // ExplicitNarrowing"(Açıktan daraltma)

        // int'i float'a çevir
        int population = 700000;
        System.out.println(population);
        float populationFloat = population;
        System.out.println(populationFloat);

        // double'ı short'a çevir
        double height = 173.9;
        System.out.println(height); // 173.9
        short heightShort = (short) height;
        System.out.println(heightShort); // 173

        //Dikkat!
        //Dönüşüm yaptığınız sayı(260), dönüştüreceğiniz data type'ının sınırları dışında ise, Java kullandığınuz sayı ile
        //"mod" işlemi yapar ve işlemin sonucu sizin yeni değeriniz olur

        //Example 1:
        short num2 = 260;
        System.out.println(num2);//260
        byte numByte = (byte) num2;
        System.out.println(numByte);//4

        //Example 2:
        short n = 1023;
        System.out.println(n); // 1023
        byte nByte = (byte) n;
        System.out.println(nByte);


    }
}
