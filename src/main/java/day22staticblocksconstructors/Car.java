package day22staticblocksconstructors;

/*
    Constructor nedir?
    classtan obje üretmemize yarayan kod bloklarıdır.

    class oluşturduğumuzda java bize otomatik olarak bir constructor verir.
    ama bu constructor gizlidir. bu constructorlara default constructor denir.

    default constructor: Car(){}
    kendi constructor ımızı oluşturduğumuzda default olan silinir

    bir classta farklı parametlreler kullanarak istediğiniz kadar constructor oluşturulabilir.

    farklı constructorlar sayesinde bir classtan farklı farklı objeler oluşturabiliriz.

    Interview Sorusu: Method ile constructor arasındaki fark.
            method ile constructor farklı yapılardır:
            1- methodlarda return type vardır diğerinde yok.
            2- methodların ismi yaptıkları işe göre developerlar tarafından belirlenir, diğeri ise her zaman class ismi ile aynı olmalı.
*/
public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid) {
        //this.make bu class daki make i benim yaptigim make yap demek
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        if (year == 2023) {
            this.year = 0;
        }
        if (hybrid == true) {
            this.hybrid = false;
        }
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
