

public class L3_3 {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("Car Brand: " + car1.getBrand());
        System.out.println("Car Model: " + car1.getModel());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Year: " + car1.getYear());

        car1.setBrand("LAMBO");
        car1.setModel("AVEN");
        car1.setPrice(28000);
        car1.setYear(2004);
        System.out.println("Car Brand: " + car1.getBrand());
        System.out.println("Car Model: " + car1.getModel());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Category: " + car1.getCarCategory());
        System.out.println("Selling price:  " + car1.calculatePrice(700));
        System.out.println("After Discount: " + car1.calculateRebate(700, 500));
        Car car2 = new Car("ford", "dhada", 2000, 2025);
        System.out.println(car2.toString());
        System.out.println(car2);
    }
}
