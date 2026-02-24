

public class L3_2 {
    public static void main(String[] args) {
        Car car1 = new Car("LAMBO", "Aventador", 5000, 1985);
        double price = car1.calculatePrice(100);
        System.out.println("Selling Price: " + price);
        System.out.println("Car category: " + car1.getCarCategory());
    }
}
