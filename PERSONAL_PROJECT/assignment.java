import java.util.Scanner;


public class assignment {
    public static void main(String[] args) {
        
        System.out.println("HELLO WELCOME TO BLOOMBLOOM FLORIST SHOP");
        Scanner sc = new Scanner(System.in);
        int ans;                                            //INITIALIZATION
        double flowerStand = 178.00;
        double flowerBouquet = 228.00;
        double graduationBoquetMini = 58.00;
        double graduationBoquetFlower = 128.00;
        double graduationBoquetToy = 188.00;
        double weddingBouquetMini = 68.00;
        double weddingBouquet = 168.00; 
        double price = 0.0;
        double package_1_10 = 10;
        double package_11_50 = 9.5;
        double package_Over_50 = 8;
        int unit = 0;
        char answer;
        int Custom = 0;
        int Flowers = 0;
        double calculations = 0.0;
        char Ans;
        double total = 0.0;
        int customWrappingFee = 10;
        char delivery;
        int distance;
        double distanceTotal = 0.0;
        double finalTotal = 0.0;
        double Tax = 0.0;
        int flowerAmount = 0;
        double subTotal = 0.0;
        double newCalculation = 0.0;                        //INITIALIZATION END


        System.out.print("WOULD YOU LIKE CUSTOM FLOWER ARRANGEMENT (TYPE \"A\") OR PRE - MADE PACKAGES (TYPE \"B\") : ");
        answer = sc.next().toLowerCase().charAt(0);                 //ASKING AND RECIEVING CUSTOM OR PREMADE PACKAGE FROM USER

        do {                                    //LOOP TO DISPLAY WHAT THE USER HAS CHOSEN AND MAKE SURE THAT THEY CHOSE THE CORRECT THING
           switch(answer)           
           {
            case 'a':
                System.out.println("You Have Chosen Custom Arrangement");
                Custom = 1;
                break;

            case 'b':
                System.out.println("You have Chosen Pre - Made Package");
                Custom = 2;
                break;

                default:
                    System.out.println("Please Enter a Valid Input");
           }
        } while (answer != 'a' && answer != 'b');

        
        switch(Custom)              //SWITCH CASE FOR CUSTOM FLOWER AND PRE-MADE PACKAGE
        {
            case 1:     //CUSTOM FLOWER SELECTION
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
            Ans = sc.next().charAt(0);          //RECIEVING THE CHAR VALUE FROM THE ADDITION OF FLOWERS
                } while (Ans == 'Y' || Ans == 'y');     //THE LOOP ENDS IF THE USER DOESNT WANT TO ADD FLOWERS
                break;
            case 2:     //PRE-MADE PACKAGE SELECTION
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
        break;
    }
        System.out.println("Do you require Delivery?");     //INPUT AND RECIEVING IF THE USER WANTS DELIVERY
        delivery = sc.next().charAt(0);

        if(delivery == 'Y' || delivery == 'y')      //IF STATEMENT FOR THE ANSWER FOR DELIVERY
        {
            System.out.println("--------Distance---------------|---Delivery Charge(RM)---");
            System.out.println(" 1. Less than 5km              |   Free delivery");
            System.out.println(" 2. 5 - 10km                   |   RM 1.50 per km");
            System.out.println(" 3. More Than 10km             |   RM 2.00 per km");
            System.out.println("===============================|==================");

            System.out.print("Please State The Distance from your House to the Shop: ");
            distance = sc.nextInt();        //INPUT AND RECIEVING FOR THE DISTANCE FROM THE SHOP

            if (distance < 5)       //DISTANCE CALCULATIONS
            {
                System.out.println("FREE DELIVERY");
            }
            else if(distance >= 5 && distance <= 10)
            {
                distanceTotal = (distance - 5) * 1.5;
            }
            else
            {
                distanceTotal = (distance - 10) * 2.0;
            }

            System.out.println(distanceTotal);
        }

        
        if(Custom == 1) //IF STATEMENT TO DISPLAY CUSTOM FLOWER AMOUNT AND DO CALCULATIONS IF CUSTOM FLOWER IS SELECTED
        {
            System.out.println("Flowers Amount: " + Flowers);
            newCalculation = calculations + customWrappingFee;
        }

        subTotal = price + newCalculation;      //CALCULATION FOR SUBTOTAL
        Tax = (subTotal +  distanceTotal) * 0.08;   //CALCULATION FOR TAX
        finalTotal = Tax + price + newCalculation + distanceTotal;  //CALCULATION FOR GRAND TOTAL
        System.out.println("=========================================");                //DISPLAYING ALL THE VALUE
        System.out.println("SubTotal: " + subTotal);                                       //FOR THE USER
        System.out.println("Delivery Fees: " + distanceTotal);  
        System.out.printf("Sales Tax & Service Tax (8%%): RM %.2f \n" , Tax);
        System.out.println("------------------------------------------");
        System.out.println("Grand Total: " + finalTotal);
        System.out.println("=========================================");

        sc.close(); //CLOSING THE SCANNER
}

}


