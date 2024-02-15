// exp_2.a
import java.util.Scanner; 
import java.io.*; 
class Binarys 
{ 
 	public static void main(String args[]) 
 	{ 
 		int c,first,last,middle,n,search,array[]; 
		boolean status=false; 
 		Scanner s=new Scanner(System.in); 
		System.out.println("Enter number of elements:"); 
 		n=s.nextInt(); 
 		array=new int[n]; 
 		System.out.println("Enter "+n+" integer:"); 
 		for(c=0;c<n;c++) 
 		array[c]=s.nextInt(); 
 		for (int i = 0; i<array.length; i++) 
 		{ 
 			for (int j = i + 1; j <array.length; j++) 
 			{ 
 				if (array[i] > array[j]) 
 				{ 
 					int temp = array[i]; 
 					array[i] = array[j]; 
 					array[j] = temp; 
 				} 
 			} 
 		} 
 		System.out.println("Enter value to find:"); 
 		search=s.nextInt(); 
 		first=0; 
 		last=n-1; 
 		middle=(first+last)/2; 
 		for(int i=0;i<n;i++) 
 		{ 
 			if(first<=last) 
 			{ 
 				if(array[middle]<search) 
 					first=middle+1; 
 				else if(array[middle]==search) 
 				{ 
 					status=true; 
 				} 
 				else 
 				{ 
 					last=middle-1; 
 				} 
 				middle=(first+last)/2; 
 			} 
 		} 
 		if(status==true) 
 		{ 
 			System.out.println(search+" found at location "+(middle+1)); 
 		} 
 		else 
 			System.out.println(search+" is not found in the list"); 
 	} 
}