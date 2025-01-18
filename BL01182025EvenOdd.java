public class BL01182025EvenOdd {
    public static void main(String[] args) {
        System.out.println("Checking numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
    }
}
