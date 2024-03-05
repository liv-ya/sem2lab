import java.util.Scanner;

class Product
{
	Scanner s=new Scanner(System.in);
	int pcode;
	String pname;
	int price;

	void input()
	{
		System.out.println("Enter Product Code");
		pcode=s.nextInt();
		s.nextLine();
		System.out.println("Enter Product Name");
		pname=s.nextLine();
		System.out.println("Enter Product Price");
		price=s.nextInt();
	}

	void display()
	{
		System.out.println("------Details------\n");
		System.out.println("Product Code :"+pcode);
		System.out.println("Product Name :"+pname);
		System.out.println("Price :"+price);
	}
}
class mul_product
{
        public static void main(String args[])
	{
		try
		{
			Product p1=new Product();
			Product p2=new Product();
			Product p3=new Product();
			
			System.out.println("------Product 1------");
			p1.input();
			System.out.println("------Product 2------");
			p2.input();
			System.out.println("------Product 3------");
			p3.input();
			
			if ((p1.price<p2.price) && (p1.price<p3.price))
			{
				System.out.println("\n\n------Product 1------");
				p1.display();
			}
			else if((p2.price<p1.price) && (p2.price<p3.price))
			{
				System.out.println("\n\n------Product 2------");
				p2.display();
			}
			else if ((p3.price<p1.price) && (p3.price<p2.price))
			{
				System.out.println("\n\n------Product 3------");
				p3.display();
			}
		}catch(Exception e)
		 {
		 	System.out.println(e);
		 }
	}
}
  