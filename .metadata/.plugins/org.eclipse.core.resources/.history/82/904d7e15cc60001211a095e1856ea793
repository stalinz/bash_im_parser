import static org.junit.Assert.*;

import org.junit.Test;

import quoter.BashParser;

public class BashParserTest {

	private static final String FIRST_QUOTE = "<Ares> ppdv, все юниксы очень дружелюбны.. они просто очень разборчивы в друзьях ;)";

	@Test
	public void testParseQuote() {
		String quote = BashParser.parseQuote(1);
		assertNotNull(quote);
		assertTrue(quote
				.equals(FIRST_QUOTE));
	}

}
