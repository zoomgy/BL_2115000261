import java.util.Arrays;
import java.util.Scanner;

public class BL01182025PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        boolean[] prime = new boolean[range + 1];
        for (int i = 2; i < prime.length; i++) {
            if (prime[i] != true) {
                for (int j = 2 * i; j < prime.length; j += i) {
                    if (j % i == 0)
                        prime[j] = true;
                }
            }
        }
        for (int i = 1; i < prime.length; i++) {
            if (!prime[i]) {
                System.out.print(i + "    ");
            }
        }
    }
}
