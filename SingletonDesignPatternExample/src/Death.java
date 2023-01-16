import java.util.Random;

public class Death {
    private static final Death myDeath = new Death();
    private int age = new Random().nextInt(20);

    private Death(){

    }
    public static Death beDie(){
            return myDeath;
        }
    public void goodBye(){
        System.out.println("Goodbye my life, My new age is in other worlds: " + age);
    }
}
