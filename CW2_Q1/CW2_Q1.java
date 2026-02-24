
import java.util.Scanner;



public class CW2_Q1{
    public static void main(String[] args) {
        
        String Public_type;
        char answer;
        int Journal_Article = 8000;
        int projectPaper_Thesis = 600;      //initialisation
        int conferencePaper = 4000;
        double discount = 0.0; //discount for total discount
        double Journal_ArticleDiscount = 0.0;
        double Thesis_ProjectDiscount = 0.0;
        double conferencePaperDiscount = 0.0;
        double subtotal = 0.0;
        double Journal_ArticleSubtotal = 0.0;
        double Thesis_ProjectSubtotal = 0.0;
        double conferencePaperSubtotal = 0.0;
        int Journal_ArticleCounter = 0;
        int Thesis_ProjectCounter = 0;
        int conferencePaperCounter = 0;
        double finalTotal = 0.00;
        int Journal_ArticleUnit = 0;
        int Thesis_ProjectUnit = 0;
        int conferencePaperUnit = 0;

        
        Scanner sc = new Scanner(System.in);
        

        do{ //start of the loop

            
            System.out.println("PUBLICATION TYPE       | PRICE(RM)");
            System.out.println("-----------------------|---------------");
            System.out.println("JOURNAL ARTICLE        | 8000");
            System.out.println("PROJECT PAPER / THESIS | 600");                 //menu
            System.out.println("CONFERENCE PAPER       | 4000");
            System.out.println("-----------------------|---------------");

        
            System.out.println("What Publication Type Would You Like? ");   //getting the answer from user
            System.out.println("TYPE OUT YOUR PUBLICATION TYPE");
        Public_type = sc.nextLine().toUpperCase();
        //checking for valid input
        while (!(("JOURNAL ARTICLE".equals(Public_type)) || ("PROJECT PAPER".equals(Public_type) || "THESIS".equals(Public_type)) || ("CONFERENCE PAPER".equals(Public_type)))){
            System.out.println("NOT A VALID INPUT");    
            System.out.println("RENETER YOUR PUBLICATION TYPE");
            Public_type = sc.nextLine().toUpperCase();
        }

        if ("JOURNAL ARTICLE".equals(Public_type)){     //calculation for journal
            System.out.println("HOW MANY ITEMS WOULD YOU LIKE: ");      
            Journal_ArticleUnit = sc.nextInt();
            while(Journal_ArticleUnit< 0){     //checking for valid input
                System.out.println("NOT A VALID INPUT");
                System.out.println("RENETER CORRECT VALUE");
                Journal_ArticleUnit = sc.nextInt();
            }
            Journal_ArticleCounter += Journal_ArticleUnit;
            Journal_ArticleSubtotal += Journal_Article * Journal_ArticleUnit;
        }

        else if("PROJECT PAPER".equals(Public_type) || "THESIS".equals(Public_type)){   //calculation for Project paper & Thesis
             System.out.println("HOW MANY ITEMS WOULD YOU LIKE: ");
            Thesis_ProjectUnit = sc.nextInt();
            while(Thesis_ProjectUnit < 0){      //checking for valid input
                System.out.println("NOT A VALID INPUT");
                System.out.println("RENETER CORRECT VALUE");
                Thesis_ProjectUnit = sc.nextInt();
            }
             Thesis_ProjectCounter += Thesis_ProjectUnit;
            Thesis_ProjectSubtotal += projectPaper_Thesis * Thesis_ProjectUnit;
        }
        else if("CONFERENCE PAPER".equals(Public_type)){        ////calculation for Conference paper
             System.out.println("HOW MANY ITEMS WOULD YOU LIKE: ");
             conferencePaperUnit = sc.nextInt();
             while(conferencePaperUnit < 0){    //checking for valid input
                System.out.println("NOT A VALID INPUT");
                System.out.println("RENETER CORRECT VALUE");
                conferencePaperUnit = sc.nextInt();
            }
             conferencePaperCounter += conferencePaperUnit;
            conferencePaperSubtotal += conferencePaper * conferencePaperUnit;
        }   

        System.out.println("Would you like to Add anything else?"); //asking if the user wants to add anything else
        answer = sc.next().toLowerCase().charAt(0);
        while(answer != 'y' && answer != 'n'){      //checking if got wrong answer
            System.out.println("RENETER YOUR ANSWER");
            answer = sc.next().toLowerCase().charAt(0);
        }

        if(sc.hasNextLine()){
                sc.nextLine();  //clearing buffer for scanner
            }

        }while(answer != 'n');  //ending of the loop
        

        if(Journal_ArticleUnit >= 3 && Journal_ArticleUnit <= 5){
            Journal_ArticleDiscount = Journal_ArticleSubtotal * 0.05;     //discount calculations based on amount of items
        }
        else if(Journal_ArticleUnit > 5){
            Journal_ArticleDiscount = Journal_ArticleSubtotal * 0.1;
        }
        
        if(Thesis_ProjectUnit >= 3 && Thesis_ProjectUnit <= 5){
            Thesis_ProjectDiscount = Thesis_ProjectSubtotal * 0.05;     //discount calculations based on amount of items
        }
        else if(Thesis_ProjectUnit > 5){
            Thesis_ProjectDiscount = Thesis_ProjectSubtotal * 0.1;
        }
         if(conferencePaperUnit >= 3 && conferencePaperUnit <= 5){
            conferencePaperDiscount = conferencePaperSubtotal * 0.05;     //discount calculations based on amount of items
        }
        else if(conferencePaperUnit > 5){
            conferencePaperDiscount = conferencePaperSubtotal * 0.1;
        }
        subtotal = Journal_ArticleSubtotal + conferencePaperSubtotal + Thesis_ProjectSubtotal;   //calculate final price
        discount = Journal_ArticleDiscount + conferencePaperDiscount + Thesis_ProjectDiscount;
        finalTotal = subtotal - discount;


        //displays A list for the items
        System.out.println("---------YOUR FINAL REPORT-------------");
        System.out.println("Journal Article - " + Journal_ArticleCounter);
        System.out.println("Project paper/ Thesis - " + Thesis_ProjectCounter);
        System.out.println("Conference Paper - " + conferencePaperCounter);
        System.out.println("----------------------------------------------------");
        System.out.printf("Subtotal:  RM -%.2f%n ", subtotal);
        System.out.println("----------------------------------------------------");
        if(Journal_ArticleDiscount > 0){
            System.out.printf("Discount for Journal Article:  RM -%.2f%n ", Journal_ArticleDiscount);  //displaying discount for item if there is a discount if not it wont display
        }
        if(Thesis_ProjectDiscount > 0){
            System.out.printf("Discount for Project paper/ Thesis: RM -%.2f%n", Thesis_ProjectDiscount);  //displaying discount for item if there is a discount if not it wont display
        }
        if(conferencePaperDiscount > 0){
            System.out.printf("Discount for Conference Paper: RM -%.2f%n" , conferencePaperDiscount); //displaying discount for item if there is a discount if not it wont display
        }
        System.out.println("----------------------------------------------------");
        System.out.printf("YOUR TOTAL DISCOUNT: RM -%.2f%n", discount);      //printing out amounts
        System.out.printf("YOUR FINAL TOTAL: RM %.2f" , finalTotal); //display total
        System.out.println("----------------------------------------------------");
        
    sc.close(); //close scanner
    }
}