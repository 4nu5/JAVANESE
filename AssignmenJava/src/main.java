
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char Answer;
        String AnswerFlower;
        double total = 0.0;
        double Price = 0.0;                 //INITIALISATION
        int wrappingFee = 10;
        double finalTotal = 0.0;

        

        do {        //LOOP FOR BUYING STUFF
         System.out.println("WELCOME TO BLOOM BLOOM FLORIST");
        System.out.println("WOULD YOU LIKE CUSTOM OR PRE-PACKAGED FLOWERS");            
        System.out.println("TYPE \"CUSTOM\" FOR CUSTOM & \" PACKAGE\" FOR PRE-PACKAGED FLOWER");        
        AnswerFlower = sc.nextLine().toUpperCase();
        if ("PACKAGE".equals(AnswerFlower)) {
             
        PreMadeFlower flower = new PreMadeFlower(); //<-- premade package
        Price += flower.preMadeFlower();
        }
        else if ("CUSTOM".equals(AnswerFlower)) {
            CustomFlower price = new CustomFlower();        //<-- custom made package
            total += price.customFlower();
        }
        System.out.println("WOULD YOU LIKE TO ADD MORE ITEMS?");        //asking if the user wants to purchase the other package
        Answer = sc.nextLine().toUpperCase().charAt(0);

        } while (Answer != 'N'); //<-- stops loop
        
        Delivery delivery = new Delivery(); //<-- delivery class
        double DELIVERY = delivery.getDelivery(0.0);

      double subTotal = Price + total;  //<-- calcutale subtotal
      double Tax = (subTotal + DELIVERY) * 0.08; //<-- calculate tax
      
      if("CUSTOM".equals(AnswerFlower)){ //<-- to add the wrapping fee if user chooses custom package
        finalTotal = wrappingFee + subTotal + Tax;
      }
      else
        finalTotal = Tax + subTotal + DELIVERY; //<-- regular totaling


        System.out.println("=========================================");                //DISPLAYING ALL THE VALUE
        System.out.println("SubTotal: " + subTotal);                                       //FOR THE USER
        System.out.println("Delivery Fees: " + DELIVERY);  
        System.out.printf("Sales Tax & Service Tax (8%%): RM %.2f \n" , Tax);
        System.out.println("------------------------------------------");
        System.out.println("Grand Total: " + finalTotal); //<-- grandtotal
        System.out.println("=========================================");
    }
}
