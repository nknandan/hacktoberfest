import java.io.*; 
import java.util.Scanner;
public class prime
{
	public static void main(String[] args) {
    int i, n,count=0;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    for(i=1;i<=n;i++)
{
   if(n%i==0)
      count++;
}
if(count==2)
System.out.println("print number is prime");
else
System.out.println("the number is not prime"); 
     
  }
	
}

