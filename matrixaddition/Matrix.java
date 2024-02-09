import java.util.Scanner;
class Matrix
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows:");
int m=sc.nextInt();
System.out.println("Enter number of columns:");
int n=sc.nextInt();
int[][] mat1=new int[m][n];
int[][] mat2=new int[m][n];
int[][] sum=new int[m][n];
System.out.println("Enter the first matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
mat1[i][j]=sc.nextInt();
}
}
System.out.println("Enter the second matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
mat2[i][j]=sc.nextInt();
}
}
System.out.println("Sum of the matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
sum[i][j]=mat1[i][j]+mat2[i][j];
System.out.print(sum[i][j]+"\t");
}
System.out.println();
}
}
}


