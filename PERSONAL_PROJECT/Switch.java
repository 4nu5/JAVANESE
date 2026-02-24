import java.util.*;


public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans;
       
       do{
        System.out.println("HEllow");
        System.out.println("Enter The switch case");
         ans = sc.nextInt();
           
        switch(ans){
            case 1:
                System.out.println("TESTER 1");
                break;
            case 2:
                System.out.println("1672633");
                break;
            case 3:
                System.out.println("yes");
            }
       }while(ans != 0);
    sc.close();
    }
}
