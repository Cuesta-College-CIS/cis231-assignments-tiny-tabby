
import java.util.Scanner;


public class Zylabs6_26 {
   
//method
  public static void swapValues(int[] values){
   
    //swap 
        
    int temp = 0;
    for(int j = 0; j < 3; j+=2){
        temp = values[j];
        values[j] = values[j + 1];
        values[j + 1] = temp;
    }
    for(int k = 0; k < 4; k++){
    System.out.print(values[k] + " ");
    System.out.println();
    }
  }
   
   public static void main(String[] args) {

    Scanner scnr = new Scanner(System.in);
    int[] array = new int[4];
    for(int i = 0; i < 4; i++){
        array[i] = scnr.nextInt();
    }
        swapValues(array);
   
        scnr.close();
       

    
   }

}
