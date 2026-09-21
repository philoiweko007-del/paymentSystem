public class payments {

    public static void checkPayments(int amount) {
        if (amount >= 5000) {
            int balance = amount - 5000;
            System.out.println("payments is sufficient");
        } else {
            int shortage = 5000 - amount;
            System.out.println("payments is insufficient");

            int balance = 7000;
            checkPayments(amount);
        }
    }
}
