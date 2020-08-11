package Nio;
import java.util.regex.*;
public class RegExpr {
public static void main(String agrgs[])
{
	Pattern pat;
	Matcher mat;
	boolean found;
	pat = Pattern.compile("Java");
	mat = pat.matcher("Java");
	found = mat.matches();
	System.out.println("Testing Java agains Java");
	if(found)
		System.out.println("Matches");
	else
		System.out.println("No Matches");
	System.out.println();
	System.out.println("Testing Java against Java SE 6")
	;
	mat = pat.matcher("Java SE 6");
	found = mat.matches();
	if(found)
		System.out.println("No match");
	
	
	
	
	
}
}
