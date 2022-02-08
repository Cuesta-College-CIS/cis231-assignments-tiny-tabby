
import java.util.Random;
//finds the greatest number out of 3 integers.
public class GreatestNumber{
    public static void main (String[] args){
        
        Random rand = new Random();

        int randomNum = rand.nextInt(101);
        int randomNum2 = rand.nextInt(101);
        int randomNum3 = rand.nextInt(101);

        System.out.println(randomNum + ", " + randomNum2 + ", " + randomNum3);
    
        
        int greatestNum = 0;
        if ( randomNum > randomNum2 && randomNum > randomNum3){
             greatestNum = randomNum;
        }
        else{
            greatestNum = randomNum2;

            if (randomNum3 > randomNum2){
                greatestNum = randomNum3;
            }
            else{
                greatestNum = randomNum2;
            }
        }
        
        System.out.println("The greatest number is " + greatestNum);
    }
}