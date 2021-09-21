package io.github.gbalanyi.java.oop.solid.open.good;

public class Product {

    private PriceCalculator priceCalculator;

    public Product(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    public PriceCalculator getPriceCalculator(){
        return priceCalculator;
    }

    public final int calculatePrice() {
        return priceCalculator.calculatePrice();
    }
}
