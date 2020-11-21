import java.util.Arrays;
import java.util.stream.Stream;

public class StringHelperTest {

	public int Addnumber(String numbers)
	{int sum=0;
	if(numbers==null)return 0;
		      String[] ch=numbers.split(",");
	         
	        	  sum=Integer.parseInt(ch[0])+sum;
	        	  sum=Integer.parseInt(ch[1])+sum;
	        	  sum=Integer.parseInt(ch[2])+sum;
	        	  System.out.println(sum);
	       
	
		return sum;

		
	}
	public int AddUnamoutNumber(String numbers)
	{
		Stream<String> value=Arrays.stream(numbers.split(","));
		return value.mapToInt(Integer::parseInt).sum();
	}
	
	public int AddwithNewLinesstring (String string)
	{
	
		Stream<String> value=Arrays.stream(string.split(",|\n"));
		return value.mapToInt(Integer::parseInt).sum();
	
		
		
	}

}
