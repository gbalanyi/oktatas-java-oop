package io.github.gbalanyi.java.oop.solid.open.good;

public class WasteRatePriceCalculator implements PriceCalculator {

    private int rawMaterialPrice;
    private int wasteRate;

    public WasteRatePriceCalculator(int rawMaterialPrice, int wasteRate) {
        this.rawMaterialPrice = Math.max(rawMaterialPrice, 10);
        this.wasteRate = wasteRate;
    }

    @Override
    public int calculatePrice() {
        return (100 + rawMaterialPrice) - (wasteRate * 3);
    }
}
