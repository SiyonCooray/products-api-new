package signalsandsensors.products_api;

// A PhysicalProduct IS-A Product because it has a name, a price and an id, and can be sold anywhere a Product is expected
// A ShoppingCart is NOT a Product, because it contains products rather than being one (HAS-A)
public class PhysicalProduct extends Product implements Discountable {
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

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

    @Override
    public String getSummary() {
        return getName() + " - $" + getPrice()
                + " - Weight: " + getWeightKg() + "kg"
                + " - Dimensions: " + getDimensions();
    }

    @Override
    public void applyDiscount(double rate) {
        discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
