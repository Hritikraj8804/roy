// exp_2.c
import java.util.Scanner; 
class merge 
{ 
 	public static void main(String args[]) 
 	{ 
 		Scanner s=new Scanner(System.in); 
 		System.out.println("enter size of the array:"); 
 		int size=s.nextInt(); 
 		int arr[]=new int[size]; 
 		System.out.println("enter elements into the array:"); 
 		for(int i=0;i<size;i++) 
 		{ 
 			arr[i]=s.nextInt(); 
 		} 
 		int start=0; 
 		int end=size-1; 
 		sort(arr,start,end); 
		System.out.println("the sorted array is:"); 
 		for(int j=0;j<size;j++) 
 		{ 
 			System.out.print(arr[j]+"\t"); 
 		} 
 	} 
 	public static void sort(int arr[],int start,int end) 
 	{ 
 		if(start<end) 
 		{ 
 			int middle=(start+end)/2; 
 			sort(arr,start,middle); 
 			sort(arr,middle+1,end); 
 			merge(arr,start,middle,end); 
 		} 
 	} 
 	public static void merge(int arr[],int start,int middle,int end) 
 	{ 
 		int n1 = middle -start + 1; 
 		int n2 = end - middle; 
 		int L[] = new int [n1]; 
 		int R[] = new int [n2]; 
 		for (int i=0; i<n1; ++i) 
 		{ 
 			L[i] = arr[start + i]; 
 		} 
 		for (int j=0; j<n2; ++j) 
 		{ 
 			R[j] = arr[middle + 1+ j]; 
 		} 
 		int i = 0, j = 0; 
 		int k = start; 
 		while (i< n1 && j < n2) 
 		{ 
 			if (L[i] <= R[j]) 
 			{ 
 				arr[k] = L[i]; 
 				i++; 
 			} 
 			else 
 			{ 
 				arr[k] = R[j]; 
 				j++; 
 			} 
 			k++; 
 		} 
 		while (i< n1) 
 		{ 
 			arr[k] = L[i]; 
 			i++; 
 			k++; 
 		} 
 		while (j < n2) 
 		{ 
 			arr[k] = R[j]; 
 			j++; 
 			k++; 
 		} 
 	} 
} 