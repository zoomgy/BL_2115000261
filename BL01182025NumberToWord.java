import java.util.Scanner;

public class BL01182025NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        System.out.println(numbers[sc.nextInt()]);
        sc.close();
    }
}
