package math.problems;

public class MakePyramid {
    public static void main(String[] args) {
            int n = 5;
            printPyramid(n);
        }

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
            for (int i=0; i<n; i++)
            {

                for (int j=n-i; j>1; j--)
                {
                    System.out.print(" ");
                }


                for (int j=0; j<=i; j++ )
                {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }


    }


