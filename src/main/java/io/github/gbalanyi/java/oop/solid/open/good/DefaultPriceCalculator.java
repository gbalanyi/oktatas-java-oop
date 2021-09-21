package io.github.gbalanyi.java.oop.solid.open.good;

public class DefaultPriceCalculator implements PriceCalculator {

    private int rawMaterialPrice;

    public DefaultPriceCalculator(int rawMaterialPrice) {
        this.rawMaterialPrice = Math.max(rawMaterialPrice, 10);
    }

    @Override
    public int calculatePrice() {
        return 100 + rawMaterialPrice;
    }
}
