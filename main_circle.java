import java.util.*;
class circle
{
	protected float r;
	void accept_rad(float rad)
	{
		r=rad;
	}
}
class area extends circle
{
	private float area;
	void cal_area()
	{
		area= 3.14f*r*r;
	}
	void display()
	{
		System.out.print("Area: "+ area);
	}
}
class main_circle
{
	public static void main(String args[])
	{
		float r;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter radius: ");
		r= sc.nextFloat();
		
		area a= new area();
		a.accept_rad(r);
		a.cal_area();
		a.display();
	}
}