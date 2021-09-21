package io.github.gbalanyi.java.oop.solid.open.good;

public class JavaApp {

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp() {

        Product product = new Product(new DefaultPriceCalculator(10));
        this.printPrice(product);

        Product product2 = new Product(new WasteRatePriceCalculator(10, 5));
        if (product2.getPriceCalculator() instanceof DefaultPriceCalculator) {
            this.printPrice(product2);
        }
    }

    private void printPrice(Product product) {
        int price = product.calculatePrice();
        if (price < 100) {
            System.err.println(String.format("Invalid price %d", price));
        } else {
            System.out.println(String.format("Price: %d", price));
        }
    }
}
