import java.util.*;
class student
{
	String name;
	int id, p, c, m, total;
	void accept(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID: ");
		id= sc.nextInt();
		System.out.println("Enter name: ");
		sc.nextLine();
		name= sc.nextLine();
		System.out.println("Enter p: ");
		p= sc.nextInt();
		System.out.println("Enter c: ");
		c= sc.nextInt();
		System.out.println("Enter m: ");
		m= sc.nextInt();
		total= p+c+m;
	}
	void display()
	{
		System.out.println(id+"\t"+name+"\t"+total);
	}
}
class main_student
{
	public static void main(String args[])
	{
		int n, i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of students: ");
		n=sc.nextInt();
		
		student[] s= new student[n];
		for(i=0; i<n; i++){
			s[i]= new student();
			s[i].accept();
		}
		System.out.println("ID \t Name \t Total");
		for(i=0; i<n; i++){
			s[i].display();
		}
	}
}