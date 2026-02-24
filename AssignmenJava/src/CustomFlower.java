
import java.util.Scanner;



public class CustomFlower {
    public double customFlower(){
        
        int Flowers = 0;
        double calculations = 0.0;
        char Ans;
        double package_1_10 = 10;
        double package_11_50 = 9.5;
        double package_Over_50 = 8;

        Scanner sc = new Scanner(System.in);


        do { 
            System.out.println("----NUMBER OF FLOWERS----------|---PRICE(RM)---");
            System.out.println(" 1. 1 - 10 Flowers             |  10.00");
            System.out.println(" 2. 11 - 50 Flowers            |   9.50");
            System.out.println(" 3. Above 50 Flowers           |   8.00");
            System.out.println("===============================|===============");

            System.out.println("Please Input Amount of Flowers");       //RECIEVING INPUT FOR THE AMOUNT OF FLOWERS BY THE USER
            Flowers += sc.nextInt();
            calculations = 0.0;

            if(Flowers >=  1 && Flowers <= 10)          //CALCULATIONS FOR THE PRICING OF THE FLOWERS
            {
                calculations += Flowers * package_1_10;     //PACKAGE_1_10 INITIALIZED AT THE TOP
            }
            else if(Flowers >= 11 && Flowers <= 50)
            {
                calculations += Flowers * package_11_50;        //PACKAGE_11_50 INITIALIZED AT THE TOP
            }
            else if (Flowers > 50)
            {
                calculations += Flowers * package_Over_50;  //PACKAGE_OVER_50 INITIALIZED AT THE TOP
            }
            
            System.out.println("Current Amount Of Flowers: " + Flowers);        //DISPLAYING THE AMOUNT OF FLOWERS CHOSEN BY THE USER
            System.out.println("Would you like to add anymore flowers (Y/N)");  //ASKING IF THE USER WANTS TO ADD FLOWERS
            Ans = sc.next().toUpperCase().charAt(0);           //RECIEVING THE CHAR VALUE FROM THE ADDITION OF FLOWERS
                } while (Ans == 'Y');     //THE LOOP ENDS IF THE USER DOESNT WANT TO ADD FLOWERS

            return calculations;
    }
}
