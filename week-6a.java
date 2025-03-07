class ExceptionExample
{
public static void main(String args[])
{
try
{
int num=10/0;
System.out.println("result:"+num);
}
catch(ArithmeticException e)
{
System.out.println("exception Caught:"+e.getMessage());
}
finally
{
System.out.println("execution completed");
}
System.out.println("code continues after the exception");
}
}