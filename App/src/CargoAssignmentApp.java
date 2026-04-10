public class CargoAssignmentApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("========================================\n");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");   // Safe
        b2.assignCargo("Petroleum");   // Exception

        System.out.println("Final Bogie Status:");
        System.out.println(b1);
        System.out.println(b2);
    }
}