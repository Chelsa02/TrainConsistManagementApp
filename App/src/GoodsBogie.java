public class GoodsBogie {

    private String type;
    private String cargo;

    //  Constructor for UC12
    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    // Constructor for UC15
    public GoodsBogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    // UC15 method
    public void assignCargo(String cargo) {
        try {
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Assignment completed.\n");
        }
    }
}