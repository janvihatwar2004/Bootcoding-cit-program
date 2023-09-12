public class nestedIf
{
public static void main (String [] args)
{
//find the largest number among three
int a=20,b=30,c=40;
if(a>b && a>c)
{
System.out.println("a:"+a+" is greater number ");
}
else if (b>a && b>c)
{
System.out.println("b:"+b+" is Greater number");
}
else
{
System.out.println("c:"+c+" the greatest number" );
}
}
}