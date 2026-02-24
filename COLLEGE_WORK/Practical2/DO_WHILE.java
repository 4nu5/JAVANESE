
import java.util.Scanner;

public class DO_WHILE{
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        do { 
                System.out.println("HELLO WELCOME TO OUT STORE");
                System.out.println("(1.) CAR PERFURME");
                System.out.println("(2.) CAR PHONE HOLDER");
                System.out.println("(3.) CAR MAT 3pcs");
                System.out.println("(4.) EXIT");
                choice = sc.nextInt();

                
        switch (choice) {
            case 1:
                System.out.println("U");
                
            break;

            case 2:
                System.out.println("K");    
            break;

            case 3:
                System.out.println("R");    
            break;

            case 4:
                System.out.println("L");    
            break;

            default:
                System.out.println("WHY ARE YOU LIKE THIS");
        }

        while (choice < 1 || choice > 4){
             if (choice < 1 || choice > 4)
                System.out.println("INVALID INPUT");
                choice = sc.nextInt();
         }
        } while (choice != 4); 
    }
}