import java.util.Scanner;
public class Zylabs3_31 {
   public static void main( String[] args){
      
    Scanner scnr = new Scanner(System.in);
      int grade = scnr.nextInt();
      String gradeRange;
      switch (grade) {
         case 'a':
         
         case 'A': 
         gradeRange = "The score range is 90 ~ 100";
            break;
            
          case 'b':
         case 'B': 
         gradeRange = "The score range is 90 ~ 100";
            break;
            
       case 'c':

         case 'C': 
         gradeRange = "The score range is 90 ~ 100";
            break;
            
       case 'd':

         case 'D': 
         gradeRange = "The score range is 90 ~ 100";
            break;
            
            case 'f':

         case 'F': 
         gradeRange = "The score range is 90 ~ 100";
            break;
            
            default:
            gradeRange = "Invalid input.";
               break;
      
      }
      System.out.print(gradeRange);
      scnr.close();
   }
}
      
      
      
      
      



