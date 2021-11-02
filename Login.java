import java.awt.*;
public class Login extends JFrame implements ActionListener
{
Label l1,l2,l3,l4,head;
JComboBox j1,j2,j3,j4;
JTextField f1,f3,f4;
JPasswordField f2;
JButton b1,b2,b3;
String type;
String un,pw,uid;
String usn[]=new String[100];
String pass;
int t;
public Login()
{
super("HOSPITAL MANAGEMENT SYSTEM");
setLayout(null);
getContentPane().setBackground(Color.lightGray);
head=new Label("USER LOGIN");
add(head);
head.setBounds(275,20,160,30);
head.setForeground(Color.blue.brighter());
head.setBackground(Color.white);
head.setFont(new Font("Times New Roman",Font.BOLD,25));
j1=new JComboBox();
add(j1);
j1.setBounds(160,80,350,40);
j1.setBackground(Color.blue.brighter());
j1.setFont(new Font("Times New Roman",Font.BOLD,16));
j1.setForeground(Color.white);
j1.addActionListener(this);
j1.addItem("SELECT THE USER TYPE");
j1.addItem("DOCTOR");
j1.addItem("PATIENT");
l1=new Label("USERNAME :");
add(l1);
l1.setBounds(250,140,150,40);
l1.setForeground(Color.black.brighter());
l1.setFont(new Font("Times New Roman",Font.BOLD,18));
f1=new JTextField();
add(f1);
f1.setBounds(410,140,240,40);
f1.setBackground(Color.cyan.brighter());
f1.setFont(new Font("Times New Roman",Font.PLAIN,18));
l2=new Label("PASSWORD :");
add(l2);
l2.setBounds(250,190,150,40);
l2.setForeground(Color.black.brighter());
l2.setFont(new Font("Times New Roman",Font.BOLD,18));
f2=new JPasswordField();
add(f2);
f2.setBounds(410,190,240,40);
f2.setBackground(Color.cyan.brighter());
f2.setFont(new Font("Times New Roman",Font.PLAIN,18));
b1=new JButton("LOGIN");
add(b1);
Page 1
Login.java
b1.setBounds(350,250,150,50);
b1.addActionListener(this);
b1.setFont(new Font("Times New Roman",Font.BOLD,20));
b2=new JButton("CANCEL");
add(b2);
b2.setBounds(510,250,150,50);
b2.addActionListener(this);
b2.setFont(new Font("Times New Roman",Font.BOLD,20));
l3=new Label("NEW USER ? REGISTER");
add(l3);
l3.setBounds(30,320,200,40);
l3.setForeground(Color.black.brighter());
l3.setFont(new Font("Times New Roman",Font.BOLD,15));
b3=new JButton("Click Here");
add(b3);
b3.setBounds(230,325,150,30);
b3.addActionListener(this);
b3.setFont(new Font("Times New Roman",Font.BOLD,20));
setSize(700,400);
this.setResizable(false);
setVisible(true);
setLocation(550,200);
show();
}
public void actionPerformed(ActionEvent ae)
{
try
{
Connection cn;
DBConnection con=new DBConnection();
cn=con.get_DBConnection();
java.sql.Statement st=cn.createStatement();
ResultSet s1=null;
if(ae.getSource()==b2)
{
dispose();
}
else if(ae.getSource()==j1)
{
type=j1.getSelectedItem().toString();
}
else if(ae.getSource()==b3)
{
dispose();
new patdet();
}
else if(ae.getSource()==b1)
{
if(type.equals("SELECT THE USER TYPE"))
{
JOptionPane.showMessageDialog(this,"Select the User Type !!!");
}
else if(type.equals("PATIENT"))
{
un=f1.getText();
pw=f2.getText().toString();
String qry="Select * from patdetails where name='"+un+"'";
s1=st.executeQuery(qry);
int i=0;
Page 2
Login.java
if(s1.next())
{
pass=s1.getString(9);
uid=s1.getString(10);
}
if(pass.equals(pw))
{
dispose();
t=1;
new pmenu(un,uid,t);
}
else
{
JOptionPane.showMessageDialog(this,"Incorrrect Username or Password !!!");
}
}
else if(type.equals("DOCTOR"))
{
un=f1.getText();
pw=f2.getText().toString();
String qry="Select * from doctor where name='"+un+"'";
s1=st.executeQuery(qry);
int i=0;
if(s1.next())
{
pass=s1.getString(5);
uid=s1.getString(2);
}
if(pass.equals(pw))
{
dispose();
t=2;
new pmenu(un,uid,t);
}
else
{
JOptionPane.showMessageDialog(this,"Incorrrect Username or Password
!!!");
}
}
}
}
catch(Exception ex)
{
}
}
public static void main(String args[])
{
new Login();
}
}
Page