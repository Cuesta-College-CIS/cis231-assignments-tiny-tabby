public class testing {
    public static void main(String[] args){
            int i = 1;
            while (i <=3){
                int j = 1;
                while (j <= i){
                    System.out.print("x");
                    ++j;
                }
                System.out.println();
                ++i;
                }
            


        //----------
        for(int row = 0; row < 2; row++){
            System.out.print("x");
            for(int col = 0; col < 3; col++){
                //
            }
        }


        for( i = 1; i <= 3; i++){
            int factorial = 1;
            factorial = factorial * i;
            System.out.print(factorial + " ");
        }

        //----
        int num = 10;
        while (num <= 15) {
           System.out.print(num + " ");
           if (num == 12) {
              break;
           }
           ++num; 
        } 
        System.out.print("Done");
       }
        //----

    }


