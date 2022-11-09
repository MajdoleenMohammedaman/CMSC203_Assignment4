import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyTestStudent {

	private Property p1;
	
	@BeforeEach
	public void setUp() throws Exception {
		p1 = new Property("ABC", "Silver Spring", 234.00, "Place");
	}
	
	@AfterEach
	public void tearDown() throws Exception {
		p1 = null;
	}
	
	@Test
	public void testGetPropertyName() {
		assertEquals("ABC", p1.getPropertyName());
	}
	
	@Test
	public void testGetRentAmount() {
		assertEquals(234.00, p1.getRentAmount());
	}
	
	@Test
	public void testGetPlot() {
		assertEquals(0, p1.getPlot().getX());
		assertEquals(0, p1.getPlot().getY());
		assertEquals(1, p1.getPlot().getWidth());
		assertEquals(1, p1.getPlot().getDepth());
	}
	
	@Test
	public void testToString() {
		assertEquals("ABC, Silver Spring, Place, 234.00",p1.toString());
	}

}
