import java.awt.*;
public class patdet extends JFrame implements ActionListener
{
Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
JTextField t2,t3,t4,t5,t6,t7;
JPasswordField t9;
TextArea t8;
JComboBox b3,b5;
JButton s,c,dt,dl,test,generatebill;
String gen[]=new String[4];
String bg[]=new String[9];
String n="",g="",bl="",id="",pn="",ma="",qry="",pid="";;
String pass;
int ag;
public patdet()
{
super("HOSPITAL MANAGEMENT SYSTEM");
setLayout(null);
l1=new Label("PATIENT REGISTRATION");
l1.setBounds(190,20,310,30);
add(l1);
l1.setBackground(Color.black.brighter());
l1.setForeground(Color.white.brighter());
l1.setFont(new Font("Times New Roman",Font.BOLD,25));
l2=new Label("Full Name");
l2.setBounds(10,70,200,30);
add(l2);
l2.setForeground(Color.red.brighter());
l2.setFont(new Font("Times New Roman",Font.BOLD,15));
t2=new JTextField();
t2.setBounds(210,70,200,30);
add(t2);
t2.setBackground(Color.cyan);
t2.setFont(new Font("Times New Roman",Font.PLAIN,18));
l3=new Label("Gender");
l3.setBounds(10,110,200,30);
add(l3);
l3.setForeground(Color.red.brighter());
l3.setFont(new Font("Times New Roman",Font.BOLD,15));
gen[0]="Select the Gender";
gen[1]="Male";
gen[2]="Female";
gen[3]="Others";
b3=new JComboBox(gen);
b3.setBounds(420,110,200,30);
add(b3);
b3.setBackground(Color.BLUE);
b3.setForeground(Color.WHITE);
b3.addActionListener(this);
t3=new JTextField();
t3.setBounds(210,110,200,30);
add(t3);
t3.setBackground(Color.cyan);
t3.setFont(new Font("Times New Roman",Font.PLAIN,18));
Page 1
patdet.java
l4=new Label("Age");
l4.setBounds(10,150,200,30);
add(l4);
l4.setForeground(Color.red.brighter());
l4.setFont(new Font("Times New Roman",Font.BOLD,15));
t4=new JTextField();
t4.setBounds(210,150,200,30);
add(t4);
t4.setBackground(Color.cyan);
t4.setFont(new Font("Times New Roman",Font.PLAIN,18));
l5=new Label("Blood Group");
l5.setBounds(10,190,200,30);
add(l5);
l5.setForeground(Color.red.brighter());
l5.setFont(new Font("Times New Roman",Font.BOLD,15));
bg[0]="Select the Blood Group";
bg[1]="O+ve";bg[2]="O-ve";bg[3]="A+ve";bg[4]="A-ve";
bg[5]="B+ve";bg[6]="B-ve";bg[7]="AB+ve";bg[8]="AB-ve";
b5=new JComboBox(bg);
b5.setBounds(420,190,200,30);
add(b5);
b5.setBackground(Color.BLUE);
b5.setForeground(Color.WHITE);
b5.addActionListener(this);
t5=new JTextField();
t5.setBounds(210,190,200,30);
add(t5);
t5.setBackground(Color.cyan);
t5.setFont(new Font("Times New Roman",Font.PLAIN,18));
l6=new Label("Email ID");
l6.setBounds(10,230,200,30);
add(l6);
l6.setForeground(Color.red.brighter());
l6.setFont(new Font("Times New Roman",Font.BOLD,15));
t6=new JTextField();
t6.setBounds(210,230,200,30);
add(t6);
t6.setBackground(Color.cyan);
t6.setFont(new Font("Times New Roman",Font.PLAIN,18));
l7=new Label("Contact Number");
l7.setBounds(10,270,200,30);
add(l7);
l7.setForeground(Color.red.brighter());
l7.setFont(new Font("Times New Roman",Font.BOLD,15));
t7=new JTextField();
t7.setBounds(210,270,200,30);
add(t7);
t7.setBackground(Color.cyan);
t7.setFont(new Font("Times New Roman",Font.PLAIN,18));
l8=new Label("Address");
l8.setBounds(10,310,200,30);
add(l8);
l8.setForeground(Color.red.brighter());
l8.setFont(new Font("Times New Roman",Font.BOLD,15));
Page 2
patdet.java
t8=new TextArea();
t8.setBounds(210,310,200,100);
add(t8);
t8.setBackground(Color.cyan);
t8.setFont(new Font("Times New Roman",Font.PLAIN,18));
l9=new Label("Password");
l9.setBounds(10,420,200,30);
add(l9);
l9.setForeground(Color.red.brighter());
l9.setFont(new Font("Times New Roman",Font.BOLD,15));
t9=new JPasswordField();
t9.setBounds(210,420,200,30);
add(t9);
t9.setBackground(Color.cyan);
t9.setFont(new Font("Times New Roman",Font.PLAIN,18));
s=new JButton("SUBMIT");
s.setBounds(150,470,150,50);
s.setFont(new Font("Times New Roman",Font.BOLD,16));
s.setBackground(Color.MAGENTA);
s.setForeground(Color.BLACK);
s.addActionListener(this);
add(s);
c=new JButton("CANCEL");
c.setBounds(310,470,150,50);
c.setFont(new Font("Times New Roman",Font.BOLD,16));
c.setBackground(Color.MAGENTA);
c.setForeground(Color.BLACK);
c.addActionListener(this);
add(c);
setSize(660,580);
this.setResizable(false);
setLocation((int) 600,(int) 200);
setVisible(true);
show();
}
public void actionPerformed(ActionEvent ae)
{
try
{
Connection cn;
DBConnection con=new DBConnection();
cn=con.get_DBConnection();
Statement st=cn.createStatement();
if(ae.getSource()==c)
{
dispose();
}
else if(ae.getSource()==b3)
{
g=b3.getSelectedItem().toString();
t3.setText(g);
}
else if(ae.getSource()==b5)
{
bl=b5.getSelectedItem().toString();
Page 3
patdet.java
t5.setText(bl);
}
else if(ae.getSource()==s)
{
LocalDate rd=java.time.LocalDate.now();
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
n=t2.getText();
ag=Integer.parseInt(t4.getText());
id=t6.getText();
pn=t7.getText();
ma=t8.getText();
pass=t9.getText().toString();
pid=n+ag;
qry="Insert into
patdetails(Name,Gender,Age,BloodGroup,EmailID,ContactNumber,Address,PatientID,Registere
dDate,RegisteredTime,Password)
values('"+n+"','"+g+"','"+ag+"','"+bl+"','"+id+"','"+pn+"','"+ma+"','"+pid+"','"+rd+"',
'"+sdf.format(date)+"','"+pass+"')";
boolean k=st.execute(qry);
if(k==false)
{
JOptionPane.showMessageDialog(this,"Inserted Successfully"+"\nYour ID
is "+pid);
dispose();
new Login();
}
else if(k==true)
{
JOptionPane.showMessageDialog(this,"Error");
}
}
cn.close();
}
catch(Exception e)
{
}
}
public static void main(String[] args)
{
new patdet();
}
}
Page