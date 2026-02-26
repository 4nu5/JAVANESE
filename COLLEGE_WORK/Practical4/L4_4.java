
import java.util.Scanner;




public class L4_4 {
    public static void main(String[] args) {
        double[][] price = new double[2][3];
        price[0][0] = 100000;
        price[0][1] = 10000;
        price[0][2] = 1000;
        price[1][0] = 100;
        price[1][1] = 19000;
        price[1][2] = 102210;


        int[][] milage = {{300,500,800,1200,1500}, {150,280,520,690}};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < price.length; i++) {
            System.out.printf("Car #%d Price Info: \n", (i+1));
            for (int j = 0; j < price[i].length; j++) {
                System.out.printf("Year #%d: ", j);
                price[i][j] = sc.nextDouble();
            }

            double sum = 0;
            int count = 0;
            for(double[] priceRow: price){
                for(double priceCol: priceRow){
                    sum += priceCol;
                    count++;
                }
            }
            System.err.printf("\nTotal:  %.2f\n Average: %.2f\n", sum, sum/count);
        }
            

            int max,min;
            max=min=milage[0][0];
            for (int i = 0; i < milage.length; i++) {
            for (int j = 0; j < milage[i].length; j++) {
                if(milage[i][j] > max)
                    max=milage[i][j];
                if(milage[i][j] < min);
                min = milage[i][j];
                    }
            }
            System.out.printf("\nMin Milage: %d\nMax Milage: %d", min,max);    
            int[][] cc = {{1000,1500},{1300,1300},{1800,1500}}; 
            compareCar(cc);       
     }
     public static void compareCar(int[][] cc){
        for(int i = 0; i < cc.length; i++){
            if(cc[i][0] > cc[i][1])
                System.out.println("First Car is more Powerful");
            else if(cc[i][0] < cc[i][1])
                System.out.println("Second Car is more Powerful");
            else 
                System.out.println("Both Cars are the same power");
        }
     }
}


