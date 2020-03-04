/*
 * Writer: 		Charles Thomas
 * Class: 		Programming Languages
 * Assignment: 	Lab 4
 * Date:		2020_3_2
 */

public abstract class Num<AnyType> extends Number implements Comparable<AnyType> {
	@Override
	public float floatValue() {
		float f = 0;
		return f;
	}
	
	@Override
	public long longValue() {
		long l = 0;
		return l;
	}
	
	@Override
	public int intValue() {
		int i = 0;
		return i;
	}
	
	@Override
	public int compareTo(Object o) {
		compareTo(o);
		return 0;
	}
	
	public int compareTo(Num n) {
		double d1 = n.doubleValue();
		double d2 = this.doubleValue();
		int compare = -2;
		
		System.out.println("d1: " + d1 + "\nd2: " + d2);
		
		compare = (d1 == d2) ? 0 : 
			(d1 > d2) ? -1 : 1;
		
		return compare;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean equal = false;
		return equal;
	}
}