
package Doc_download;

import org.junit.Test;
import static org.junit.Assert.*;

public class YearTest {
    	@Test
	public void test() {
		Module2 test=new Module2();
		String output=test.year("");
		assertEquals("year is required",output);
	}

    
}
