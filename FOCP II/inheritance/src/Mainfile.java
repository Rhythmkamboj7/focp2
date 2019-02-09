import java.util.*;
class Mainfile
{
	public static void main( String args[])
	{
	int t;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the tyres");
	t=sc.nextInt();

	switch(t)
	{
	case 2:
	{
	 Bike b=new Bike();
	 b.display();
	 break;
	}
	case 4:
	{Car b= new Car();
		 b.display();

	break;
	}
    default:
    {
    Vehicle b= new Vehicle();
    	 b.display();

    break;
    }
 }
}
}