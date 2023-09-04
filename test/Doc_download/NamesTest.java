package Doc_download;

import org.junit.Test;
import static org.junit.Assert.*;

public class NamesTest {
    @Test
	public void test() {
		Module2 test=new Module2();
		String output=test.name("");
		assertEquals("name is required",output);
	}
}
