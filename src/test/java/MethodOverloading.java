class MathOperations
{
	int add(int a,int b ) {
	return a+b;}

	public static int add(int a,int b,int c ) {
		return a+b+c;}
	public static  double add(double a,double b ) {
		return a+b;}

}
public class MethodOverloading {

	public static void main(String[] args) 
	{
		MathOperations math=new MathOperations();
		System.out.println(math.add(4,6));
		System.out.println(math.add(8, 9));
		System.out.println(math.add(4.5, .7));
		
	}
}

