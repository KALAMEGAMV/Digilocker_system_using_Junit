package pan_download;

import org.junit.Test;
import static org.junit.Assert.*;

public class PANTest {
    
   @Test
	public void test() {
		Module3 test = new Module3();
		String output=test.pan("PDA414LKJII");
		assertEquals("invalid PAN number",output);
	}
    
}
