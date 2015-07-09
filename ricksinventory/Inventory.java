import java.util.*;

public class Inventory{
    private List guiters;
    
    public Inventory(){
        guiters = new LinkedList();
    }
    
    public void addGuiter(String serialNumber,double price,String builder,String model,String type,String backWood,String topWood){
        Guiter guiter = new Guiter(serialNumber,price,builder,model,type,backWood,topWood);
        guiters.add(guiter);
    }
    
    public Guiter getGuiter(String serialNumber){
        for(Iterator i = guiters.iterator();i.hasNext();){
            Guiter guiter = (Guiter)i.next();
            if(guiter.getSerialNumber().equals(serialNumber)){
                return guiter;
            }
        }
        return null;
    }
    
    public Guiter search(Guiter searchGuiter){
        for(Iterator i = guiters.iterator();i.hasNext();){
            Guiter guiter = (Guiter)i.next();
            
            String builder = searchGuiter.getBuilder();
            if(builder != null && !builder.equals("") && !builder.equals(guiter.getBuilder())){
                continue;
            }
            
            String model = searchGuiter.getModel();
            if(model != null && !model.equals("") && !model.equals(guiter.getModel())){
                continue;
            }
            
            String type = searchGuiter.getType();
            if(type != null && !type.equals("") && !type.equals(guiter.getType())){
                continue;
            }
            
            String backWood = searchGuiter.getBackWood();
            if(backWood != null && !backWood.equals("") && !backWood.equals(guiter.getBackWood())){
                continue;
            }
            
            String topWood = searchGuiter.getTopWood();
            if(topWood != null && !topWood.equals("") && !topWood.equals(guiter.getTopWood())){
                continue;
            }
            
            return guiter;
        }
        return null;
    }
}