// Program to print a text 10 times

class Main {
    public static void main(String[] args) {

        int n = 10;
        // for loop
        // Incremental
        for (int i = 1; i <= n; ++i) {
            System.out.println(i + ". " + "Java is my favorite programming language.");
        }

        n = 1;
        // for loop - Decremental
        for (int i = 10; i >= n; i--) {
            System.out.println(i + ". " + "Java is my favorite programming language.");
        }


    }
}