// exp_3.a
class Student 
{ 
 	String name="Red"; 
 	String _class="B.Tech 2st year"; 
 	int rollno=000; 
 	public void display() 
 	{ 
 		System.out.println("Name of the student is:"+name); 
 		System.out.println("Present qualification of the student is:"+_class); 
 		System.out.println("Roll number of the student is:"+rollno); 
 	} 
} 
class Details 
{ 
	public static void main(String args[]) 
 	{ 
 		Student s1=new Student(); 
 		s1.display(); 
 	} 
}