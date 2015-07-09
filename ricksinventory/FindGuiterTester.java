public class FindGuiterTester{
    public static void main(String... args){
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        
        Guiter whatErinLikes = new Guiter("",0,"Fender","Stratocastor","electric","Alder","Alder");
        
        Guiter guiter = inventory.search(whatErinLikes);
        if(guiter != null){
            System.out.println("Erin, you might like this "+ guiter.getBuilder() + " "+guiter.getModel()+ " "+
                               guiter.getType()+" guiter:\n"+ guiter.getBackWood()+" back and sides,\n"+
                               guiter.getTopWood()+" top.\nYou can have it for only $"+guiter.getPrice()+"!");
        }else{
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }
    
    private static void initializeInventory(Inventory inventory){
        inventory.addGuiter("V95693",1499.95,"Fender","Stratocastor","electric","Alder","Alder");
    }
}