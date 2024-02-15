// exp_2.b
import java.util.Scanner; 
public class Bubblesort 
{ 
	public static void main(String[] args) 
 	{ 
 		Scanner s=new Scanner(System.in); 
 		System.out.println("enter the size of the array:"); 
 		int size=s.nextInt(); 
 		System.out.println("enter the values into the array:"); 
 		int arr[]=new int[size]; 
 		for(int i=0;i<size;i++) 
 		{ 
 			arr[i]=s.nextInt(); 
 		} 
 		sorting(arr); 
 	} 
 	public static void sorting(int arr[]) 
 	{ 
 		int n=arr.length; 
 		int temp=0; 
 		for(int i=0;i<n;i++) 
 		{ 
 			for(int j=1;j<(n-i);j++) 
 			{ 
 				if(arr[j-1]>arr[j]) 
 				{ 
 					temp=arr[j-1]; 
 					arr[j-1]=arr[j]; 
 					arr[j]=temp; 
 				} 
 			} 
 		} 
 		System.out.println("the sorted arraty is:"); 
 		for(int i=0;i<arr.length;i++) 
 		{ 
 			System.out.print(arr[i]+"\t"); 
 		} 
 	} 
} 