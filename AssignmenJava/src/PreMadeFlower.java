

import java.util.Scanner;

public class PreMadeFlower {
    public double preMadeFlower(){
        
        Scanner sc = new Scanner(System.in);
        double flowerStand = 178.00;
        double flowerBouquet = 228.00;
        double graduationBoquetMini = 58.00;
        double graduationBoquetFlower = 128.00;             //INITIALIZATION
        double graduationBoquetToy = 188.00;
        double weddingBouquetMini = 68.00;
        double weddingBouquet = 168.00;
        int ans;
        double unit = 0.0;
        double price = 0.0;
        
                do{     //LOOP FOR PRE-MADE PACKAGE SELECTION
            System.out.println("----PACKAGE TYPE---------------|---PRICE(RM)---");
            System.out.println(" 1.Flower Stand                |  178.00");
            System.out.println(" 2.Flower Bouquet              |  228.00");
            System.out.println(" 3.Graduation Bouquet (Mini)   |   58.00");
            System.out.println(" 4.Graduation Bouquet (Flower) |  128.00");
            System.out.println(" 5.Graduation Bouquet (Toy)    |  188.00");
            System.out.println(" 6.Wedding Bouquet Mini        |   68.00");
            System.out.println(" 7.Wedding Bouquet             |  168.00");
            System.out.println("===============================|===============");

            System.out.print("PLEASE MAKE A SELECTION (Type 1,2,3,4,5,6,7 (Press 0 to Exit)) : ");
            ans = sc.nextInt();         //INPUT RECIEVING FOR THE PACKAGE TYPE


            switch(ans){    //SWITCH CASE FOR THE PACKAGE TYPE AND THE CALCULATIONS OF THE ENTERED AMOUNT
                case 1:
                System.out.println("STATE THE NUMBER OF FLOWER STANDS");
                unit = sc.nextInt();
                price += flowerStand * unit;
                break;

                case 2:
                    System.out.println("STATE THE NUMBER OF FLOWER BOUQUETS");
                    unit = sc.nextInt();
                    price += flowerBouquet * unit;
                    break;
                case 3: 
                    System.out.println("STATE THE NUMBER OF Graduation Bouquet (Mini)");
                    unit = sc.nextInt();
                    price += graduationBoquetMini * unit;
                    break;
                case 4:
                    System.out.println("STATE THE NUMBER OF Graduation Bouquet (Flower)");
                    unit = sc.nextInt();
                    price += graduationBoquetFlower * unit;
                    break;
                case 5:
                    System.out.println("STATE THE NUMBER OF Graduation Bouquet (Toy)");
                    unit = sc.nextInt();
                    price += graduationBoquetToy * unit;
                    break;
                case 6:
                    System.out.println("STATE THE NUMBER OF Wedding Bouquet (Mini)");
                    unit = sc.nextInt();
                    price += weddingBouquetMini * unit;
                    break;
                case 7:
                    System.out.println("STATE THE NUMBER OF Graduation Bouquet");
                    unit = sc.nextInt();
                    price += weddingBouquet * unit;
                    break;
            }
        }while(ans != 0);       //THE LOOP WILL EXIT WHEN THE USER ENTERS 0

        return price;
    }
}
