/*
 * Writer: 		Charles Thomas
 * Class: 		Programming Languages
 * Assignment: 	Lab 4
 * Date:		2020_3_2
 */

public class Lab4 {
    public static void main(String[] args) {
    	
    	Fraction f = new Fraction(3, 5);
    	Fraction e = new Fraction(6, 5);
    	String s = f.toString();
    	System.out.println(s + " " + f.doubleValue());
    	MixedNumber m = new MixedNumber(1, 2, 4);
    	MixedNumber n = new MixedNumber(1, 4, 5);
    	s = m.toString();
    	System.out.println(s + " " + m.doubleValue());
    	
    	
    	System.out.println("compare: " + m.compareTo(n));
    }
}
