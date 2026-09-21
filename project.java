public class project {
    public static void main(String[] args) {
    }

    public static void processPayments(int amount) {
        System.out.println("the payments of the" + amount + "has been made");
    }

    public static void processPayment(double amount) {
        System.out.println("the payments of the" + amount + "has been made");
    }

    public static void processPayments(String recipient, int amount) {
        System.out.println("the payments of the" + amount + "has been sent to the recipient");

        processPayments(7000);
        processPayments("Tim", 500);


        System.out.println("enter payment amount");

        int totalAmount = 7000;

        if (amount >= 5000) {
            int serviceCharge = 100;
            int total = amount + serviceCharge;

            System.out.println("payments can be processed");
            System.out.println("service Charge" + serviceCharge + "has been made");
            System.out.println("Total amount" + totalAmount + "has been made");

            processPayments(amount);
            System.out.println("payments has been confirmed successfully");
        } else {
            int shortage = 8000 - amount;
            System.out.println("payments failed : insufficient amount ");
            System .out.println("i need amount" + shortage + "more");
        }
    }
}
