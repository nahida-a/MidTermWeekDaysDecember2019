package math.problems;


public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=sc.nextInt();
        System.out.println("Factroial Recursion");
        System.out.println("Factroial of "+number+ " is "+factRc(number));
        fact(num);


    }
    public static int fact(int n){
        int i,factor=1;
        System.out.println("Factroial Iteration");
        for(i=1;i<=n;i++){
            factor=factor*i;
        }
        System.out.println("Factroial of "+n+ " is "+factor);
        return fac;
    }


    public static int factRc(int x){
        int factor;
        if(x==1){
            return 1;
        }
        factor=factRc(x-1)*n;
        return factor;
    }
}
    }
}
