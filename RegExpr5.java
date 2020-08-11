package Nio;
import java.util.regex.*;
public class RegExpr5 {
public static void main(String args[])
{
	Pattern pat = Pattern.compile("e.");
	Matcher mat  = pat.matcher("HII my name  is  edureka bano");
	while(mat.find())
		System.out.println("MAtch : " +mat.group());
	
	
}
}
