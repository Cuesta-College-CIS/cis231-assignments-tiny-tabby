import java.util.Arrays;
import java.util.Scanner;
public class Quiz1 {
    public static void main(String[] args) {
		final int CNT = 5;
		int minval, minidx, tmp;

		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt(); //array length
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++)
			numbers[i] = scnr.nextInt();

		// Your codeS
        tmp = 0;
        minidx = 0;
        int i = 0;
        int l = 0;

        //find min value
        for( i = 0; i < CNT; i++){
    
            minval = numbers[i + 1]; // reset min
            for ( l = i; l < N; l++){ //find min but start at the right value 
                if(numbers[l] <= minval){
                    minidx = l;
                    minval = numbers[l];
                    
                    
                }//end if
            }//end for 

            //swap
            tmp = numbers[i];
                numbers[i] = numbers[minidx];
                numbers[minidx] = tmp;
              
            //print
            for(int j = 0; j < N; j++){
                System.out.print(numbers[j] + " ");
            }
                System.out.println();
            
        }
//10 20 35 25 10 15 40 55 50 0 45
//10 0 5 10 15 20 25 30 35 40 45
//10 45 40 35 30 25 20 15 10 5 0
		scnr.close();
	}
    
}
/*This program will take 10 user inputs and construct an integer array
Input begins with the number of elements 10 followed by 10 integer values
10 20 35 25 10 15 40 55 50 0 45
Swap the smallest value and the 1st array element
Swap the 2nd smallest value and 2nd array element
Swap the 3nd smallest value and 3rd array element
Swap the 4nd smallest value and 4th array element
Swap the 5nd smallest value and 5th array element
All other values have to keep the original place
*/
