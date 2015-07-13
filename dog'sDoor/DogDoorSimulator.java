public class DogDoorSimulator{
    public static void main(String... args){
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);
        
        // Simulate the hardware hearing a bark
        System.out.println("Fido barks to go outside...");
        recognizer.recognize("Woof");
        System.out.println("\nFido has gone outside...");
        //remote.pressButton();
        System.out.println("\nFido's all done...");
        //remote.pressButton();
        
        try{
            Thread.currentThread().sleep(10000);
        }catch(InterruptedException e){
        }
        
        System.out.println("...but he's stuck outside!");
        System.out.println("\nFido starts barking...");        
        recognizer.recognize("Woof");
        
        System.out.println("\nFido's back inside...");
        //remote.pressButton();
    }
}