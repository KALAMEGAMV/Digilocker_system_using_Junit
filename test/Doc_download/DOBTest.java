package Doc_download;

import org.junit.Test;
import static org.junit.Assert.*;

public class DOBTest {

    @Test
    public void test() {
        Module2 test = new Module2();
        String output = test.dob("1-03-2002");
        assertEquals("invalid DOB", output);
    }

}
