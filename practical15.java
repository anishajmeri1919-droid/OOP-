class practical15 {

    void generateBill(int itemTotal) {
        System.out.println("Regular Customer");
        System.out.println("Item Total: " + itemTotal);
        System.out.println("Discount: 0");
        System.out.println("Final Bill Amount: " + itemTotal);
        System.out.println();
    }

    void generateBill(int itemTotal, int discount) {
        System.out.println("Privileged Customer");
        System.out.println("Item Total: " + itemTotal);
        System.out.println("Discount (Flat): " + discount);
        int finalAmount = itemTotal - discount;
        System.out.println("Final Bill Amount: " + finalAmount);
        System.out.println();
    }

    void generateBill(int itemTotal, double discountPercent) {
        System.out.println("Festive Offer Customer");
        System.out.println("Item Total: " + itemTotal);
        System.out.println("Discount (Percentage): " + discountPercent + "%");
        double discountAmount = (itemTotal * discountPercent) / 100;
        double finalAmount = itemTotal - discountAmount;
        System.out.println("Final Bill Amount: " + finalAmount);
        System.out.println();
    }

    public static void main(String[] args) {
        practical15 bill = new practical15();

        bill.generateBill(5000);

        bill.generateBill(5000, 500);

        bill.generateBill(5000, 10.5);
    }
}
