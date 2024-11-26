import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] n = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one at a time:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            n[i] = scanner.nextInt();
        }

        scanner.close();

        int l = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        for (int n1 : n) {
            if (n1 > l) {
                s = l;
                l = n1;
            } else if (n1 > s && n1 < l) {
                s = n1;
            }
        }

        if (s == Integer.MIN_VALUE) {
            System.out.println("2All elements are the same.");
        } else {
            System.out.println("second-largest element is " +
                    s + ".");
        }
    }
}