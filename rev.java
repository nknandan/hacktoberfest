import java.io.*; 
import java.util.Scanner;
public class rev
{
public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
char temp;


int i,j,n,flag=0;

n=str.length();
char[] str1 = str.toCharArray();
for(i=0,j=n-1;i!=j;i++,j--)
{
    temp=str1[i];
    str1[i]=str1[j];
    str1[j]=temp;
}

for (char c : str1) 
            System.out.print(c);





}
	
}