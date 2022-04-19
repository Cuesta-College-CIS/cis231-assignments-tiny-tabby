
import java.util.Scanner;
public class Quiz_2 {
    

    //What are the errors that make you spend some time and what are the lessons from errors.

    //first try I have a java.util.inputmismatchexeption, I think it is from the parameter scanner in constructarray
    // i changed the parameter to ints and it works now, after I finished the program and did scanner as a parameter again it works.
    // i did not put parenthesis around math.random() * 100, which made all of the values in the array 0's
    //there is an issue with finding th greatest value, if the index goes past 3, it becomes very inaccurate, 
    //turns out it was because I did not have my printing statements in the right order in the main method, and since we used
    //the same variable result for both findMoreEvens and findGreatest, it messed with the values.
    //Tested some more and it was still inaccurate and found that I put array1 twice so if array 2 was larger than array1,
    //then the supposedly last integer could only go up to array1.length


//What are the topics of our textbook applied to this program?

//The topics of our textbook applied to this program are parameters, specifically arrays and how they are sent as references
//and not copies and also Scanner elements.  
//these user defined methods help with repetetive code and readability, like making two arrays with random ints
//with just one method.
//Also, since the array is sent as a reference, we changed the last element in the array to the max 
//so we can get the max value and which array has the max


//Can we return array? Do you think all values would be copied to caller function or send it as a reference?
//We can return an array.  If the reference is not changed, then the values will be changed.   


//When we send an array as parameter, it is received as a "reference" in a function.
//The argument and parameter are the same array, so in order to not change the original array, you must make a copy


//Can we return multiple values in a function? What do you think is the best way to return multiple items?
//Yes, you can return multiple values in a function.  The best way would be through an array or a string with the new values within it



public static int[] constructArray(Scanner scnr){
   
    int n = scnr.nextInt();
    if( n <= 0){
        System.out.println( "out of bounds");
        
    }
    
int [] res = new int[n]; //n is user input size of array 
    for( int i = 0; i < res.length; i++ ){
        res[i] = (int)( Math.random() * 100); //scale from 0 - 99
    }
    return res; //return array


}
public static void printArray(int[] vals){
    //print all elements in each array

    for( int i = 0; i < vals.length; i ++ )
    System.out.print( vals[i] + " ");
    System.out.println();
    

}
public static int findMoreEvens(int[] n1, int[] n2){
    //compare two array elements and then figure out which array has more even numbers,
    //return the one with more evens

    //keep track of how many evens
    int cnt1 = 0;
    int cnt2 = 0;
    
    for( int i = 0; i < n1.length; i ++){
        if( n1[i] % 2 == 0 ){ // find even, increase cnt
            cnt1 ++;
        }
    }

    for(int i = 0; i < n2.length; i ++){
        if( n2[i] % 2 == 0 ){
            cnt2 ++;
        }
    }
    if( cnt1 > cnt2 ){//if array1 has more evens than array2
        return 1;
    }
    else if (cnt1 < cnt2){
        return 2;
    }
    else{ //return this if they have the same amount of ints
        return -1;
    }

}// end findMoreEvens



public static int findGreatest(int[] n1, int[] n2){
    //which array has the greatest number then return the array number
    int greatest1 = 0; //keep track of greatest in each array
    int greatest2 = 0;

    for( int i = 0; i < n1.length; i ++){ //find greatest number in n1
        if( n1[i] > greatest1 ){
            greatest1 = n1[i]; 
        }
    }
    for(int i = 0; i < n2.length; i ++){ //find greatest number in n2
        if( n2[i] > greatest2 ){
            greatest2 = n2[i];
        }
    }

    n1[n1.length - 1] = greatest1; // setting last value to the greatest so we can reference it later
    n2[n2.length - 1] = greatest2;



        if(greatest1 > greatest2){ // if greatest number is from n1 array...
            return 1;
        }
        else{
            return 2;
        }
    

    

}// end findGreatest

public static void main( String []args){
    
    Scanner scnr = new Scanner(System.in);
    int [] array1, array2;

    array1 = constructArray(scnr);
    array2 = constructArray(scnr);
    //testing if both numbers are same, if one is greater, if one is less
    //(5 9) (10 10) (10 4)
    //assuming if inputs > 0 and are ints

    //array1 has N random integer values 
    printArray(array1); //calling print method
    printArray(array2);

    int result = findMoreEvens(array1, array2);//calling findMoreEvens
    if( result != 0){ // if the arrays do not have the same amount of even numbers...
    System.out.println("Array " + result + " has more even numbers");
    }
    else{
        System.out.println(" Both arrays have the same amount of even numbers");
    }
//------------
     result = findGreatest(array1, array2); //calling findgreatest

    if(result == 1){ //if method returns 1 (representing the first array)
        System.out.println("The array " + result + " has the greatest value " + array1[array1.length - 1]);//array at last element
        
    }
    else if( result == 2){
        System.out.println("The array " + result + " has the greatest value " + array2[array2.length - 1]);
    }
    
    
scnr.close();

}
// test data
/* 3 3
 5 48 62
9 21 38
Array 1 has more even numbers
The array 1 has the greatest value 62

10 5
49 24 95 30 46 51 93 62 41 85 
78 55 24 67 57
Array 1 has more even numbers
The array 1 has the greatest value 95

4 8
47 44 8 84
66 92 60 3 71 81 65 3
Array -1 has more even numbers
The array 2 has the greatest value 92

0 -1
out of bounds
out of bounds
Exception in thread "main" java.lang.NegativeArraySizeException: -1
        at Quiz_2.constructArray(Quiz_2.java:49)
        at Quiz_2.main(Quiz_2.java:138)

-5 -1
out of bounds
Exception in thread "main" java.lang.NegativeArraySizeException: -5
        at Quiz_2.constructArray(Quiz_2.java:49)
        at Quiz_2.main(Quiz_2.java:137)



*/
}
