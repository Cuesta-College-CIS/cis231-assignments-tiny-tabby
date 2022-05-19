import java.util.Scanner;
import java.util.Arrays;
public class Subsequence {
    public static void main(String[] args){
        //input: n(pos integer, number of elements in the array)
        //output: 3 integers(consecutive 3 numbers in an array)

        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();

        int numbers[] = new int[n];

    for( int i = 0; i < n; i ++){
      numbers[i] = (int) (Math.random() * 100); 
      System.out.print(numbers[i]+ " ");
    }
    System.out.println();
    //all ints are already positive
    //going through all numbers
    int max = 0;
    int maxidx = 0;
    for( int i = 0; i < n - 2; i ++){
        int current = (numbers[i] + numbers[i + 1] + numbers[i + 2]);
        if( current > max ){
            maxidx = i;
            max = current; 
        }
    }
    //print out the subsequence
    System.out.println(numbers[maxidx] + " " + numbers[maxidx + 1] + " " + numbers[ maxidx + 2]);

    scnr.close();
    }

}
/*
test data: 

input- 5
output-
9 89 67 77 49 
89 67 77
----------------------
input- 12
ouput-
15 73 72 37 7 36 73 62 53 78 62 4 
62 53 78
----------------------
input- 3
output-
44 28 13 
44 28 13

*/