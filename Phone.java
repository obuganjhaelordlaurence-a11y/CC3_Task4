public class Phone extends Hardware {

    public Phone(String brand, int specValue) {
        super(brand, specValue);
    }

    @Override
    public String interpretSpec() {
        return specValue + " Megapixels";
    }
}