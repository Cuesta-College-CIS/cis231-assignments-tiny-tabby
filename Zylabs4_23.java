import java.util.Scanner; 

public class Zylabs4_23 {
   public static void main(String[] args) {
      
      
      Scanner sc = new Scanner(System.in);
      
      int sum = 0;
      //int count = 0;
      int max;
      //int avg;
      int min;
      int current = 0;
      

      current = sc.nextInt();
      max = current;
      min = current;
     while(current >=0) { 
       
     //find max and min values
        if (current > max) {
            max = current;
            sum += current;
        }
        else if( current < min){
            min = current;
            sum += current;
        }
        else{
            sum += current;
        }
     current = sc.nextInt();   
     }
     sum -= (max + min);
     
      // Use the below line to print the result
      System.out.println(" " + sum);
      sc.close();
   }
}
