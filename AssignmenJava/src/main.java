
import java.util.Scanner;


//make sure cannot have negative value and also fix the error handling.
public class main {

  public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char Answer;
        String AnswerFlower;
        double total = 0;
        double Price = 0;                 //INITIALISATION
        double finalTotal = 0.0;
        int exit = 0;
        int orderCounter = 0;
        

        do {
          
          System.out.println("=========================================");
          System.out.println("1. Display Flower Packages");
          System.out.println("2. New Order");
          System.out.println("3. Generate Report");
          System.out.println("4. Exit");
          System.out.println("=========================================");
          exit = sc.nextInt();
          sc.nextLine();

          if(exit == 1){
            orderCounter += 1;
            Report.addToTotalOrders(orderCounter);
          }

          switch (exit) {
            case 1:
              PreMadeFlower pf = new PreMadeFlower();
              CustomFlower cf = new CustomFlower();
              pf.displayPreMadePackage();

              cf.displayPackage();
              break;
            case 2:
              do {        //LOOP FOR BUYING STUFF
         System.out.println("WELCOME TO BLOOM BLOOM FLORIST");
        System.out.println("WOULD YOU LIKE CUSTOM OR PRE-PACKAGED FLOWERS");            
        System.out.println("TYPE \"CUSTOM\" FOR CUSTOM & \" PACKAGE\" FOR PRE-PACKAGED FLOWER");    
        AnswerFlower = sc.nextLine().toUpperCase();
          while(!("PACKAGE".equals(AnswerFlower) || "CUSTOM".equals(AnswerFlower))){
          System.out.println("INVALID INPUT");
          System.out.println("WOULD YOU LIKE CUSTOM OR PRE-PACKAGED FLOWERS?");
          AnswerFlower = sc.nextLine().toUpperCase();
        }
        if ("PACKAGE".equals(AnswerFlower)) {
        PreMadeFlower flower = new PreMadeFlower(); //<-- premade package
        Price = 0;
        Price += flower.preMadeFlower();
        Report.addToPackageRevenue(Price);

        }
        else if ("CUSTOM".equals(AnswerFlower)) {
            total = 0;
            CustomFlower price = new CustomFlower();        //<-- custom made package
            total += price.customFlower();
            Report.addToCustomRevenue(total);
        }
        System.out.println("WOULD YOU LIKE TO ADD MORE ITEMS?");        //asking if the user wants to purchase the other package
        Answer = sc.nextLine().toUpperCase().charAt(0);
        while(Answer != 'N' && Answer != 'Y'){
          System.out.println("INVALID INPUT");
          System.out.println("RE-ENTER INPUT");
          Answer = sc.nextLine().toUpperCase().charAt(0);
        }

        } while (Answer != 'N'); //<-- stops loop
        
        Delivery delivery = new Delivery(); //<-- delivery class
        double DELIVERY = delivery.getDelivery(0.0);
        Report.addToDeliveryFees(DELIVERY);

      double subTotal = Price + total;  //<-- calcutale subtotal
      double Tax = (subTotal + DELIVERY) * 0.08; //<-- calculate tax
      Report.addToTax(Tax);
   
        finalTotal = Tax + subTotal + DELIVERY; //<-- regular totaling
        Report.addToGrandTotal(finalTotal);

        System.out.println("=========================================");                //DISPLAYING ALL THE VALUE
        System.out.println("SubTotal: " + subTotal);                                       //FOR THE USER
        System.out.println("Delivery Fees: " + DELIVERY);  
        System.out.printf("Sales Tax & Service Tax (8%%): RM %.2f \n" , Tax);
        System.out.println("------------------------------------------");
        System.out.println("Grand Total: " + finalTotal); //<-- grandtotal
        System.out.println("=========================================");
      
              break;
        case 3:
            Report.displayInfo();
            break;
          }
        } while(exit != 4);
        sc.close();
    }
}
