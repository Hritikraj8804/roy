// exp_2.d
import java.util.Scanner; 
import java.lang.*; 
class stringbuffer 
{ 
 	public static void main(String args[]) 
 	{ 
 		Scanner s=new Scanner(System.in); 
 		System.out.println("enter a string you like:"); 
 		String str=s.nextLine(); 
 		StringBuffer b=new StringBuffer(str); 
 		System.out.println("enter the index you want to delete from:"); 
 		int i1=s.nextInt(); 
 		System.out.println("to:"); 
 		int i2=s.nextInt(); 
		b.delete(i1,i2); 
 		System.out.println("after deletion the new buffer is:"+b); 
 	} 
}