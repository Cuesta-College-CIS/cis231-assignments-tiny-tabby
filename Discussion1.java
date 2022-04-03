

import java.util.Scanner;
public class Discussion1 {
    public static void main( String []args){
        Scanner scnr = new Scanner(System.in);
		int row = scnr.nextInt();
		int col = scnr.nextInt();

        int[][] numbers = new int[row][col];
		
		int i = 0;
 		int j = 0;
 		for (i = 0; i < numbers.length; i++){
         for (j = 0; j < numbers[i].length; j++){
            numbers[i][j] = scnr.nextInt();
         }
      }
      
      int rowTotal = 0;
      int rowmax = 0;
      int rowmin = 0;
      int rowminidx = 0;
      int rowmaxidx = 0;
      
      
      for (  i = 0; i < row; i++) {
        rowTotal = 0;
      
       for (  j = 0; j < col; j++) {
               rowTotal += numbers[i][j];
       }
       if ((i == 0) || (rowmin > rowTotal)) {
               rowmin = rowTotal;
               rowminidx = i;
       }
       if ((i == 0) || (rowmax < rowTotal)) {
               rowmax = rowTotal;
               rowmaxidx = i;
       
       }
      
      }
      int colTotal = 0;
      int colmax = 0;
      int colmin = 0;
      int colminidx = 0;
      int colmaxidx = 0;
      
       for ( j = 0; j < col; j++) {
         colTotal = 0;
         for (  i = 0; i < row; i++) {
               colTotal += numbers[i][j];
         }
       if ((j == 0) || (colmin > colTotal)) {
               colmin = colTotal;
               colminidx = j;
       }
       if ((j == 0) || (colmax < colTotal)) {
               colmax = colTotal;
               colmaxidx = j;
       
       }
      }
    
      




      for(j = 0; j < col; j ++){
      System.out.print(numbers[rowminidx][j]);
      }
      System.out.println();
      for(j = 0; j < col; j ++){
        System.out.print(numbers[rowmaxidx][j]);
        }
        System.out.println();
        for( i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i][colminidx]);
        }
            
        System.out.println();
            for(i = 0; i < row; i ++){
                System.out.print(numbers[i][colmaxidx]);
                }
      
    
            
      


      }

    }
      	
      
      
 
    
            
      
      // Your Code
      
    

    
