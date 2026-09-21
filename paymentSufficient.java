public class paymentSufficient {

    public static void main(String[] args) {
        int amount = 800;
        int bonus = 1000;
        System.out.println("new amount" + amount);

        if (amount >= 5000) {
            System.out.println("your amount is  greater than 5000");

        } else if (amount < 1000) {
            System.out.println("Your amount was less than 1000");

        } else {
            int shortage = 5000 - amount;
            System.out.println("Payment is insufficient");
        }
    }
}
