package S4.G1078.KOVACS_ERIK_ROBERT.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import S4.G1078.KOVACS_ERIK_ROBERT.sources.Platform;

public class TestTotalCost {
	
	private static final int platformNo = 1;
	private static final int noDays = 365;
	private static final int[] COSTS = {100, 250, 320, 1200, 85, 300};
	
	Platform platform;
	private ArrayList<Integer> piecesCosts;
	
	@Before
	public void setUp() throws Exception {
		platform = new Platform(platformNo, noDays);
		piecesCosts = new ArrayList<>();
		for(int cost : COSTS) {
			piecesCosts.add(cost);
		}
	}
	
	private int helperGetPiecesSum() {
		int sum = 0;
		for(int cost : COSTS) {
			sum += cost;
		}
		return sum;
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Category(Include.class)
	@Test
	public void testTotalCostCrossCheck() {
		platform.setPiecesCost(piecesCosts);
		final int sumActual = platform.totalCost();
		final int sumExpected = helperGetPiecesSum();
		assertEquals(sumExpected, sumActual);
	}

}
