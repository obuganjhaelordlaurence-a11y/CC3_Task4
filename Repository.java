import java.util.ArrayList;

public class Repository {

    public static ArrayList<Hardware> getHardwareList() {
        ArrayList<Hardware> list = new ArrayList<>();

        // Laptops
        list.add(new Laptop("Dell", 16));
        list.add(new Laptop("HP", 32));
        list.add(new Laptop("Lenovo", 16));
        list.add(new Laptop("Asus", 8));

        // Phones
        list.add(new Phone("Samsung", 50));
        list.add(new Phone("Apple", 12));
        list.add(new Phone("Xiaomi", 50));
        list.add(new Phone("Realme", 16));

        return list;
    }
}
