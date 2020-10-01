import java.util.Scanner;
public class se {
    public static void main(String[] args) {
        int n,i,j,temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
            arr[i]=s.nextInt();
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
    System.out.println(arr[1]+" is the second smallest number");
    }
}
