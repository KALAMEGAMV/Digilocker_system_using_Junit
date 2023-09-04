package Doc_download;

import org.junit.Test;
import static org.junit.Assert.*;

public class RollnoTest {

    @Test
    public void test() {
        Module2 test = new Module2();
        String output = test.rollno("9093459");
        assertEquals("invalid roll number", output);
    }

}
