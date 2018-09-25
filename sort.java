import java.util.*;
class sort
{
void Sort(int[] a)
{
int i,j,temp;
for(i=0; i<=a.length-2; i++){
    for(j=0; j<=a.length-2; j++){
       if(a[j]> a[j+1]){
          temp= a[j];
          a[j]= a[j+1];
          a[j+1]= temp;
}
}
}
System.out.println("The sorted array is:");
for(i=0; i<=a.length-1; i++){
System.out.print(a[i]+"\t");
}
}
 public static void main(String args[])
{
int i, j, temp, n;
sort s= new sort();
Scanner sc= new Scanner(System.in);
System.out.println("Enter size of array:");
n =sc.nextInt();
int[] a= new int[n];
System.out.println("Enter elements of your array:");
for(i=0; i<=n-1; i++)
{
 a[i]= sc.nextInt();
}
s.Sort(a);
}
}