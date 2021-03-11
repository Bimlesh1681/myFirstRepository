package Programs;

public class StringReversal {

	public static void main(String[] args) {
		
		stringRev("Bimlesh");
		
		String str = "Suchitha";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str);
		
		String reverse = sb.reverse().toString();
		
		System.out.println(reverse);

	}
	
	public static void stringRev(String str)
	{
		char[] cstr = str.toCharArray();
		
		for(int i=cstr.length-1;i>=0;i--)
		{
			System.out.print(cstr[i]);
		}
	}

}
