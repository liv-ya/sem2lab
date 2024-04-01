class A
{
    int x=12;
    void show()
    {
         System.out.println("Value of x ="+x);
    }
}
class B extends A
{
    int y=13;
    void display()
    {
         System.out.println("Value of y="+y);
    }
     void show()
    {
         super.show();
         System.out.println("Inside a B class");
         
    }
}
class Inheritance{
    public static void main(String[] args)
    {
       B b=new B();
       b.display();
       b.show();
    }
}
     
