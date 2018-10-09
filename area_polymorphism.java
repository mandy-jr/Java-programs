import java.util.*;
class area
{
	float area;
	void area(float r)
	{
		area= 3.14f*r*r;
		System.out.print("Area of circle is: "+area+"\n");
	}
	void area(float b, float h)
	{
		area=(b*h)/2.0f;
		System.out.print("Area of triangle is: "+area+"\n");
	}
	void area(int length, int breadth)
	{
		area=length*breadth;
		System.out.print("Area of rectangle is: "+area+"\n");
	}
}
class area_polymorphism
{
	public static void main(String[] args)
	{
		float r, b, h;
		int length, breadth;
		area a= new area();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter radius: ");
		r= sc.nextFloat();
		a.area(r);
		System.out.print("Enter hight & base of triangle: ");
		h= sc.nextFloat();
		b= sc.nextFloat();
		a.area(b, h);
		System.out.print("Enter length & breadth of rectangle: ");
		length= sc.nextInt();
		breadth= sc.nextInt();
		a.area(length, breadth);
	}
}