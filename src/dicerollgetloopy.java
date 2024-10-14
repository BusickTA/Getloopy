import java.util.Random;
public class dicerollgetloopy {
    public static void main(String[] args) {

        Random rand = new Random();

        int die1=0;
        int die2=1;
        int die3=2;
        int counter=0;


        System.out.println("Roll Die1   Die2   Die3   Sum");
        System.out.println("______________________________");

        while (!(die1 == die2 && die2 == die3)){
            counter++;
            die1=rand.nextInt(1,7);
            die2=rand.nextInt(1,7);
            die3=rand.nextInt(1,7);
            int sum =die1+die2+die3;
            System.out.println(counter + "     "+ die1 + "      "+ die2 + "      "+ die3 + "     "+ sum);
        }
    }
}