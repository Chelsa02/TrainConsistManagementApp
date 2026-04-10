/**
 * ===============================================================
 * CLASS - GoodsBogie
 * ===============================================================
 * Represents a goods bogie with type and cargo
 */
public class GoodsBogie {

    private String type;
    private String cargo;

    // Constructor
    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    // Getters
    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    // Optional: for display
    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}