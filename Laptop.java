public class Laptop extends Hardware {

    public Laptop(String brand, int specValue) {
        super(brand, specValue);
    }

    @Override
    public String interpretSpec() {
        return specValue + "GB RAM";
    }
}
