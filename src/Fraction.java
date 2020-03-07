/*
 * Writer: 		Charles Thomas
 * Class: 		Programming Languages
 * Assignment: 	Lab 4
 * Date:		2020_3_2
 */

import java.util.Scanner;

public class Fraction extends Num {
	private int numerator;
	private int denominator;
	
	/*
	 * Constructor
	 * int n is numerator
	 * int d is denominator
	 * creates a Fraction
	 */
    public Fraction(int n, int d) {
        int gcd;
        Scanner s;

	    //denominator cannot be 0
        if (d == 0) {
            System.out.print("\n0 is not acceptable for " +
                    "denominator!");
            do {
                System.out.print("\nEnter denominator: ");
                s = new Scanner(System.in);
                d = s.nextInt();
                if (d == 0) {
                    System.out.print("0 is not " +
                            "acceptable for " +
                            " denominator!");
                }
            } while (d == 0);
        }
        
        //reduce fraction
        gcd = gcdRecur(n, d);
        n /= gcd;
        d /= gcd;
        numerator = (d < 0) ? -n : n;
        denominator = (d < 0) ? -d : d;
    }
	
    //Finds the Greatest Common Divisor between two numbers
    public static int gcdRecur(int arg1, int arg2) {
        if (arg1 % arg2 == 0)
            return arg2;
        else
            return gcdRecur(arg2, arg1 % arg2);
    }
    
	@Override
	public double doubleValue() {
		double d_num = numerator;
		double d_denom = denominator;
		return (d_num / d_denom);
	}

	@Override
	public String toString() {	
		String s = numerator + "/" + denominator;
		return s;
	}

}
