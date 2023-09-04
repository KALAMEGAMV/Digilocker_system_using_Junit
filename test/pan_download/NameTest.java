package pan_download;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class NameTest {
    
  

    @Test
    public void test() {
		Module3 test=new Module3();
		String output=test.name("");
		assertEquals("name is required",output);
	}
  
    
}
