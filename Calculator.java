import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener,WindowListener
{
JFrame f;
JLabel l;
JButton b[]=new JButton[16];
String caption[]={"7","8","9","+","4","5","6","-","1","2","3","*",".","0","=","/"};
JPanel p;
Calculator()
{
f=new JFrame("Calculator");
f.addWindowListener(this);
l=new JLabel("0");
l.setFont(new Font("Arial",1,24));
p=new JPanel();
p.setLayout(new GridLayout(4,4));
for(int i=0;i<16;i++)
{
b[i]=new JButton(caption[i]);
b[i].addActionListener(this);
b[i].setFont(new Font("Arial",1,24));
p.add(b[i]);
}
f.add(l,BorderLayout.NORTH);
f.add(p);
f.setVisible(true);
f.setSize(400,400);
}
public static void main(String ar[])
{
Calculator c=new Calculator();
}
public void actionPerformed(ActionEvent e)
{
}
public void windowClosing(WindowEvent e)
{
f.dispose();
}
public void windowClosed(WindowEvent e)
{
}
public void windowOpened(WindowEvent e)
{
}
public void windowIconified(WindowEvent e)
{
}
public void windowDeiconified(WindowEvent e)
{
}
public void windowActivated(WindowEvent e)
{
}
public void windowDeactivated(WindowEvent e)
{
}

}
