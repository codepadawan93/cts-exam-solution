package S4.G1078.KOVACS_ERIK_ROBERT.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import S4.G1078.KOVACS_ERIK_ROBERT.sources.Platform;

public class TestSetNoDays {
	
	private static final int platformNo = 1;
	private static final int noDays = 365;
	Platform platform;
	
	@Before
	public void setUp() throws Exception {
		platform = new Platform(platformNo, noDays);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Category(Include.class)
	@Test(expected = DurationException.class)
	public void testSetNoDaysThrowsException() throws DurationException {
		// Negative one year should be great
		platform.setNoDays(-1 * noDays);
	}
	
	@Test
	public void testSetNoDaysBoundaryUpper() throws DurationException {
		platform.setNoDays(noDays + 1);
		assertTrue(platform.isInspectionNecessary());
	}
	
	@Test
	public void testSetNoDaysBoundaryLower() throws DurationException {
		platform.setNoDays(1);
		assertFalse(platform.isInspectionNecessary());
	}

}
