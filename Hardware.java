public class Hardware {
    protected String brand;
    protected int specValue; // raw value (e.g. 16, 32, 50)

    public Hardware(String brand, int specValue) {
        this.brand = brand;
        this.specValue = specValue;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpecValue() {
        return specValue;
    }

    // This will be overridden
    public String interpretSpec() {
        return "Unknown Spec";
    }
}