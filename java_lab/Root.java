import java.util.Scanner;
class Root
{
float a,b,c,d,r1,r2;
public static void main(String args[])
{
Root ob=new Root();
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter a,b,c values");
ob.a=sc.nextFloat();
ob.b=sc.nextFloat();
ob.c=sc.nextFloat();
ob.d=(float)Math.sqrt(ob.b*ob.b-4*ob.a*ob.c);
if(ob.d==0)
{
System.out.println("\nRoots are real and equal");
ob.r1=ob.r2=(-ob.b/2*ob.a);
System.out.println("\n R1=R2="+ob.r1);
}
else if(ob.d>0)
{
System.out.println("\nRoot are real and distint");
ob.r1=(-ob.b+ob.d/2*ob.a);
ob.r2=(-ob.b-ob.d/2*ob.a);
System.out.println("\nR1="+ob.r1+"\nR2="+ob.r2);
}
else
{
System.out.println("Roots are imaginary");
}
}
}

