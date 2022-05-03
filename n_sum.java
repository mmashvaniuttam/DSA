import java.util.Scanner;

public class n_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Entere a natural number:\n");
        int n = scn.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }

}
