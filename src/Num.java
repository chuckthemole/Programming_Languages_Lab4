/*
 * Writer: 		Charles Thomas
 * Class: 		Programming Languages
 * Assignment: 	Lab 4
 * Date:		2020_3_2
 */

public abstract class Num extends Number implements Comparable<Num> {
	@Override
	public float floatValue() {
		return (float) this.doubleValue();
	}
	
	@Override
	public long longValue() {
		return (long) this.doubleValue();
	}
	
	@Override
	public int intValue() {
		return (int) this.doubleValue();
	}
	
	@Override
	public int compareTo(Num n) {
		double d1 = n.doubleValue();
		double d2 = this.doubleValue();
		int compare = -2;

		compare = (d1 == d2) ? 0 : 
			(d1 > d2) ? -1 : 1;
		
		return compare;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean equal = false;
		Num n = (Num) o;
		
		if (this.compareTo(n) == 0) 
			equal = true;
		
		return equal;
	}
}