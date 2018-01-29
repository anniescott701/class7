
public class removevowels {
	public static void main(String[] args)
	{
		String b;
		String a=new String("annie");
		b=a.replaceAll("[aeiou]", "");
		System.out.println("After removing vowels from string:"+b);
	}

}
