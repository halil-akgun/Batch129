package day24accessmodifiersinheritance;

public class Animal {
    /*
        Inheritance'in faydalari;
        1) Code standardında tekrar iyi değildir.
        2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
        3) Gelişime update'e açık olmalıdır
        4) Code atomic yapıda olmalı.
        Note 1: "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
        Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
        Note 3: public methodlar child classlar tarafından kullanılabilir
                "child classlar tarafından kullanılabilir" demek "inherit edilebilir" demektir.
        Note 4: protected methodlar inherit edilebilir.
                çünkü "protected" olan method ve variable ler childlar tarafından kullanılablir
        Note 5: default methodlar obje ile aynı pakette oldukları sürece inherit edilebilir.
                ama default method ile objenin üretildiği class farklı paketlerde ise inherit edilemezler
        Note 6: javada birden fazla parent olmaz
        Note 7: child -> parent -> g.parent.. şeklinde ilerleyen inheritancelere "multi level inheritance" denir
        Note 8: parentten chila olan ilişkilere HAS-A relationship denir
                childdan parenta olan ilişkilere IS-A relationship denir
        Note 9: her classın bir tane default constructorı vardır.
                bu default constructor classın içinde görünmez, çünkü Object class içindedir.
     */
    protected void eat() {
        System.out.println("animals eat");
    }

    void drink() {
        System.out.println("animals drink");
    }
}
