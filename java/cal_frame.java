import java.awt.*;
import java.awt.event.*;
public class cal_frame extends Frame implements ActionListener
{
TextField t1,t2,t3;
Label l1,l2,l3;
Button b1,b2,b3,b4;
cal_frame()
{
 setLayout(new FlowLayout());
 t1=new TextField(10);
 t2=new TextField(10);
 t3=new TextField(10);
 l1=new Label("first number:");
 l2=new Label("Second number:");
 l3=new Label("Result:");
 b1=new Button("+");
 b2=new Button("-");
 b3=new Button("*");
 b4=new Button("/");
 add(l1);
 add(t1);
 add(l2);
 add(t2);
 add(l3);
 add(t3);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 t1.setText("");
 t2.setText("");
 t3.setText("");
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  int a,b,re=0;
  //String str;
  a=Integer.parseInt(t1.getText());
  b=Integer.parseInt(t2.getText());
  if(ae.getSource()==b1)
  {
   re=a+b;
   }
   else if(ae.getSource()==b2)
   {
   re=a-b;
   }
   else if(ae.getSource()==b3)
   {
   re=a*b;
   } 
   else if(ae.getSource()==b4)
   {
    if(b==0)
    {
     t3.setText("division not possble");
     }
    else
   { 
   re=a/b; 
   }
   }
   t3.setText("number:"+re);
   }
   public static void main(String ar[])
 {
    cal_frame f= new cal_frame();
    f.setTitle("calculation");
    f.setSize(200,300);
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter()
    {
     public void WindowClosing(WindowEvent e)
     {
      System.exit(0);
      }
     });
  }
}
      
