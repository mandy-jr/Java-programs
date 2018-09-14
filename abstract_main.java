import java.util.*;
abstract class volume
{
	float r, vol;
	void accept_rad(float rad)         //accepting radius method
	{
		r=rad;
	}
	abstract void cal_volume();		//abstract method
	void display()
	{
		System.out.print("\nVolume is: "+vol);
	}
}
class sphere extends volume		//inheritance from volume
{
	void cal_volume()
	{
		vol=(4/3)*3.14f*r*r*r;
	}
}
class hemisphere extends volume		//inheritance from volume
{
	void cal_volume()
	{
		vol=(2*3.14f*r*r*r)/3;
	}
}
class abstract_main
{
	public static void main(String args[])
	{
		float r;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter radius: ");
		r= sc.nextFloat();
		sphere s= new sphere();
		s.accept_rad(r);
		s.cal_volume();
		s.display();
		hemisphere h= new hemisphere();
		h.accept_rad(r);
		h.cal_volume();
		h.display();
	}
}
