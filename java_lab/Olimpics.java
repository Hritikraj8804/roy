// exp_3.b
import java.util.Scanner; 
class Sports_person 
{ 
 	int height=164; 
 	int weight=62; 
 	Sports_person() 
 	{ 
 		System.out.print("Enter name of the country:"); 
 		Scanner sc=new Scanner(System.in); 
 		String country=sc.nextLine(); 
 		System.out.println("Height of the sports person is:"+height+"CM"); 
 		System.out.println("Weight of the sports person is:"+weight+"KG"); 
		System.out.println("He/She belongs to the country:"+country); 
 
 	} 
} 
class Olimpics 
{ 
 	public static void main(String args[]) 
 	{ 
 		Sports_person sp = new Sports_person(); 
 	} 
}