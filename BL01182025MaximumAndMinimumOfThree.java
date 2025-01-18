import java.util.Scanner;

public class BL01182025MaximumAndMinimumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        System.out.print("Maximum : ");
        System.out.println(Math.max(first, Math.max(second, third)));
        System.out.print("Minimum : ");
        System.out.println(Math.min(first, Math.min(second, third)));
        sc.close();
    }
}
