package Nio;
import java.util.regex.*;
public class RegExpr8 {
public static void main(String args[])
{
	String str = "Jon Jonathan Frank Todd";
	Pattern pat = Pattern.compile("Jon.*?");
	Matcher mat = pat.matcher(str);
	System.out.println("Original sequence : " + str);
	str = mat.replaceAll("Eric");
	System.out.println("Modified equence :" +str);
}
}
