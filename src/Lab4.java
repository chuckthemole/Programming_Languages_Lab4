import java.awt.List;
import java.util.Collections;
import java.util.LinkedList;

/*
 * Writer: 		Charles Thomas
 * Class: 		Programming Languages
 * Assignment: 	Lab 4
 * Date:		2020_3_2
 */

/*
 * public class Lab4 tests the classes Fraction, MixedNumber, and Num
 */
public class Lab4 {
    public static void main(String[] args) {
    	
    	//Create Fractions
    	Fraction f1 = new Fraction(3, 5);
    	Fraction f2 = new Fraction(6, 5);
    	String f1String = f1.toString();
    	String f2String = f2.toString();
    	System.out.println("\n****************************************************\n");
    	System.out.println("Fraction " + f1String + " doubleValue() " + f1.doubleValue());
    	
    	//Create MixedNumbers
    	MixedNumber m1 = new MixedNumber(1, 4, 5);
    	MixedNumber m2 = new MixedNumber(0, 3, 5);
    	String m1String = m1.toString();
    	String m2String = m2.toString();
    	System.out.println("MixedNumber (" + m1String + ") doubleValue() " + m1.doubleValue());
    	
    	//Compare Tests
    	System.out.println("\n****************************************************\n");
    	System.out.println("Compare m1 (" + m1String + ") to m2 (" + m2String + 
    			"). The return value from m1.compareTo(m2) = " + m1.compareTo(m2));
    	System.out.println("Compare m1 (" + m1String + ") to f2 (" + f2String + 
    			"). The return value from m1.compareTo(f2) = " + m1.compareTo(f2));
    	System.out.println("Compare f1 (" + f1String + ") to m2 (" + m2String + 
    			"). The return value from f1.compareTo(m2) = " + f1.compareTo(m2));
    	System.out.println("Compare f1 (" + f1String + ") to f2 (" + f2String + 
    			"). The return value from f1.compareTo(f2) = " + f1.compareTo(f2));
    	
    	//Equals Tests
    	System.out.println("\n****************************************************\n");
    	System.out.println("Equal? m1 (" + m1String + ") to m2 (" + m2String + 
    			"). The return value from m1.equals(m2) = " + m1.equals(m2));
    	System.out.println("Equal? f1 (" + f1String + ") to f2 (" + f2String + 
    			"). The return value from f1.equals(f2) = " + f1.equals(f2));  	
    	System.out.println("Equal? f1 (" + f1String + ") to m2 (" + m2String + 
    			"). The return value from f1.equals(m2) = " + f1.equals(m2));
    	System.out.println("Equal? m1 (" + m1String + ") to f2 (" + f2String + 
    			"). The return value from m1.equals(f2) = " + m1.equals(f2));
    	
    	//List of Num test
    	LinkedList<Num> listNum = new LinkedList();
    	Fraction f3 = new Fraction(-3, 2);
    	MixedNumber m3 = new MixedNumber(10, 3, 4);
    	listNum.add(f1);
    	listNum.add(m3);
    	listNum.add(m2);
    	listNum.add(m1);
    	listNum.add(f3);
    	listNum.add(f2);
    	System.out.println("\n****************************************************\n");
    	System.out.println("Unsorted list: " + listNum);
    	Collections.sort(listNum);
    	System.out.println("Sorted list: " + listNum);
    	
    	//Q5 code
    	Integer i = 1;
    	Integer j = new Integer(1);
    	System.out.println("\n****************************************************\n");
    	System.out.println("Integer equals test: i.equals(j) = " + i.equals(j));
    	
    	Double k = 4.2;
    	Double l = 5.0;
    	System.out.println("Double equals test: k.equals(l) = " + k.equals(l));
    	System.out.println("\n****************************************************\n");
    }
}

/*
  Output:
  
****************************************************

Fraction 3/5 doubleValue() 0.6
MixedNumber (1 4/5) doubleValue() 1.8

****************************************************

Compare m1 (1 4/5) to m2 (0 3/5). The return value from m1.compareTo(m2) = 1
Compare m1 (1 4/5) to f2 (6/5). The return value from m1.compareTo(f2) = 1
Compare f1 (3/5) to m2 (0 3/5). The return value from f1.compareTo(m2) = 0
Compare f1 (3/5) to f2 (6/5). The return value from f1.compareTo(f2) = -1

****************************************************

Equal? m1 (1 4/5) to m2 (0 3/5). The return value from m1.equals(m2) = false
Equal? f1 (3/5) to f2 (6/5). The return value from f1.equals(f2) = false
Equal? f1 (3/5) to m2 (0 3/5). The return value from f1.equals(m2) = true
Equal? m1 (1 4/5) to f2 (6/5). The return value from m1.equals(f2) = false

****************************************************

Unsorted list: [3/5, 10 3/4, 0 3/5, 1 4/5, -3/2, 6/5]
Sorted list: [-3/2, 3/5, 0 3/5, 6/5, 1 4/5, 10 3/4]

****************************************************

Integer equals test: i.equals(j) = true
Double equals test: k.equals(l) = false

****************************************************
*/
