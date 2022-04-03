import java.util.Scanner;
// import java.util.Arrays;

public class Zylabs5_26 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int N = scnr.nextInt();
		int M = scnr.nextInt();
		int[][] numbers = new int[N][M];
		int cnt = 0;

		try {
			for (int i = 0; i < numbers.length; i++)
				for (int j = 0; j < numbers[i].length; j++)
					numbers[i][j] = scnr.nextInt();
		} catch (Exception e) {
			System.err.println("Input Error");
			e.printStackTrace();
		}
		 //for (int i = 0; i < numbers.length; i++)
		 //System.out.println(Arrays.toString(numbers[i]));
         //3 3 0 1 0 1 1 1 0 1 0

         //if(numbers[i - 1][j] == 1 && numbers[i + 1][j] == 1 && numbers[i][j - 1] == 1 &&  numbers[i ][j + 1] == 1 ){
   //every up(i-1, j), down(i+1, j, left(i,j-1) and right(i,j+1)
      for (int i = 1; i < N; i++)

	  
				for (int j = 1; j < M; j++)
				
					if( numbers[i][j] == 1 ){
                         
                              if(numbers[i - 1][j] == 1  && numbers[i][j - 1] == 1) { //up and left are one
								
									  if ( i + 1 < N && j + 1 < M ){ //make sure not out of bounds
										if(numbers[i + 1][j] == 1  && numbers[i][j + 1] == 1) { //rest are okay
											cnt++;
									  }
								  }
									

                              }
							
                          
					}

		System.out.println(cnt);
		scnr.close();
	}

}

