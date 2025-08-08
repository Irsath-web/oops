class Watch {
    String brand;
    String type;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: ₹" + price);
    }

    void applyDiscount(double percentage) {
        double discountAmount = (price * percentage) / 100;
        price -= discountAmount;
        System.out.println("After " + percentage + "% discount, new price is ₹" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Watch watch1 = new Watch();
        Watch watch2 = new Watch();

        watch1.brand = "Rolex";
        watch1.type = "Analog";
        watch1.price = 550000;

        watch2.brand = "Casio";
        watch2.type = "Digital";
        watch2.price = 2500;

        System.out.println("--- Watch 1 Details ---");
        watch1.displayDetails();

        System.out.println("\n--- Watch 2 Details ---");
        watch2.displayDetails();

        System.out.println("\nApplying discount on watches:");
        watch1.applyDiscount(10);
        watch2.applyDiscount(5);
    }
}
