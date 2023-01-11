package day22staticblocksconstructors;

public class StudentRunner {
    public static void main(String[] args) {
        Student std1 = new Student("ali can", 13, 7, "ASD123","İstanbul");
        Student std2 = new Student("tom hanks", 21, "ASD124");

        System.out.println(std1);
        System.out.println(std2);
    }

}
