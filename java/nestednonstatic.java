class outer
{
	int num1=10;
	class inner
	{
		int num2=20;
		void display()
		{
			System.out.println(num1);
		}
	}
}
class nestednonstatic
{
	public static void main(String args[])
	{
		//non-static class object creation
		outer o=new outer();
		outer.inner i= o.new inner();
		i.display();
		System.out.println(i.num2);
	}

}	