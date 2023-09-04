package Doc_download;

import org.junit.Test;
import static org.junit.Assert.*;

public class FlagTest {

    @Test
    public void test() {
        Module2 test = new Module2();
        String output = test.flag("X");
        assertEquals("success", output);
    }

}
