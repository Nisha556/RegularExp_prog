package Nio;
import java.util.regex.*;
public class RegExpr4 {
public static void main(String args[])
{
	Pattern pat= Pattern.compile("W+");
	Matcher mat = pat.matcher("W WW HII ");
	while
		(mat.find())
		System.out.println("Match :" +mat.group());
}
}
