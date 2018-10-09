import java.util.*;
interface Area
{
	public static final float pi=3.14f;
	public abstract void compute();
}
class rectangle implements Area
{
	float area, x, y;
	public void compute()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length & breadth: ");
		System.out.print("Length: ");
		x= sc.nextFloat();
		System.out.print("Breadth: ");
		y= sc.nextFloat();
		area= x*y;
		System.out.println("Area is: "+area);
	}
}
class circle implements Area
{
	float area, r;
	public void compute()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		r= sc.nextFloat();
		area= pi*r*r;
		System.out.println("Area is: "+area);
	}
}
class main_area_interface
{
	public static void main(String[] args)
	{
		rectangle r= new rectangle();
		circle c= new circle();
		r.compute();
		c.compute();
	}
}