/**
 * 
 */
package cas.lab6.wt;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author zoening
 *
 */
public class MoneyTestAdd {
	
	private Money f12CAD;
    private Money f14CAD;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		f12CAD = new Money(12, "CAD");
		f14CAD = new Money(14, "CAD");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link cas.lab6.wt.Money#add(cas.lab6.wt.Money)}.
	 */
	@Test
	public void testAdd() {
		Money expected= new Money(26, "CAD"); 
		Money result= f12CAD.add(f14CAD);
		assertTrue(expected.equals(result));
		// fail("Not yet implemented");
	}

}
