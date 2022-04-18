public class testing {


    public static void printName(String name, int id) {
        System.out.print(name + " ID: " + id);
     }
     public static void printName(int id) {
        System.out.print("Name" + " ID: " + id);
     }
     public static void printName(String name, int id, int age) {
        System.out.print(name + " ID: " + id + " age: " + age);
     }

     public static void changeRainfall(double [] dailyRain) {
        dailyRain[0] = 0.1;
     }

     public static void swapValues(int x, int y) {
        int tmp;
        tmp = x;
        x = y;
        y = tmp;
     }  

     
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

        printName("Juan", 429, 19);

       
             
       
            double [] rainValues = new double[2];
            rainValues[0] = 2.9;
            rainValues[1] = 1.3;
            changeRainfall(rainValues);
            System.out.println(rainValues[0]);

            
            
                int p = 4, q = 3;
                swapValues(p, q);
                System.out.print("p = " + p + ", q = " + q);
             
         
       }
        //----
       



    }


