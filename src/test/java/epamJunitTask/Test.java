package epamJunitTask;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
public class Test {

	App app;
	
	@BeforeEach
	void setUp() throws Exception {
		app = new App();
	}

	@Test
	void removeFromOneChar() {
		assertEquals( "",app.removeAChars("A"));
		assertEquals("B",app.removeAChars("B"));
	}

	@Test
	void removeFromTwoChars() {
		assertEquals( "",app.removeAChars("AA"));
		assertEquals("BB",app.removeAChars("BB"));
		assertEquals("B",app.removeAChars("AB"));
	}
	
	@Test
	void removeFromFourChars() {
		assertEquals( "BA",app.removeAChars("AABA"));
		assertEquals("BAB",app.removeAChars("ABAB"));
		assertEquals("AB",app.removeAChars("AAAB"));
	}
	
	@Test
	void removeFromNChars() {
		assertEquals( "CBAA",app.removeAChars("AACBAA"));
		assertEquals("BAB",app.removeAChars("AABAB"));
		assertEquals("BACAB",app.removeAChars("ABACAB"));
		assertEquals("CABAB",app.removeAChars("CAABAB"));
	}
}
