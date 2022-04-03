import java.util.Arrays;
import java.util.Scanner;
public class Quiz22 {
    


	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//final int row1 = 3; // will NOT use L. Just for the extendability.
		//final int row2 = 3;
		//final int col2 = 2;
		int[][] matrix1 = { 
                { 2, 5, 10 },
				{ 3, 6, 9 },
				{ 1, 2, 3 } };
		int[][] matrix2 = { 
                { 10, 20 },
				{ 30, 40 },
				{ 50, 60 } };
		int rowidx = scnr.nextInt();//row input
            //row of matrix1[rowidx][all of the columns]
            //times matrix2[all of the row][all of the col]
            //go col first in matrix2
            //row static all cols matrix 1




		// Your code

            int total = 0;
            int total2 = 0;
            
                for(int c = 0; c < matrix2[0].length; c++){//cols first then rows
                    for(int r = 0; r < matrix2.length; r++){
                
                       if( c ==0 ){ //if in the first column ( of matrix 2 )
                           total += matrix2[r][c] * matrix1 [rowidx][r]; 
                           
                        }
                       else{ 
                           total2 += matrix2[r][c] * matrix1[rowidx][r];
                        }
                    }
                    
                
            }
            System.out.print(total + " " + total2);
            scnr.close();

    
        
        

	}

}

