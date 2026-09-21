public class main {
    static void main(String[] args) {
    }

    public static void processPayments(int amount) {
        System.out.println("the payments of the" + amount + "has been made");
    }

    public static void processPayment(double amount) {
        System.out.println("the payments of the" + amount + "has been made");
    }

    public static void processPayments(String recipient, int amount) {
        System.out.println("the payments of the" + amount + "has been made");

        processPayments(7000);
        processPayments(800);
        processPayments("Tim", 500);
    }
}
