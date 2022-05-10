import java.util.*;
import java.lang.*;
class A
{
    int a;
    void set_a(int i)
    {
        a=i;
    }
    void print_a()
    {
        System.out.println("a= "+a);
    }
}
class B extends A
{
    int b;
    void set_ab(int i, int j)
    {
        super.set_a(i);
        b=j;
    }
    void print_ab()
      {
          super.print_a();
          System.out.println("b= "+b);
      }
}
class MainInherit
{
    public static void main(String[] args)
    {
        B obj=new B();
        obj.set_ab(10,20);
        obj.print_ab();
    }
}