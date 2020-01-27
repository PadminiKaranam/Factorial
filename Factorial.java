import java.util.*;
class CalFact
{
  int f=1;
  int fact(int n)
  {
    int i;
    for(i=1;i<=n;i++)
         f=f*i;
    return f;
  }
}
class Factorial
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = s.nextInt();
    CalFact c = new CalFact();
    int f = c.fact(n);
    System.out.println("Factorial of "+n+" is : "+f);
  }
}
    
    