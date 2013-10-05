package test_komplex;
import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestKomplex {
	private Komplex k;
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testToString() {
		k=new Komplex(4,2);
		String expecteds="4+2i";
		String actuals=k.toString();
		assertEquals(expecteds, actuals);
	}

	@Test
	public final void testKomplexDoubleDouble() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testKomplexDouble() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testKomplex() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetRe() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetRe() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetIm() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetIm() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSumKomplex() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSumDouble() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDifKomplex() {
		
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDifDouble() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testPlusKomplexKomplex() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testPlusKomplexDouble() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testPlusDoubleKomplex() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testMinusKomplexKomplex() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testMinusKomplexDouble() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testMinusDoubleKomplex() {
		fail("Not yet implemented"); // TODO
	}

}
