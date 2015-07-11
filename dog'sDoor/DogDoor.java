public class DogDoor{
    private boolean open;
    
    public DogDoor(){
        System.out.println(open);
        this.open = false;
        System.out.println(open);
    }
    
    public void open(){
        System.out.println("The dog door opens.");
        open = true;
    }
    public void close(){
        System.out.println("The dog door closes.");        
        open = false;
    }
    public boolean isOpen(){
        return open;
    }
}