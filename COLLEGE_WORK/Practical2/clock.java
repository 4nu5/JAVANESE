


import java.text.DecimalFormat;

public class clock {
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("00"); //2 DECIMAL PLACE
        for(int h = 9; h <= 13; h++){
            for(int m = 0; m <= 60; m++){
                System.out.println(df.format(h) + ":" + df.format(m));
            }
        }
        DecimalFormat df1 = new DecimalFormat("#.0000"); // 4 DECIMAL PLACES
        System.out.println(df1.format(5.99));

        DecimalFormat df2 = new DecimalFormat("#,##.00");
        System.out.println(df2.format(540000.4));
    }
}   
