package day21statickeyword;

/*
        1- static variable veya static methodlar (class member) tüm objeler için ortak elemandır.
        2- static class memberlar üzerinde yapılan tüm değişiklikler tüm objeleri etkiler.
        3- static class memberlar classa, nonstatic class memberlar objelere monte edilir.
            mesela bir classtan 100 tane obje oluşturduğunuzda nonstatic olanlar 100 kere oluşturulur,
            ama static olanlar obje sayısından bağımsız olarak 1 kere oluşturulur.
        4- static class memberlara ulaşmak için obje oluşturmaya gerek duyulmaz, ama nonstatic class memberlara ulaşmak
            için obje oluşturmak şarttır.
        5- static variableların diğer adı class variabledir.
            non-static variableların diğer adı instance variable veya object variabledir.
*/
public class Student {


    public static String stdName = "Tom Hanks";
    public int age = 13;

    // öğrenci isimleri ilk harflerini veren method
    public static String getInitials(String name) {
        String first = name.substring(0, 1);
        String second = name.split(" ")[1].substring(0, 1);
        return first + second;
    }
    // sesli harfleri say
    public int countVowels(String name) {
        int counter = 0;
        for(int i=0; i<name.length(); i++){
            char ch = name.toLowerCase().charAt(i);
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
        return counter;
    }
}
