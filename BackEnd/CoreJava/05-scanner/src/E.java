import java.util.Scanner;
class E
{
	public static void main(String[] args) 
	{
		System.out.println("Are you in the class?");
		Scanner sc = new Scanner(System.in);
		boolean status = sc.nextBoolean();
		if(status)
		{
			System.out.println("Good");
		}
		else
		{
			System.out.println("Focus");
		}

	}
}
//next() - reads the complete token in the form of a String
//token - a single character or a group of characters without any space.
// Streams - input ,output,error