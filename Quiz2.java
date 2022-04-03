//import java.util.Arrays;
//import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		//Scanner scnr = new Scanner(System.in);
		//final int L = 3; // will NOT use L. Just for the extendability.
		//final int M = 3;
		//final int N = 2;
		int[][] matrix1 = { 
                { 2, 5, 10 },
				{ 3, 6, 9 },
				{ 1, 2, 3 } };
		int[][] matrix2 = { 
                { 10, 20 },
				{ 30, 40 },
				{ 50, 60 } };
		//int rowidx = scnr.nextInt();//row input
            //row of matrix1[rowidx][all of the columns]
            //times matrix2[all of the row][all of the col]
            //go col first in matrix2
            //row static all cols matrix 1




		// Your code

        int j;
            
                for(int k = 0; k < 2; k++){
                    for(int i = 0; i < 3; i++){
                    
                        System.out.print(matrix2[i][k]);
                    }
                }
            
            //scnr.close();

    
        
        

	}

}