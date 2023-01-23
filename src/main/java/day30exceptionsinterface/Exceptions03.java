package day30exceptionsinterface;

public class Exceptions03 {
    public static void main(String[] args) {

        getStudentGrade(98);

        getTheNumberOfStudent(-24);

    }

    public static void getStudentGrade(int grade) {
        if (grade < 0 || grade > 100) {
            try {
                throw new InvalidStudentGradeException("0-100 arası olmalı");
            } catch (InvalidStudentGradeException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println(grade);
        }
    }

    public static void getTheNumberOfStudent(int numOfStudent) {
        if (numOfStudent < 0) {
            try {
                throw new InvalidNumberException("student number cannot be negative");
            } catch (InvalidNumberException e) {
                System.err.println(e.getMessage());  // err  --> kırmızı yapar ve java farklı yerde depoluyor
            }
        } else {
            System.out.println(numOfStudent);
        }
    }
}
