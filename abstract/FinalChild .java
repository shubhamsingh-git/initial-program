class FinalEx
{
final private int a=0;
public final void finalMethod()
{
System.out.println("we are in final method");
}
}
class FinalChild extends FinalEx 
{
public static void main(String a[])
{
FinalChild f=new FinalChild();
f.finalMethod();

}
}