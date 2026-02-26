
import java.util.Scanner;


public class L4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car[] carlist = new Car[3];
        

        carlist[0] = new Car("Ford", "Ranger", 4500000, 2025);
        carlist[1] = new Car("Lambo","Aventador", 600000, 2024);
        carlist[2] = new Car("Jeep","Wrangler", 90000, 2200);

        for(Car c : carlist){
            c.displayInfo();
            System.out.println("Down Payment: " + c.downPayment(10));
        }

        Car[] myCarList = new Car[1];

        for (int i = 0; i < myCarList.length; i++) {
            System.out.printf("Enter Car #%d Info \n", (i + 1));
            System.out.printf("Brand: ");
            String brand = sc.nextLine();
            System.out.printf("Model: ");
            String model = sc.nextLine();
            System.out.printf("Year: ");
            int year = sc.nextInt();
            System.out.printf("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            myCarList[i] = new Car(brand, model, price, year);
        }
        for (int i = 0; i < myCarList.length; i++) {
            myCarList[i].displayInfo();
            myCarList[i].price*=0.98;
            System.out.println("New Price: RM" + myCarList[i].price);
            System.out.println("Down Payment: RM" + myCarList[i].downPayment(10));
        }
        sc.close();
    }
}
