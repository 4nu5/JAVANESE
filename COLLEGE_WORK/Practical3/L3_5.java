

import java.util.Scanner;

public class L3_5 {
    public static void main(String[] args) {
        double[] carPrice = new double[9];
        int arraySize = carPrice.length;
        System.out.println("Num of Cars: " + arraySize);
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< carPrice.length; i++){
            System.out.printf("ENTER CAR #%d price: ", (i + 1));
            carPrice[i] = sc.nextDouble();
        }
        for(int j = 0; j < carPrice.length; j++){
            System.out.printf("CAR #%d PRICE: RM %.2f \n", (j+1), carPrice[j]);
        }

        System.out.printf("Car Price: ");
        for(double price : carPrice){
            System.out.printf("RM %.2f |" , price);
        }
        double total = 0.0;
        for(double p : carPrice)
            total += p;
        System.out.println("TOTAL: " + total);

        double avg = total / carPrice.length;
        System.out.println("AVG: " + avg);
        sc.close();
    }
}
