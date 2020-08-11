package Nio;
import java.util.regex.*;
public class RegExpr3 {
public static void  main(String args[])
{
	Pattern pat = Pattern.compile("test");
	System.out.println(pat);
	Matcher mat =pat.matcher("test 1 2 3 test");
	System.out.println(mat);
	while(mat.find())
	{
		System.out.println("test found at index" + mat.start());
	}
}
}
