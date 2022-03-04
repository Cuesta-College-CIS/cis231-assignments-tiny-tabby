import java.util.Scanner; 

public class Lab423 {
   public static void main(String[] args) {
      
      
     
      
      Scanner sc = new Scanner(System.in);
      
      int sum = 0;
      int count = 0;
      int max;
      double avg = 0.0;
      int min;
      int current = 0;
      

      current = sc.nextInt();
      max = current;
      min = current;
     while(current >=0 && sc.hasNextInt()) { 
       
     //find max and min values
        if (current > max) {
            max = current;
			
            // sum += current;
            // count++;
			// Redundant code
        }
        else if( current < min){
            min = current;
			// Redundant code
            // sum += current;
            // count++;
        }

		 // No need else
        // else{
		sum += current;
		count++;
        // }
         current = sc.nextInt();   
     }
     
     if(count <= 2 ){
      sum = 0;
      avg = 0.0;
     }
     else{
        sum -= (max + min);
     count -= 2;
     avg = (double) sum / count; 
     
     }
     
      
     
     System.out.print(sum + " ");
     System.out.printf("%.2f\n", avg);
      
   }
}
