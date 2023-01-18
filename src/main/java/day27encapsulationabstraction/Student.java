package day27encapsulationabstraction;

public class Student {

    private static String stdID = "asd123";  // private --> encapsulation
    private boolean isPoor = true;

    // encapsulation yapılan datayı görme  --> get methodu (getter) (her zaman public olur)
    public String getStdID() { // stdID - isimlendirme  ==>  getStdId          -- parametre kullanılmaz
        return stdID; // stdID -> string olduğu için  return type = STRING
    }

    public boolean isPoor() {
        return isPoor;
    }

    // getter ve setter ların ikisine birden "Java Beans" denir

    // encapsulation yapılan datayı değiştirme  --> set methodu (setter)
    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public void setPoor(boolean poor) {
        isPoor = poor;
    }
}
