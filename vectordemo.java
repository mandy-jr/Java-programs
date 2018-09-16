import java.util.*;
class vectordemo
{
public static void main(String args[])
{
	int choice, i;
	String s;
	Vector v= new Vector();
	Scanner sc= new Scanner(System.in);
	System.out.println("Capacity is:"+v.capacity()+"\n size is:"+v.size());
	v.addElement(new String("Saurabh"));
	v.addElement(new String("Pranit"));
	v.addElement(new String("Ashish"));
	v.addElement(new String("Rohit"));

	System.out.println("Elements are:"+v);
	do{
		System.out.println("Main Menu: \n 1.ADD \n 2.DELETE \n 3.DISPLAYatINDEX \n 4.DISPLAY");
		System.out.println("Enter your choice: ");
		choice=sc.nextInt();
		switch(choice){
		case 1: System.out.print("Enter name to add: ");
				sc.nextLine();
				s=sc.nextLine();
				v.addElement(s);
				break;
		case 2: System.out.print("Enter name to delete: ");
				sc.nextLine();
				s=sc.nextLine();
				v.removeElement(s);
				break;
		case 3: System.out.print("Enter Index: ");
				i=sc.nextInt();
				System.out.println(v.elementAt(i));
				break;
		case 4: System.out.print("All the Elements are: ");
				System.out.println(v);
}}while(choice!=5);
}
}