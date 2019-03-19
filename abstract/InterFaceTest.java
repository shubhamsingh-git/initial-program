interface ITest
{
public abstract void method1();
public void method2();

}
class InterfaceTest implements ITest
{
public void method1()
{
System.out.println("we are one method");
}
public void method2()
{
System.out.println("we are two method");
}
public static void main(String a[])
{
InterfaceTest t=new InterfaceTest();
t.method1();
t.method2();
}
}