import java.util.Arrays;
import java.util.Scanner;
public class Quiz2_2 {
    //What are the errors that make you spend some time and what are the lessons from errors.

//What are the topics of our textbook applied to this program?

//Can we return array? Do you think all values would be copied to caller function or send it as a reference?
//We can return an array.  If the reference is not changed, then the values will be changed.   

//When we send an array as parameter, it is received as a "reference" in a function.
//The argument and parameter are the same array, so in order to not change the original array, you must make a copy


//Can we return multiple values in a function? What do you think is the best way to return multiple items?
//Yes, you can return multiple values in a function.  The best way would be through an array or a string with the new values within it



public static int[] constructArray(Scanner scnr){

int [] res = new int[N]; //n is user input size of array 
    for( int i = 0; i < res.length; i++ ){
        res[i] = (int) Math.random() * 100; //scale from 0 - 99
    }
    return res;
   

}
public static void printArray(int[] vals){
    //print all elements in each array

    for( int i = 0; i < vals.length; i ++ )
    System.out.print( vals[i] + " ");
    

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
    if( cnt1 > cnt2 ){
        return 1;
    }
    else{
        return 2;
    }

}// end findMoreEvens



public static int findGreatest(int[] n1, int[] n2){
    //which array has the greatest number then return the array number
    int greatest1 = 0;
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

        if(greatest1 > greatest2){ // if greatest number is from n1
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
    //array1 has N random integer values 
    printArray(array1); //calling print method
    printArray(array2);

    int result = findMoreEvens(array1, array2);
    System.out.println("Array " + result + " has more even numbers");

    result = findGreatest(array1, array2);
    if(result == 1){
        System.out.prinln("The array " + result + " has the greatest value " + array1[array1.length - 1])//array at last element
        
    }
    else{
        System.out.println"The array " + result + " has the greatest value " + array2[array1.length - 1])
    }
    
scnr.close();

}