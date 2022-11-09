import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlotTestStudent {

	private Plot p1, p2;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Plot(1, 3, 5, 7);
		p2 = new Plot(2, 4, 6, 8);
	}
	
	@After
	public void tearDown() throws Exception {
		p1 = p2 = null;
	}
	
	@Test
	public void testOverLaps() {
		assertTrue(p2.overlaps(p1));
	}
	
	public void testToString() {
		assertEquals("1, 2, 5, 7", p2.toString());
	}

}
