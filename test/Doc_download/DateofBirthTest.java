package Doc_download;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateofBirthTest {
    @Test
	public void test() {
		Module2 test=new Module2();
		String output=test.dob("");
		assertEquals("DOB is required",output);
	}


}
