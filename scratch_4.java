//Constant

class Scratch {
    public static void main(String[] args) {
        final double PI = 3.1416;
        double number = 3.1416; // คัวแปรนี้ สามารถเปลี่ยนค่าใหม่ได้

        // PI = 3.14; // ไม่สามารถเปลี่ยนค่าใหม่ได้อีก
        number = 3.0;
        System.out.println(PI);
        System.out.println(number);
    }
}