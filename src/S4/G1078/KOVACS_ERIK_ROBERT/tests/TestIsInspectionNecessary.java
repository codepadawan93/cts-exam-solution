package S4.G1078.KOVACS_ERIK_ROBERT.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import S4.G1078.KOVACS_ERIK_ROBERT.sources.Platform;

public class TestIsInspectionNecessary {
	
	private static final int platformNo = 1;
	private static final int noDays = 365;
	Platform platform;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Category(Include.class)
	@Test
	public void testRightExactlyOneYear() {
		platform = new Platform(platformNo, noDays);
		assertFalse(platform.isInspectionNecessary());
	}
	
	@Test
	public void testRightMoreDaysThanOneYear() {
		final int moreDays = noDays + 1;
		platform = new Platform(platformNo, moreDays);
		assertTrue(platform.isInspectionNecessary());
	}
	

}
