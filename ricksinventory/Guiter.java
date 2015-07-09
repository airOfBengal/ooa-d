public class Guiter{
    private String serialNumber,builder,model,type,backWood,topWood;
    private double price;
    
    public Guiter(String serialNumber,double price,String builder,String model,String type,String backWood,String topWood){
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    public String getSerialNumber(){
        return serialNumber;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    public String getBuilder(){
        return builder;
    }
    public String getModel(){
        return model;
    }
    public String getType(){
        return type;
    }
    public String getBackWood(){
        return backWood;
    }
    public String getTopWood(){
        return topWood;
    }
}