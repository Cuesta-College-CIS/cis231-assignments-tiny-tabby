import java.util.Scanner;

public class Zylabs6_30 {
   
   public static int fibonacci(int n) {
      if( n >= 0){
         int total = 0;
         int prev = 0;
         int next = 1;
         //0, 1, 1, 2, 3, 5, 8, 13
         for(int i = 1; i < n; i ++){
            
            total = ( prev + (next));
            prev = next;
            next = total;
            
            
            
         }
            return total;
         }
         else{
          return -1;  
         }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
      scnr.close();
   }
}