import java.util.ArrayList;
import java.util.List;

// GoodsBogie class
class GoodsBogie {
    private String type;   // Cylindrical, Rectangular, etc.
    private String cargo;  // Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // Try invalid case:
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        // Safety validation using Stream
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical") ||
                        b.getCargo().equalsIgnoreCase("Petroleum")
                );

        System.out.println("\nSafety Compliance Status: " + (isSafe ? "SAFE" : "UNSAFE"));

        System.out.println("\nProgram continues...");
    }
}
