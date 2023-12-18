import java.util.Scanner;
class B
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your full name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Welcome: " + name);
	}
}
//next() - reads the complete token in the form of a String
//token - a single character or a group of characters without any space.
// Streams - input ,output,error