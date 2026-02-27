
import java.util.Scanner;



public class test {
    public static void main(String[] args) {
        char answer = ' ';

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        

        while(!(answer == 'p' || answer == 'j' || answer == 'w')){
            System.out.println("Enter: ");
        answer = sc.nextLine().charAt(0);
        }
    }    
}
