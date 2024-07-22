public class StarPattern{
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        */

        for(int line = 1; line <= 4; line++){
            for(int star = 1; star <= line; star++){
                System.out.print("* ");
            }
            System.out.println("");
        }


        System.out.println(" \n");

        /*
        * * * *
        * * *
        * *
        *
        */
        int n = 4;
        for(int line = 1; line <= n; line++){
            for(int star = 1; star <= n - line + 1 ; star++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println(" \n");

        /* 
         * * * *
           * * *
             * *
               * 
         */

         for(int line = 1; line <= 4; line++){
            for(int star = 4; star >= line; star--){
                System.out.print("* ");
            }
            System.out.println("\n");
            for(int space = 1; space <= line; space++){
                System.out.print("  ");
            }
         }

        /*
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *
        */


        // for(int line = 1; line <= 4; line++){
        //     for(int leftStar = 4; leftStar >= line; leftStar--){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" \n");
        //     for(int rightStar = 4; rightStar >= line; rightStar--){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" \n");
        // }


        System.out.println(" \n");
        /*
          1
          1 2
          1 2 3
          1 2 3 4
          1 2 3 4 5
         */

        int m = 5;
        for(int line = 1; line <= m; line++){
            for(int number = 1; number <= line; number++){
                System.out.print(number);
            }
            System.out.println("");
        }

        System.out.println(" \n");
        /*
          A
          B C
          D E F
          G H I J
          K L M N O
         */
        int number = 5;
        char ch = 'A';
        for(int line = 1; line <= number; line++){
            for(int character = 1; character <= line; character++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}