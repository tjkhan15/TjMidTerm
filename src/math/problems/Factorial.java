package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */
    public int factorial (int Number) {

        int fact =1;

        for (int i=Number;i>=1;i--)
        {
            fact =fact*i;
        }

        System.out.println("Factorial of "+ Number+ "! = "+fact);
        return fact ;
    }

}
