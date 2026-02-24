

public class Car {
    private double price;
    private int year;
    String brand, model;

    public Car(String cBRand, String cModel, double cPrice, int cYear){
        brand = cBRand;
        model = cModel;
        price = cPrice;
        year = cYear;

    }
    public Car(){
        brand = "";
        model = "";
        price = 0.0;
        year = 1900;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setPrice(double price){
        if(price >= 0)
            this.price = price;
        else 
            this.price = 0;
    }
    public double getPrice(){
        return price;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    
    
    public double calculatePrice(double insAmt){
        return price + insAmt;
    }
    public double calculateRebate(double insAmt, double rebate){
        return price - rebate;
    }
    private boolean isVintage(){
        return year < 2016;
    }
    public String getCarCategory(){
        return (isVintage())? "Vintage Car" : "Modern Car";
    }

@Override
public String toString(){
    return String.format("Car [Brand: %s, " + "Model: %s" + "Price: %.2f" + "Year: %d" + "Category: %s]", brand,model,price,year,getCarCategory());
}
}

