import java.util.*;
class triangle{
	float h, b, area;
	triangle()
	{
		System.out.println("Enter base & height: ");
		Scanner sc= new Scanner(System.in);
		b=sc.nextFloat();
		h=sc.nextFloat();
	}
	triangle(float base, float height)
	{
		b=base;
		h=height;
	}
	void area()
	{
		area=0.5f*b*h;
	}
	void display()
	{
	System.out.println("Area: "+ area);
	}
}
class main_triangle
{
	public static void main(String args[])
	{
		triangle t= new triangle();
		t.area();
		t.display();
		triangle t1= new triangle(5.5f, 7.2f);
		t1.area();
		t1.display();
	}
}