import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Hardware> hardwareList = Repository.getHardwareList();

        System.out.println("=== Hardware Masterlist ===");
        for (Hardware hw : hardwareList) {
            System.out.println(hw.getBrand() + " - " + hw.interpretSpec());
        }

        int laptop16 = 0;
        int laptop32 = 0;
        int phone50 = 0;

        System.out.println("\n=== Inventory Count ===");

        for (Hardware hw : hardwareList) {

            if (hw instanceof Laptop) {
                if (hw.getSpecValue() == 16) laptop16++;
                if (hw.getSpecValue() == 32) laptop32++;
            }

            if (hw instanceof Phone) {
                if (hw.getSpecValue() == 50) phone50++;
            }
        }

        System.out.println("16GB Laptops: " + laptop16);
        System.out.println("32GB Laptops: " + laptop32);
        System.out.println("50MP Phones: " + phone50);
    }
}