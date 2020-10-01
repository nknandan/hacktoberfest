import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        int i, j, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the matrix:");
        int m = s.nextInt();
        int n = s.nextInt();
        int a[][] = new int[m][n];
        System.out.print("Enter the elements of the matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                a[i][j] = s.nextInt();
        }
        int t[][]=new int[n][m];
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            t[j][i]=a[i][j];
        }
        System.out.println("Transpose of the matrix");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
            {
                System.out.print( t[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}