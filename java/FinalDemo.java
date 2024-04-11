//final  // cannot inherit final class
class A
{
	final String x="Livya"; //constant
	
	// cannot override a final method 
	final void display()
	{
		//x="Megha"; 
		System.out.println("Value of X : "+x);
	}

}

class B extends A
{
	void display()
	{
		System.out.println("Inside class B"+x);
	}
	
}

class FinalDemo
{
	public static void main(String[] args)
	{
		A a=new A();
		a.display();

		B b=new B();
		a.display();
	}
}