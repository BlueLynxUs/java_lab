class MultiplicationTable {

    public static void main(String[] args) {

        // Define the number for the multiplication table
        int number = 6; // Change this value to print a different table

        // Print the header
        System.out.println("Multiplication Table for " + number);

        // Loop to iterate from 1 to 10 (or any desired limit)
        for (int i = 1; i <= 12; i++) {

            // Calculate the product
            int product = number * i;

            // Print the multiplication equation in a formatted way
            System.out.printf("%d * %d = %d\n", number, i, product);
            //                 1     2    3   >  1     2     3
        }
    }
}
