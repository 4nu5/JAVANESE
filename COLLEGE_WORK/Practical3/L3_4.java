


import java.util.Scanner;



public class L3_4 {
    public static void main(String[] args) {
        int[] numTyres = {2,3,5,8};
        int[] answer;
        
        Scanner sc = new Scanner(System.in);

        double[] price = new double[5];

        price[0] = 25500;
        price[1] = 35000;
        price[2] = 45500;
        price[3] = 55500;
        price[4] = 65500;

        char grade[] = {'A','B','C','D','E','A'};
        boolean status[] = new boolean[3];
        status[0]=status[1]=status[2]= true;
        System.out.println("Size: ");
        int size = sc.nextInt();
        for(int i = 0; i<size; i++){
            System.out.println("ENTER VALUES: ");
            answer = new int[size];
            answer[i] = sc.nextInt();
            
        }
        
    }
}
