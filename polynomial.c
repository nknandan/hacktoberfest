#include<stdio.h>
int main()
{
    int n,m,a[10],b[10],i,j;
    scanf("%d%d",&n,&m);
    for(i=n;i>=0;i--)
    scanf("%d",&a[i]);
    for(i=m;i>=0;i--)
    scanf("%d",&b[i]);
    
    for(i=n,j=m;i>=0&&j>=0;)
    {
        if(i>j)
        {
            printf("%d ",a[i]);
            i--;
        }
        else if(j>i)
        {
            printf("%d ",b[j]);
            j--;
        }
        else {
        printf("%d ",a[i]+b[j]);
        i--;
        j--;
        }
    }
return 0;
}
