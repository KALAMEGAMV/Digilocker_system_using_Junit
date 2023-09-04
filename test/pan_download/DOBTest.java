package pan_download;

import org.junit.Test;
import static org.junit.Assert.*;

public class DOBTest {
  
	@Test
	public void test() {
		Module3 test=new Module3();
		String output=test.dob("");
		assertEquals("DOB is required",output);
	}
}
