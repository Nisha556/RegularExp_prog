package Nio;
import java.util.regex.*;

public class RegexMatches {
public static void main(String args[])
{
	String line = "this order was placed for QT3000! OK?";
	String pattern = "(.*)(//d+)(.*)";
	Pattern r = Pattern.compile(pattern);
	Matcher m = r.matcher(line);
	if(m.find( ))
	{
		System.out.println("Found " + m.group(0));
		System.out.println("Found" + m.group(1));
		System.out.println("Found" + m.group(2));
		
		
	}
	else {
		System.out.println("NO MATCH");
		
	}
	
}
}
