import java.awt.*;
public class pmenu extends JFrame implements ActionListener
{
MenuBar mbar;
Menu menu,menu1,menu2;
MenuItem d1,d2,d3,p1,p2,p3,p4,lg;
String user,id,un;
int type,temp=0,k=0,nec=0,ag,i=0,pcn,tot;
Label wu,ud;
String qry="",qry1="",qry2="";
String gen,dn,spc,x="",add,eid,th,hu,te,u,aw,bill="",total="";
String napp[]=new String[100];
String test[]=new String[5];
String price[]=new String[5];
public pmenu(String un,String uid,int t)
{
super("HOSPITAL MANAGEMENT SYSTEM");
setLayout(null);
user=un;
id=uid;
type=t;
mbar=new MenuBar();
menu=new Menu("DOCTOR");
d1=new MenuItem("Schedule Test");
menu.add(d1);
d1.addActionListener(this);
d2=new MenuItem("Doctor Report");
menu.add(d2);
d2.addActionListener(this);
d3=new MenuItem("Patient Report");
menu.add(d3);
d3.addActionListener(this);
menu1=new Menu("PATIENT");
p1=new MenuItem("Schedule Appointment");
menu1.add(p1);
p1.addActionListener(this);
p2=new MenuItem("Cancel Appointment");
menu1.add(p2);
p2.addActionListener(this);
p3=new MenuItem("Patient Report");
menu1.add(p3);
p3.addActionListener(this);
p4=new MenuItem("Patient Bill");
menu1.add(p4);
p4.addActionListener(this);
menu2=new Menu("LOGOUT");
lg=new MenuItem("LOGOUT");
menu2.add(lg);
lg.addActionListener(this);
mbar.add(menu);
mbar.add(menu1);
mbar.add(menu2);
menu.addActionListener(this);
menu1.addActionListener(this);
menu2.addActionListener(this);
setMenuBar(mbar);
wu=new Label("WELCOME USER");
Page 1
pmenu.java
add(wu);
wu.setBounds(280,10,300,50);
wu.setForeground(Color.blue.brighter());
wu.setFont(new Font("Times New Roman",Font.BOLD,30));
if(type==1)
{
un="Patient : ";
}
else if(type==2)
{
un="Doctor : ";
}
ud=new Label(un+user);
add(ud);
ud.setBounds(10,60,300,40);
ud.setForeground(Color.black.brighter());
ud.setFont(new Font("Times New Roman",Font.BOLD,20));
setSize(800,400);
this.setLocation(600,250);
this.setResizable(false);
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
java.sql.Statement st=cn.createStatement();
ResultSet s1=null;
if(ae.getSource()==lg)
{
dispose();
new Login();
}
//Schedule Appointment
else if(ae.getSource()==p1)
{
if(type==1)
{
qry1="Select * from patapp";
s1=st.executeQuery(qry1);
i=0;
while(s1.next())
{
napp[i]=s1.getString(2);
i++;
}
i=0;
while(napp[i]!=null)
{
if(napp[i].equals(user))
{
temp=1;
}
i++;
}
if(temp==1)
Page 2
pmenu.java
{
JOptionPane.showMessageDialog(this,"Appointment already Scheduled
!!!\nTry Cancelling and Rescheduling the Appointment");
}
else
{
dispose();
new Appointment(user,id);
}
}
else
{
JOptionPane.showMessageDialog(this,"Access Restricted !!!");
}
}
//Cancel Appointment
else if(ae.getSource()==p2)
{
if(type==1)
{
qry1="Select * from patapp";
s1=st.executeQuery(qry1);
i=0;
while(s1.next())
{
napp[i]=s1.getString(2);
i++;
}
i=0;
while(napp[i]!=null)
{
if(napp[i].equals(user))
{
temp=1;
}
i++;
}
if(temp==1)
{
int p=JOptionPane.showConfirmDialog(this,"Confirm Appointment
Cancellation ???");
if(p==0)
{
qry="Delete from patapp where Name='"+user+"'";
boolean k=st.execute(qry);
if(k==false)
{
JOptionPane.showMessageDialog(this,"Appointment
Cancellation Successful");
}
else
{
JOptionPane.showMessageDialog(this,"Error\nPlease try again
later...");
}
}
}
else if(temp==0)
{
JOptionPane.showMessageDialog(this,"No Appointment Scheduled !!!");
}
}
else
Page 3
pmenu.java
{
JOptionPane.showMessageDialog(this,"Access Restricted !!!");
}
}
//Patient Report
else if(ae.getSource()==p3)
{
if(type==1)
{
qry1="Select * from pattest";
s1=st.executeQuery(qry1);
int i=0;
while(s1.next())
{
napp[i]=s1.getString(2);
i++;
}
i=0;
while(napp[i]!=null)
{
if(napp[i].equals(user))
{
temp=1;
}
i++;
}
if(temp==1)
{
new patientreport(user,id);
}
else if(temp==0)
{
JOptionPane.showMessageDialog(this,"Tests Not Scheduled !!!\nPlease
try again later...");
}
}
else
{
JOptionPane.showMessageDialog(this,"Access Restricted !!!");
}
}
else if(ae.getSource()==p4)
{
if(type==1)
{
qry1="Select * from pattest";
s1=st.executeQuery(qry1);
int i=0;
while(s1.next())
{
napp[i]=s1.getString(2);
i++;
}
i=0;
while(napp[i]!=null)
{
if(napp[i].equals(user))
{
temp=1;
}
i++;
}
if(temp==1)
Page 4
pmenu.java
{
new Bill(user,id);
}
else if(temp==0)
{
JOptionPane.showMessageDialog(this,"Bill can't be generated at the
moment !!!\nPlease try again later...");
}
}
else
{
JOptionPane.showMessageDialog(this,"Access Restricted !!!");
}
}
else if(ae.getSource()==d2)
{
if(type==2)
{
new Doctorreport(user);
}
else
{
JOptionPane.showMessageDialog(this,"Access Restricted !!!");
}
}
else if(ae.getSource()==d1)
{
if(type==2)
{
new stest(user);
dispose();
}
else
{
JOptionPane.showMessageDialog(this,"Access Restricted !!!");
}
}
else if(ae.getSource()==d3)
{
if(type==2)
{
new dpreport(user);
}
else
{
JOptionPane.showMessageDialog(this,"Access Restricted !!!");
}
}
cn.close();
}
catch(Exception ex)
{
}
}
public static void main(String[] args)
{
new pmenu("","",0);
}
}
Page 5