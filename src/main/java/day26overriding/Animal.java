package day26overriding;

/*
  1- Parent Class'da ki method'u Child Class icinde ozellestirerek kullanmaya "Overriding" yapmak denir.
  2- Overriding'de method'un parantezine,method'un ismine dokunulmaz, method'un body'si degistirilir.
  3- @Override ==> Override Annotation: Override kurallarinin Java tarafindan kontrol edilmesini saglar.
  4- Overriding'de Parent Class'daki method'a "Overridden Method" denir, Child Class'daki method'a ise "Overriding Method" denir.
  5- "private" method'lar "override" edilemezler.
  6- Child Class'daki override edilmis method(Overriding Method)'un access modifier'i Parent Class'daki override
      edilmis method(Overridden Method)'un access modifier'indan dar olamaz.
      Overridden Method ==> protected ise Overriding Method ==> protected + public
      Overridden Method ==> default ise Overriding Method ==> default + protected + public
      Overridden Method ==> private ise Overriding Method ==> override olmaz ki access modifier'i olsun. Look 5th.
  7- Child classta override edilen metodun return type ı methodun return ettiği data tipinin aynısı veya o data tipinin parenti olarak seçilebilir.
  8- metodun return type ı primitive ise overrideing yaparken return type değiştirilemez. çünkü return type ya aynı olur
      veya PARENTTEN seçilir ama primitivelerde parent-child ilişkisi yoktur
  9- metodun return type ı wrapper ise overrideing yaparken return type değiştirilemez. wrapperlarda parent-child ilişkisi yok
  10- metodun return type ı void ise overrideing yaparken return type değiştirilemez.
  11- final metodlar ve statik metodlar override edilemezler.
  12- override yapabilmek için inheritance (parent-child) şarttır.
  13- method overloading Compile time polymorphism, method overriding Run time polymorphism'dir
  14- method overloading static polymorphism, method overriding dynamic polymorphism'dir

         1) Final kelimesini "Variable"larda kullanabilirsiniz.
                            ->final variable ise
                            i) mutlaka değer atanmalıdır
                            ii) ilk atanan değer değiştirilemez

         2)Final kelimesini "Method" larda kullanabilirsiniz.
                             ->method final ise;
                              i)methodun body'si değiştirilemez
                              ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

         3)Final kelimesini "Class"larda kullanabilirsiniz.
                             ->class final ise;
                               i)o class'ın child'ı olamaz
 */
public class Animal {
    public void eat() { // parennta Override edilmiş bu methoda Overridden method denir
        System.out.println("Animals eat..");
    }

    public void drink() {
        System.out.println("Animals drink..");
    }

    public Animal create() {
        return new Animal();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Integer multiply(int a, int b) {
        return a * b;
    }
}
