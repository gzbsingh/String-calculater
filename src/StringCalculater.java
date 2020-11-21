import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class StringCalculater {
	 StringHelperTest helperTest=new StringHelperTest();
	@Test
	public void Add()
	{
		
		assertEquals(3,helperTest.Addnumber("0,1,2"));
	
		
		
	}
     @Test
     public void AddUnamoutNumber()
     {
    
    	assertEquals(15,helperTest.AddUnamoutNumber("1,2,3,4,5"));
     }
     @Test void AddWithNewLinesString()
     {
   
    	 assertEquals(3,helperTest.AddwithNewLinesstring("1,2\n"));
    	 
     }
}
