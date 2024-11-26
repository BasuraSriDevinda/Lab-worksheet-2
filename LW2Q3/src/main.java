import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = scanner.nextInt();
        int sp = r- 1;
        int a= 1;
        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= a; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
            sp--;
            a += 2;
        }
    }
}