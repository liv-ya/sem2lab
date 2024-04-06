class outer
{
	static int num1=10;
	static class staticinner
	{
		int num2=20;
		void staticdisplay()
		{
			System.out.println(num1);
		}
	}
}
class nestedstatic
{
	public static void main(String args[])
	{
		//static class objet creation
		outer.staticinner s= new outer.staticinner();
		s.staticdisplay();
	}

}	