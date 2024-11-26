import java.util.Scanner;
 public class Main {

    public static void main(String[]arg){
         int number;
        Scanner input= new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int numS=input.nextInt();
            //check num=new check(Integer.toString(input.next ())) ;
            check check1=new check(numS) ;
            if (check.number >= 0) {
                int digitCount = countDigits(check.number);
                System.out.println("Total digits: " + digitCount);
            }





        }while (check.number>0 );
        System.out.println("Program exited.");

    }
     public static int countDigits(int number) {
         int count = 0;

         return Integer.toString(number).length();
     }

 }
