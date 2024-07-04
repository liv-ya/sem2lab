import java.awt.*;
import java.awt.event.*;
public class Frame_ex extends Frame implements ActionListener{
  TextField T1,T2,T3,T4;
  Label Lb1,Lb2,Lb3,Lb4;
  Button b1;
  Frame_ex(){
   setLayout(new FlowLayout());
   T1= new TextField(10);
   T2= new TextField(10);
   T3= new TextField(10);
   T4= new TextField(10);
   Lb1=new Label("First No");
   Lb2=new Label("Second No");
   Lb3=new Label("Third No");
   Lb4=new Label("Big No");
   b1=new Button("Check");
   add(Lb1);
   add(T1);
   add(Lb2);
   add(T2);
   add(Lb3);
   add(T3);
   add(b1);
   add(Lb4);
   add(T4);
   T1.setText("");
   T2.setText("34");
   T3.setText("");
   T4.setText("");
   b1.addActionListener(this);
  }
 public void actionPerformed(ActionEvent ae)
 {
   int a,b,c,result;
   String str;
   if(ae.getSource()==b1)
   {
     str=T1.getText();
     a=Integer.parseInt(str);
     b=Integer.parseInt(T2.getText());
     c=Integer.parseInt(T3.getText());
	if(a>b && a>c)
	   result=a;
	else if(b>c && b>a)
	   result=b;
        else
	   result=c;
        T4.setText(String.valueOf(result));
   }
}

public static void main(String args[])
{
 Frame_ex obj=new Frame_ex();
 obj.setTitle("compare");
 obj.setSize(200,300);
 obj.setVisible(true);
 /*obj.addWindowListener(new WindowAdapter()
 {
   public void windowClosing(WindowEvent e)
   {
    System.exit(0);
   }
 }); */
}
}

	

















