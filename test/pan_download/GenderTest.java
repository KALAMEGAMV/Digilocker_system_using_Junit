
package pan_download;

import org.junit.Test;
import static org.junit.Assert.*;

public class GenderTest {
	@Test
	public void test() {
		Module3 test = new Module3();
		String output=test.gender("");
		assertEquals("gender is required",output);
	}

}
