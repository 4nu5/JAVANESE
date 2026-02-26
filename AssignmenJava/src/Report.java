public class Report {
    private static int totalOders = 0;
    private static double totalPackageRevenue = 0;
    private static double totalCustomRevenue = 0;
    private static double totalWrappingFees = 0;
    private static double totalDeliveryFees = 0;
    private static double totalTax = 0;
    private static  double grandTotalBusiness= 0;

    public static void addToPackageRevenue(double amount){
        totalPackageRevenue += amount;
    }
    public static double getTotalPackageRevenue(){
        return totalPackageRevenue;
    }
    public static void addToCustomRevenue(double amount){
        totalCustomRevenue += amount;
    }
    public static double getTotalCustomRevenue(){
        return totalCustomRevenue;
    }
    public static void addToWrappinFees(double amount){
        totalWrappingFees += amount;
    }
    public static double getTotalWrappingFees(){
        return totalWrappingFees;
    }
    public static void addToDeliveryFees(double amount){
        totalDeliveryFees += amount;
    }
    public static double getTotalDeliveryFees(){
        return totalDeliveryFees;
    }
    public static void addToTax(double amount){
        totalTax += amount;
    }
    public static double getTotalTax(){
        return totalTax;
    }
    public static void addToGrandTotal(double amount){
        grandTotalBusiness += amount;
    }
    public static double getGrandTotal(){
        return grandTotalBusiness;
    }
    public static void addToTotalOrders(int amount){
        totalOders = amount;
    }
    public static double getTotalOrders(){
        return totalOders;
    }

   
    //change all to printf
    public static void displayInfo(){
        System.out.println("Package: " + totalPackageRevenue);
        System.out.println("Custom: " + totalCustomRevenue);
        System.out.println("Delivery: " + totalDeliveryFees);
        System.out.printf("Tax: %.2f \n", totalTax);
        System.out.println("Grand Total: " + grandTotalBusiness);
        System.out.println("Total Orders: " + totalOders);

    }
}   
