import java.util.Random;
public class AscendingOrder {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNum = rand.nextInt(101);
        int randomNum2 = rand.nextInt(101);
        int randomNum3 = rand.nextInt(101);
        System.out.println("The generated random order: " + randomNum + ", " + randomNum2 + ", " + randomNum3);
        if(randomNum > randomNum2 && randomNum > randomNum3)
        {
            System.out.print("The sorted order: " + randomNum + ", ");
            if( randomNum2 > randomNum3)
            {
                System.out.print(randomNum2 + ", " + randomNum3);
            }
            else
            {
                System.out.print(randomNum3 + ", " + randomNum2);
            }
        }

        else if(randomNum2 > randomNum) //if 1st number is not the largest
        {
            if(randomNum3 > randomNum2)//if 3rd is larger than 2nd
            {
                System.out.print("The sorted order: " + randomNum3 + ", ");
                if(randomNum2 > randomNum)
                {
                    System.out.print(randomNum2 + ", " + randomNum);
                }
                else{
                    System.out.print(randomNum + ", " + randomNum2);
                }

            }
            else //if 2nd number is larger than 3rd
            {
                System.out.print("The sorted order: " + randomNum2 + ", ");
                if(randomNum3 > randomNum)
                {
                    System.out.print(randomNum3 + ", " + randomNum);
                }
                else{
                    System.out.print(randomNum + ", " + randomNum3);
                }
                   
                
            }

        }
        

    }
    
}
