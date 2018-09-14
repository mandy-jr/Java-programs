import java.util.*;
class circle
{
	protected float r;
	protected  void accept(float rad)
	{
		r= rad;
	}
}
class area extends circle
{
	protected float area;
	void cal_area(){
		area= 3.14f*r*r;
	}
	void display1(){
		System.out.print("Area is: "+ area);
	}
}
class volume extends area
{
	private float volume;
	void cal_volume()
	{
		volume=(4/3)*area*r;
	}
	void display(){
		System.out.println("\nVolume is: "+ volume);
	}
}
class multi_inheritance
{
	public static void main(String args[])
	{
		float r;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter radius: ");
		r= sc.nextFloat();
		volume v= new volume();
		v.accept(r);
		v.cal_area();
		v.display1();
		v.cal_volume();
		v.display();
	}
}

