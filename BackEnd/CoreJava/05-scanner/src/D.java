import java.util.Scanner;
class D
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your CGPA");
		Scanner sc = new Scanner(System.in);
		double cgpa= sc.nextDouble();
		System.out.println("CGPA is: " + cgpa);
	}
}
//next() - reads the complete token in the form of a String
//token - a single character or a group of characters without any space.
// Streams - input ,output,error