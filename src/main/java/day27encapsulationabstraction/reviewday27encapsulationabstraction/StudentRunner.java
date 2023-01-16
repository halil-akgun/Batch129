package day27encapsulationabstraction.reviewday27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {
        Student a = new Student();
        System.out.println("a.getId() = " + a.getId());
        System.out.println("a.isPoor() = " + a.isPoor());
        a.setId("789");
        a.setPoor(false);
        System.out.println("a.getId() = " + a.getId());
        System.out.println("a.isPoor() = " + a.isPoor());
    }
}
