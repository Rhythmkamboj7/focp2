import java.util.*;
public class month
{
public static void main(String args[])
{
Scanner S = new Scanner(System.in);
System.out.print("enter floating-point number");
 x = S.nextFloat();
System.out.print("enter second floating-point number");
y = S.nextFloat();
x = Math.round(x * 1000);
x = x / 1000;
y = Math.round(y * 1000);
y = y / 1000;
if (x == y)
{
System.out.println("They are the same up to three decimal places");
}
else
{
System.out.println("They are different");
}
}
}