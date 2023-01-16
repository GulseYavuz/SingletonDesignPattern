import java.util.Random;

public class Life {
    private static Life myLife = null;
    private int age = new Random().nextInt(20);

    private Life(){

    }
    public static Life beBorn(){
        if(myLife == null){
            myLife = new Life();
            return myLife;

        }else{
            return myLife;
        }
    }
    public void hello(){
        System.out.println("Hello My Life My Age Is: " + age);
    }
}
