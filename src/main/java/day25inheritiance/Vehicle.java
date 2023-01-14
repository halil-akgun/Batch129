package day25inheritiance;

public class Vehicle {
    /*
          1) Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
            parent class'dan baslatilarak alta dogru calistirilir.
          2) Child Class'da ki constructor'dan Parent Class'da ki constructor'a gidebilmek icin "super()" kullanilir.
          3) Parent Class'da birden fazla constructor varsa istenilen constructor,"super()" ifadesinin icine yazilan
          parametreler yardimi ile secilebilir.
          4) Ayni class icindeki constructor'lari secmek icin "this()" kullanilir.
            Ayni Class'da birden fazla constructor varsa istenilen constructor,"this()" ifadesinin icine yazilan
            parametreler yardimi ile secilebilir.
          5) "super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
             Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
          6) "super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmalidir.
          7) Bir constructor'in icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir. Bakiniz 6.kural..
          8) inheritance de variable leri ve methodları çağımak için this veya super kullanılır
          9) inheritance da obje kullanarak variable çağırırsanız objenin data tipini temsil eden classdan variableyi
             aramaya başlayınız, o classta yoksa parentlere bakın
          10) inheritance da obje kullanarak method çağırırsanız objenin constructorını temsil eden classdan metodu
            aramaya başlayınız, o classta yoksa parentlere bakın

            OOP Pricipals:
            i)Inheritance +
            ii)Polymorphism -  method overloading + method overriding
            iii)Encapsulation -
            iv)Abstraction -
        */
    public int price = 12000;
    public Vehicle() {
        System.out.println("vehicle");
    }
    public void engine(){
        System.out.println("vehice engine");
    }

    public Vehicle(int price) {
        System.out.println("vehicle 2: " + price);
    }
}
