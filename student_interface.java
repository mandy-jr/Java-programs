import java.util.*;
class student
{
	int roll_no;
	void get_roll_no(int n)
	{
		roll_no=n;
	}
	void put_roll_no()
	{
		System.out.print("Roll no: "+ roll_no+"\n");
	}
}
class test extends student
{
	float mark1, mark2;
	void get_marks(float x, float y)
	{
		mark1 = x;
		mark2 = y;
	}
	void put_marks()
	{
		System.out.println("Marks1: "+mark1);
		System.out.println("Marks2: "+mark2);
	}
}
interface Sport
{
	float sp_wt=0.5f;
	void put_wt();
}
class result extends test implements Sport
{
	float total;
	public void put_wt()
	{
		System.out.print("Sport: "+ sp_wt);
	}
	void display()
	{
		total= mark1+mark2+sp_wt;
		put_roll_no();
		put_marks();
		put_wt();
		System.out.print("\nTOTAL: "+total);
	}
}
class student_interface
{
	public static void main(String[] args)
	{
		result r= new result();
		r.get_roll_no(17);
		r.get_marks(40, 40);
		r.display();
	}
}