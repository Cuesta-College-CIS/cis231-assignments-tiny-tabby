import java.util.Scanner;

public class Zylabs5_21 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int N1 = scnr.nextInt(); //first array length 
		int[] num1 = new int[N1];
		for (int i = 0; i < N1; i++){
			num1[i] = scnr.nextInt();
        }
        
        int[] copy1 = new int[N1];
        copy1 = num1;//make copy of array

		int N2 = scnr.nextInt();// second array length
		int[] num2 = new int[N2];
		for (int i = 0; i < N2; i++){
			num2[i] = scnr.nextInt();
        }
  
        int[] copy2 = new int[N2];
        copy2 = num2; //make copy of each array
        int counter = 0;
        int[] shuffle = new int[N1 + N2];
            for(int i = 0 ; i < N1; i ++ ){
                shuffle[ counter ] = copy1[i];
                counter += 2;
            }
            counter = 1;
            for(int i = 1 ; i < N2; i++){
                shuffle[ counter ] = copy2[i - 1];
                counter += 2;
            }
            if(N1 < N2){//if the second array still has more numbers after it, 
                for(int i = 0; i <N2 - N1; i ++){
                    shuffle[shuffle.length - (N2 - N1)] = copy2[N1 + i];
                }
            }
           
        
        for (int j : shuffle){
        System.out.print(j + " ");
        }
        scnr.close();
    }
}