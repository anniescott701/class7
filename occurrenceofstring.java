import java.util.Scanner;
public class occurrenceofstring {
	public static void main(String[] args)
	{
		String i;
		String j;
		Scanner a=new Scanner(System.in);
		System.out.println("enter the string:");
		i=a.nextLine();
		System.out.println("enter next String:");
		j=a.nextLine();
		
		if(j.contains(i))
		{
		System.out.println("yes it contains");
}
		else
		{
			System.out.println("doesnot contain");
		}
}
}