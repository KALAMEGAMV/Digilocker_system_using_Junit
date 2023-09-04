package Doc_download;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonthTest {

    @Test
    public void test() {
        Module2 test = new Module2();
        String output = test.month("JHK");
        assertEquals("invalid month", output);
    }

}
