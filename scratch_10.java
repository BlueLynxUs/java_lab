import java.util.Scanner;

class DoWhileExit {
    public static void main(String[] args) {
        int number = 0; // ตัวแปรตัวเลข
        String userChoice; // ตัวแปรตัวสตริง ใช้เพื่อเช็คจบการทำงาน
        Scanner scanner = new Scanner(System.in); // Create a Scanner object ใช้สำหรับรับข้อมูลจากผู้ใช่้ เหมือนคำสั่ง input ในภาษาไพทอน

        // Loop to continue until user chooses to exit
        do {
            // Begin program logic here (e.g., prompt user for input)
            System.out.println("Current number: " + number);
            System.out.print("Enter a number (or 'exit' to quit): ");
            userChoice = scanner.nextLine(); // Read input using Scanner

            // Update number based on user input (optional)
            // ถ้าค่าที่ใส่เป็นตัวเลข ให้แปลงเป็นตัวเลขและนำไปเก็บใน number
            if (userChoice.matches("\\d+")) { // Check if input is a number
                number = Integer.parseInt(userChoice);
            }

            // Check for exit condition
        } while (!userChoice.equalsIgnoreCase("exit"));

        System.out.println("Exiting the loop...");
        scanner.close(); // Close Scanner (optional but good practice)
    }
}
