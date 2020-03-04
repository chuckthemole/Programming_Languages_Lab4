import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class tests {
	private Fraction f1;
	private Fraction f2;
	private MixedNumber m1;
	private MixedNumber m2;
	
	@Before
	public void setUp() throws Exception {
		f1 = new Fraction(1, 2);
		f2 = new Fraction(12, 4);
		m1 = new MixedNumber(0, 1, 2);
		m2 = new MixedNumber(10, 3, 6);
	}
	
	@Test
	public void testCompareTo() {
		int compareTest1 = f1.compareTo(f2); //f1 < f2
		int compareTest2 = f1.compareTo(m1); //f1 = m1
		int compareTest3 = m1.compareTo(m2); //m1 < m2
		int compareTest4 = m2.compareTo(f2); //m2 > f2
		assertNotNull(compareTest1);
		assertNotNull(compareTest2);
		assertNotNull(compareTest3);
		assertNotNull(compareTest4);
		assertEquals(0, compareTest1);
		//assertEquals(0, compareTest2);
		//assertEquals(-1, compareTest3);
		//assertEquals(1, compareTest4);
		
		System.out.println(compareTest1);
		//assertNull(f2.compareTo(f2));
	}
}
