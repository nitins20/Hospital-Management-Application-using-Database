import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.*;
public class dpreport extends JFrame implements ActionListener
{
Label head;
JComboBox j1;
String b="",qry="",pn="",id="";
JButton gb,c;
JTextField t1;
public dpreport(String user)
{
super("Patient Report");
setLayout(null);
getContentPane().setBackground(Color.lightGray);
b=user;
head=new Label("PATIENT REPORT");
head.setBounds(200,20,300,30);
add(head);
head.setForeground(Color.black.brighter());
head.setFont(new Font("Times New Roman",Font.BOLD,30));
t1=new JTextField();
t1.setBounds(200,80,270,40);
add(t1);
t1.setBackground(Color.white);
t1.setForeground(Color.black);
t1.setFont(new Font("Times New Roman",Font.BOLD,18));
j1=new JComboBox();
add(j1);
j1.setBounds(160,130,350,40);
j1.setBackground(Color.blue.brighter());
j1.setFont(new Font("Times New Roman",Font.BOLD,16));
j1.setForeground(Color.white);
j1.addActionListener(this);
j1.addItem("SELECT THE PATIENT");
try
{
Connection cn;
DBConnection con=new DBConnection();
cn=con.get_DBConnection();
java.sql.Statement st=cn.createStatement();
ResultSet s1=null;
qry="Select * from patapp where doctorname='"+b+"'";
s1=st.executeQuery(qry);
while(s1.next())
{
j1.addItem(s1.getString(2));
}
}
catch(Exception ex)
Page 1
dpreport.java
{
}
gb=new JButton("SHOW REPORT");
gb.setBounds(90,250,200,50);
gb.setFont(new Font("Times New Roman",Font.BOLD,17));
gb.setBackground(Color.MAGENTA);
gb.setForeground(Color.BLACK);
gb.addActionListener(this);
add(gb);
c=new JButton("CANCEL");
c.setBounds(310,250,200,50);
c.setFont(new Font("Times New Roman",Font.BOLD,17));
c.setBackground(Color.MAGENTA);
c.setForeground(Color.BLACK);
c.addActionListener(this);
add(c);
setVisible(true);
setSize(630,350);
this.setLocation(600,250);
this.setResizable(false);
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
if(ae.getSource()==c)
{
dispose();
new Login();
}
else if(ae.getSource()==j1)
{
pn=j1.getSelectedItem().toString();
t1.setText(pn);
}
else if(ae.getSource()==gb)
{
qry="select * from patdetails where Name='"+pn+"'";
s1=st.executeQuery(qry);
if(s1.next())
{
id=s1.getString(10);
}
if(pn=="SELECT THE PATIENT")
{
JOptionPane.showMessageDialog(this,"Select the Patient !!!");
}
else if(pn!="SELECT THE PATIENT")
{
dispose();
new patientreport(pn,id);
}
}
cn.close();
Page 2
dpreport.java
}
catch(Exception ex)
{
}
}
public static void main(String[] args)
{
new dpreport("");
}
}