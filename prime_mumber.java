import java.util.Scanner;

public class prime_mumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the count number");
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter the numbers");
            int n = scn.nextInt();
            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
