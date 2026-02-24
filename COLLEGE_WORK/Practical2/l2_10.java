import java.util.*;



public class l2_10 {
    public static void main(String[] args) {
        
        double price = genPrice();
        showCarName("Honda");
        showMessage();
        int roadtax = genRoadTax(600);
        System.out.println("PRICE = " + price);
        System.out.println("ROAD TAX = " + roadtax);

    }

    public static void showMessage(){
        System.out.println("GET A 2nd HAND CAR");
    }
    public static void showCarName(String car){
        System.out.println(car + "is available");
    }
     public static double genPrice(){
        
        Random r = new Random();
        int num = r.nextInt(5) + 1;

        if(num == 1) return 90000;
        else if(num == 2) return 120000;
        else if(num == 3) return 9000;
        else return 1200;
     }
     public static int genRoadTax(int cc){
        return (cc >= 90)?20:90;
     }
}
