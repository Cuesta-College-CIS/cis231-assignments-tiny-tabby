import java.util.Scanner;
public class Zylabs3_30 {

   public static void main(String []args){
    Scanner scnr = new Scanner(System.in);
      int x; 
      x = scnr.nextInt();
      int y; 
      y = scnr.nextInt();
      if( y >= -100 && x >= -100 && y <= 100 && x <= 100 ){
         
         if( y > 0 && x > 0 ){
            System.out.print(1);
         }
         else if( y > 0 && x < 0){
            System.out.print(2);
         }
         else if(y < 0 && x < 0){
            System.out.print(3);
         }
         else{
            System.out.print(4);
         }
      }
      else
      {
      System.out.print(0);
      }
      scnr.close();
   }
   

}
