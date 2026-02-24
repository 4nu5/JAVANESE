import java.util.Scanner;
    public static void main(String[] args) {
        
        int i;
        i = 0;

        while(++i < 4)
            System.out.println("TESTER1" + i);

        i = 0;
        while(i++ < 4){
            saybye();
        i++;
        }
        int result = addnum(i, i);
        System.out.print("THE SUM IS: " + result);

    }

public static void saybye(){
    System.out.println("BYEBYEBYE");
}

public static int addnum(int no1, int no2){
   
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER FIRST Number");
   no1 = sc.nextInt();
   System.out.println("ENTER SECOND number");
   no2 = sc.nextInt();
   sc.close();
   
   
    int sum = no1 + no2;
    return sum;
}
