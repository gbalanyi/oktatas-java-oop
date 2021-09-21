package io.github.gbalanyi.java.oop.solid.open.bad;

public class Product {

    private int rawMaterialPrice;

    private int wasteRate;

    public Product(int rawMaterialPrice) {
        this.rawMaterialPrice = Math.max(rawMaterialPrice, 0);
    }

    public Product(int rawMaterialPrice, int wasteRate) {
        this.rawMaterialPrice = Math.max(rawMaterialPrice, 0);
        this.wasteRate = wasteRate;
    }

    public int calculatePrice() {
        //   return 100 + rawMaterialPrice;
        return (100 + rawMaterialPrice) - (wasteRate * 3);
    }
}
