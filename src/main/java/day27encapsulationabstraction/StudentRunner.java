package day27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {
        Student myStd = new Student();
        // std 1
        System.out.println("myStd.getStdID() = " + myStd.getStdID());
        myStd.setStdID("qwe");
        System.out.println("myStd.getStdID() = " + myStd.getStdID());

        // std 2
        myStd.setStdID("asdfg");
        myStd.setPoor(false);
        System.out.println(myStd.getStdID());
        System.out.println(myStd.isPoor());
    }
}
