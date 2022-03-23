import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the marks of the student");
        int marks = scn.nextInt();
        if (90 < marks) {
            System.out.println("excelent");
        } else if (80 < marks) {
            System.out.println("good");
        } else if (70 < marks) {
            System.out.println("fair");
        } else if (60 < marks) {
            System.out.println("meets expectations");
        } else if (marks < 60) {
            System.out.println("below par");
        }
    }

}
