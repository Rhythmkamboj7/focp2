class ResizableCircle extends circle1 implements Resizable
{
	ResizableCircle(double r)
	{
	radius=r;
	}
	ResizableCircle()
	{
	raduis=0;
	}
	public int resize(int percent)
	{
	return(int)(radius+((percent/100)*radius));
	}
}