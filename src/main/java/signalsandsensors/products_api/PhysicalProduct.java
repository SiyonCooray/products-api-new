package signalsandsensors.products_api;

// A PhysicalProduct IS-A Product because it has a name, a price and an id, and can be sold anywhere a Product is expected
// A ShoppingCart is NOT a Product, because it contains products rather than being one (HAS-A)
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {

    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
