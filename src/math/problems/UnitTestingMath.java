package math.problems;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        Assert.assertEquals(Factorial.fact(0),120);
        System.out.println("Factorial fact");
        Assert.assertEquals(Factorial.factRc(0),120);
        System.out.println("Factorial factRc\n");
        int [] arrayT={1,3,4,5,6,7,8};
        Assert.assertEquals(arrayT());
        System.out.println("\nAssert");

    }
}
