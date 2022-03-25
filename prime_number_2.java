import java.util.Scanner;

/**
 * prime_number_2
 */
public class prime_number_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int i = low; i <= high; i++) {
            // System.out.printf("print range:%d\n", +i);
            int count = 0;
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.printf("prime: %d\n", +i);
            } else {
                System.out.printf("not prime: %d\n", +i);
            }
        }

    }

}