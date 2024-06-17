// Repeatition
// do ... while ...
class Scratch {
    public static void main(String[] args) {
        int a = 6;
        do { // at least, one time loop process
            System.out.println("a = " + a);
            System.out.println("This is in do-while loop");
        } while (a != 6); // เงื่อนไขการจบการทำงาน
        // End do-while loop when a == 6
        System.out.println("This is out of do-while loop");

    }
}