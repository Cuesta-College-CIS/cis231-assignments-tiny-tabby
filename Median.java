//find the median value amond the n integer values
import java.util.Scanner;
public class Median {
    //put array in order
    //input is the array size which is an odd number
    public static void main( String[] args){

    Scanner scnr = new Scanner(System.in);
		int n = scnr.nextInt();

    //fill array with random numbers 0 - 99 and print
    
    int numbers[] = new int[n];
    System.out.println("Unsorted array:");
    for( int i = 0; i < n; i ++){
      numbers[i] = (int) (Math.random() * 100); 
      System.out.print(numbers[i]+ " ");
    }

    /*
    if we showed the sorted array:
    System.out.println("\nSorted array:");

    //now put the array in order from least to greatest
    Arrays.sort(numbers);

    //printing out the sorted array
    for( int i = 0; i < n; i ++){
      System.out.print(numbers[i] + " ");

    }
    //find the median value
    //it is in the direct middle of the array, so if divide by two by an int, it will be truncated to give the middle
    */
    int medianidx = n/2;
    System.out.println( "\nThe median value of the array:" + numbers[medianidx]);
    

    scnr.close();
}

//test data:

/*
input- 
5

output-
Unsorted array:
19 60 45 46 49
The median value of the array:46
--------------------------------------

input-
11

output-
Unsorted array:
79 2 91 83 99 82 83 98 12 73 77
The median value of the array:82
--------------------------------------

input-
1

output-
Unsorted array:
3
The median value of the array:3

*/




}