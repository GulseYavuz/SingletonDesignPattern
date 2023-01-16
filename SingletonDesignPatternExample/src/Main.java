public class Main {
    public static void main(String[] args) {

        Life myLife = Life.beBorn();
        myLife.hello();
        myLife=Life.beBorn();
        myLife.hello();

        Death myDeath = Death.beDie();
        myDeath.goodBye();
        myDeath = Death.beDie();
        myDeath.goodBye();


    }
}