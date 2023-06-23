//recursion string
//method/function call it itself
public class Reverse_string 
{
	public static void main(String args[])
	{
		String s="SeenuSohel";
		System.out.println(recursiveString(s));
	}
	private static String recursiveString(String s)
	{
		if(s==null || s.length()<=1)
		{
			return s;
		}
		return recursiveString(s.substring(1)+s.charAt(0));
	}

}
