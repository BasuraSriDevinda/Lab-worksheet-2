import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Get the sentence from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();


        String cleanedSentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();


        String reversedSentence = new StringBuilder(cleanedSentence).reverse().toString();

        if (cleanedSentence.equals(reversedSentence)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }

        input.close();
    }
}
