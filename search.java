import java.util.*;
class search
{
void srch(int[] a, int n)
{
     int ele, i;
     boolean flag=false;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number to be search: ");
     ele= sc.nextInt();
     
     for(i=0; i<=n-1; i++){
         if(a[i]== ele){
           flag=true;
           break; 
		}
	}
if(flag==true){
    System.out.println("element is found at:"+ (i+1));
}
else{
    System.out.println("element not found");
}
}
public static void main(String args[]){
        search s= new search();
	int n, i;
	Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
	n= sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the elements:");
        for(i=0; i<=n-1; i++){ 
            a[i]= sc.nextInt();
		}
        s.srch(a, n);
}
}