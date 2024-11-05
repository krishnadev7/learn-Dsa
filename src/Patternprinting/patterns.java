package Patternprinting;

public class patterns {
    public static void main(String[] args) {
        pattern17(5);
    }
    static  void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        pattern 1 output
            *****
            *****
            *****
            *****
            *****
    */

    static  void pattern2(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    pattern 2 output
            *
            **
            ***
            ****
            *****
    */

    static  void pattern3(int n){
        for(int row = n; row >= 1; row--){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     pattern 3 output
            *****
            ****
            ***
            **
            *
    */

    static  void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /*
     pattern 4 output
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
    */

    static  void pattern5(int n){
        for(int row = 0; row <= 2 * n; row++){
            int totalColsInRow = row > n ? 2 * n - row  : row;
            for(int col = 0; col <= totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* pattern 5 output

             *
             * *
             * * *
             * * * *
             * * * * *
             * * * *
             * * *
             * *
             *

     */

    static void pattern6(int n){
        for(int row = 1; row <= n; row++){
            int noOfSpace = n - row;

            for(int s = 1; s <= noOfSpace; s++){
                 System.out.print(" ");
            }

            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* pattern 6 output

        *
       **
      ***
     ****
    *****

     */

    static void pattern7(int n){
        for(int row = n; row >= 1; row--){
            int noOfSpace = n - row;

            for(int s = 1; s <= noOfSpace; s++){
                System.out.print(" ");
            }

            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* pattern 7 output

     *****
     ****
     ***
     **
     *

     */

    static void pattern8(int n){
        for(int row = 1; row <= n; row++){
            int noOfSpace = n - row;
            int noOfStars = 2 * row - 1;

            for(int s = 1; s <= noOfSpace; s++){
                System.out.print(" ");
            }

            for(int col = 1; col <= noOfStars; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* pattern 8 output

              *
             ***
            *****
           *******
          *********

     */

    static void pattern9(int n){
        for(int row = n; row >= 1; row--){
            int noOfSpace = n - row;
            int noOfStars = 2 * row - 1;

            for(int s = 1; s <= noOfSpace; s++){
                System.out.print(" ");
            }

            for(int col = 1; col <= noOfStars; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* pattern 9 output

        *********
         *******
          *****
           ***
            *

     */

    static void pattern10(int n){
        for(int row = 1; row <= n; row++){
            int noOfSpace = n - row;

            for(int s = 1; s <= noOfSpace; s++){
                System.out.print(" ");
            }

            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* pattern 10 output

              *
             * *
            * * *
           * * * *
          * * * * *

     */

    static void pattern11(int n){
        for(int row = n; row >= 1; row--){
            int noOfSpace = n - row;

            for(int s = 1; s <= noOfSpace; s++){
                System.out.print(" ");
            }

            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* pattern 11 output

          * * * * *
           * * * *
            * * *
             * *
              *

     */

    static  void pattern12(int n){
        // top half
        for(int row = n; row >= 1; row--){
            int noOfSpace = n - row;

            for(int s = 1; s <= noOfSpace; s++){
                System.out.print(" ");
            }

            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // print the bottom half
        for(int row = 1; row <= n; row++){
            int noOfSpace = n - row;

            for(int s = 1; s <= noOfSpace; s++){
                System.out.print(" ");
            }

            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* pattern 12 output

        * * * * *
         * * * *
          * * *
           * *
            *
            *
           * *
          * * *
         * * * *
        * * * * *

     */

    static void pattern17(int n){
        for(int row = 1; row <= 2*n; row++){
            int totalNoOfcols = row > n ? 2 * n - row : row;
            // no of spaces
            for(int s = 1; s <= n-totalNoOfcols; s++){
                System.out.print(" ");
            }
            for(int col = totalNoOfcols; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= totalNoOfcols; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    /*
        pattern 17 output
                 1
                212
               32123
              4321234
               32123
                212
                 1
    */

    static  void pattern28(int n){
        for(int row = 0; row <= 2 *n; row++){
            int totalColsInrow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInrow;

            for(int space = 0; space < noOfSpaces; space++){
                System.out.print(" ");
            }
            for(int col = 0; col <= totalColsInrow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        pattern 28 output
                 *
                * *
               * * *
              * * * *
             * * * * *
              * * * *
               * * *
                * *
                 *
    */

    static void pattern30(int n){
        for(int row = 1; row <= n; row++){
            // no of spaces
            for(int s = 1; s <= n-row; s++){
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    /*
        pattern 28 output
                1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5
    */
}
