package day27encapsulationabstraction.reviewday27encapsulationabstraction;

public abstract class Courses {

    /*
    1- bazen method bodysini yazmak gerekmez. bu durumlarda bodysiz method oluşturmak gerekir
        bodysi olmayan methotlara abstract methodlar denir
    2- abstract methodlar child classlar tarafından override edilmek zorundalar.
        bu yüzden eğer bir fonksiyonun child classlar tarafından kullanılmasını mecbur kılmak isterseniz
        o methodu abstract yapmak gerekir.
    3- bir methodun bodysini silmek o methodun abstract olması için yeterli değildir. access modifier ile return type
        arasına abstract keyword koymak gerekir.
    4- abstract methodlar sıradan classların içine yazılamazlar. abstract class olmalı.
    5- abstract classlarda hem abstract methodlar hem de concrete methodlar kullanılabilir.
    6- "concrete class" lar "abstract class" larin child'i olabilirler.
        "abstract method" larin override edilme zorunlulugu "concrete class" lar icindir.
     */

    public abstract void math();



    // final methodlar override edilemezler, halbuki abstract methodlar override için oluşturulurlar.
    // bu çelişkiden dolayı java abstract methodların final olmasına müsaade etmez.
//    public final abstract void science();

    // concrete classlar final olduğunda child classa sahip olamazlar.
    // ama abstract classlar için child class olmalıdır. çünkü child classlar abstract parent classtaki abstract
    // methodları kullanırlar. bu yüzden abstractlar final olamazlar.

    // abstract methodlar private olamazlar. çünkü child classlar abstract methodları kullanırlar.
    // private yapınca kullanıma kapalı olur.

    // abstract methodlar static olamazlar. static methodlar override edilemezler..

}
