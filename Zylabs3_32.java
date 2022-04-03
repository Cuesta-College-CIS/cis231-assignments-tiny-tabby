import java.util.Scanner;
public class Zylabs3_32 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String email = scnr.nextLine();
        //boolean valid = false;
        char firstChar = email.charAt(0);
        int idx = email.indexOf("@"); //find @ symbol 

         String end = email.substring(idx, email.length() -1);

        if( end.contains(".") && email.length() - 1 > 5 && email.length() - 1 < 30 && Character.isDigit(firstChar)== false){
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }

           
        scnr.close();
        
        }
    }