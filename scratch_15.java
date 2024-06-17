import java.util.Scanner;

class WhileExit {
    public static void main(String[] args) {
        int number = 0;
        String userChoice;
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input and update number initially
        System.out.print("Enter a number (or 'exit' to quit): ");
        userChoice = scanner.nextLine();
        if (userChoice.matches("\\d+")) {
            number = Integer.parseInt(userChoice);
        }

        // Loop to continue until user chooses to exit
        while (!userChoice.equalsIgnoreCase("exit")) {
            // Your program logic here (e.g., prompt user for input)
            System.out.println("Current number: " + number);

            // Update number based on user input (optional)
            if (userChoice.matches("\\d+")) {
                number = Integer.parseInt(userChoice);
            }

            // Prompt for the next input
            System.out.print("Enter a number (or 'exit' to quit): ");
            userChoice = scanner.nextLine();
        }

        System.out.println("Exiting the loop...");
        scanner.close();
    }
}
