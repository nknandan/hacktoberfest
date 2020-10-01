import java.io.*; 
import java.util.Scanner;
public class palindrome
{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
String str = sc.nextLine(); 
int i,j,n,flag=0;

n=str.length();

for(i=0,j=n-1;i!=j;i++,j--)
{
if(str.charAt(i)!=str.charAt(j))
flag=1;
}
if(flag==0)
System.out.println("palindrome");
else
System.out.println(" Not palindrome");
}
	
}
