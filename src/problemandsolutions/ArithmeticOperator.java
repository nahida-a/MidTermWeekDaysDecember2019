package problemandsolutions;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.

        public static void main(String[] args) {
            double num1;
            double num2;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter First Number- ");
            num1=sc.nextDouble();
            System.out.print("Enter Sceond Number- ");
            num2=sc.nextDouble();
            System.out.println("Summation- "+(num1+num2));
            System.out.println("Subtraction- "+(num1-num2));
            System.out.println("Multification- "+(num1*num2));
            System.out.printf("Division- %.3f  ",(num1/num2));

        }
}


