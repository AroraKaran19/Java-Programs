// 17. Create a user defined exception named "nomatchexception" that is fired when the string
//     entered by the user is not "india".

import java.util.Scanner;

class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class UserException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        try {
            if (!userInput.equals("india")) {
                throw new NoMatchException("Input string does not match expected value!");
            }
            // Do something if input matches
        } catch (NoMatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
