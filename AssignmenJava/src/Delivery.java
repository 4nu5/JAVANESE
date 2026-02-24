

import java.util.Scanner;

public class Delivery {
    public double getDelivery(double distance){
        Scanner sc = new Scanner(System.in);

         System.out.println("--------Distance---------------|---Delivery Charge(RM)---");
         System.out.println(" 1. Less than 5km              |   Free delivery");
         System.out.println(" 2. 5 - 10km                   |   RM 1.50 per km");
         System.out.println(" 3. More Than 10km             |   RM 2.00 per km");
         System.out.println("===============================|==================");

         System.out.printf("Please Enter The distance from your house to the shop: ");
         distance = sc.nextDouble();

         if (distance < 5)       //DISTANCE CALCULATIONS
            {
                System.out.println("FREE DELIVERY");
                distance = 0.0;
            }
            else if(distance >= 5 && distance <= 10)
            {
                distance *= 1.5;
            }
            else
            {
                distance *= 2.0;
            }

            System.out.println(distance);
            return distance;
        }

    }

