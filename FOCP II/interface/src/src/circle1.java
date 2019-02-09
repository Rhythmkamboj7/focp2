class circle1 implements Geometricobject
{
	double radius = 1.0;
	 circle1(double c)
	{
	radius=c;
	}
	 circle1()
	{
	radius=0;
	}
	public double getperimeter()
	{
	return 2*3.14*radius;
	}
	public double getarea()
	{
	return 3.14*radius*radius;
	}
}