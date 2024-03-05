import java.util.Scanner;
class inputvalue{
 int no;
 String name;
 float mark;
 void showDetails(){
   System.out.println("\nThis is a not static method");
   System.out.println("\n\nStudent Details:");
   System.out.println("\nRoll no:"+no);
   System.out.println("\n\nFirst name entered is:"+name);
   System.out.println("\nmark is:"+mark);
 }
 static void show(){
   System.out.println("This is a static method");
 }
 public static void main(String a[]){
  try{
   Scanner s=new Scanner(System.in);
   inputvalue i=new inputvalue();
   System.out.println("Enter the rollno:");
   i.no=s.nextInt();
	s.nextLine();
   System.out.println("Enter the name:");
   i.name=s.nextLine();
   System.out.println("Enter the mark:");
   i.mark=s.nextFloat();
   i.showDetails();
   show();
   }catch(Exception w)
   {
    System.out.println(w);
   }
   }
   }