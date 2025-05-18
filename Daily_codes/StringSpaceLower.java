package apnacollege;

import java.util.Scanner;

public class StringSpaceLower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Split words by spaces
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        // Append first word as is
        result.append(words[0]);

        // Append the rest with the first letter lowercase
        for (int i = 1; i < words.length; i++) {
            result.append(words[i].toLowerCase());
        }
        System.out.println("Result"+result.toString());
    }
}

