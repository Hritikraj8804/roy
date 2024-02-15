import java.util.Scanner;

class BikerRace
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		float r1, r2, r3, r4, r5, average;
		System.out.println("Enter the speed of r1, r2, r3, r4 and racers: ");
		r1 = s.nextFloat();
		r2 = s.nextFloat();
		r3 = s.nextFloat();
		r4 = s.nextFloat();
		r5 = s.nextFloat();
		average = (r1+r2+r3+r4+r5)/5;
		System.out.println("Averge speed of the all 5 racers : " + average);
		System.out.println("Qualified racers are : ");
		if(r1 > average)
		System.out.println("R1 is qualified.");
		if(r1 >= average)
		System.out.println("R1 is qualified.");
		if(r2 >= average)
		System.out.println("R2 is qualified.");
		if(r3 >= average)
		System.out.println("R3 is qualified.");
		if(r4 >= average)
		System.out.println("R4 is qualified.");
		if(r5 >= average)
		System.out.println("R5 is qualified.");
	}
}
