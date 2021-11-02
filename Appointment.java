import java.awt.BorderLayout;
public class Appointment extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5;
Label head;
JTextField t1,t2,t3,t4,t5;
JComboBox b1,b2,b3,b4;
JButton date,sub,can;
String at[]=new String[5];
String spc="",dn="",apd="",apt="";
String df="Select the Specialization";
String a="",b="";
public Appointment(String user,String id)
{
super("HOSPITAL MANAGEMENT SYSTEM");
getContentPane().setBackground(Color.lightGray);
setLayout(null);
a=user;
b=id;
head=new Label("SCHEDULE APPOINTMENT");
add(head);
head.setBounds(225,20,330,30);
head.setForeground(Color.blue.brighter());
head.setBackground(Color.white);
head.setFont(new Font("Times New Roman",Font.BOLD,25));
l1=new JLabel("Specialization :");
l1.setBounds(20,80,200,30);
add(l1);
l1.setForeground(Color.red.brighter());
l1.setFont(new Font("Times New Roman",Font.BOLD,20));
t1=new JTextField();
t1.setBounds(220,80,250,30);
add(t1);
t1.setBackground(Color.cyan);
t1.setFont(new Font("Times New Roman",Font.PLAIN,18));
b1=new JComboBox();
b1.setBounds(480,80,250,30);
add(b1);
b1.setBackground(Color.blue);
b1.setForeground(Color.white);
b1.addActionListener(this);
b1.addItem(df);
l2=new JLabel("Doctor's Name :");
l2.setBounds(20,120,200,30);
add(l2);
l2.setForeground(Color.red.brighter());
l2.setFont(new Font("Times New Roman",Font.BOLD,20));
t2=new JTextField();
t2.setBounds(220,120,250,30);
add(t2);
t2.setBackground(Color.cyan);
t2.setFont(new Font("Times New Roman",Font.PLAIN,18));
b2=new JComboBox();
b2.setBounds(480,120,250,30);
add(b2);
Page 1
Appointment.java
b2.setBackground(Color.blue);
b2.setForeground(Color.white);
b2.addActionListener(this);
l3=new JLabel("Appointment Date :");
l3.setBounds(20,160,200,30);
add(l3);
l3.setForeground(Color.red.brighter());
l3.setFont(new Font("Times New Roman",Font.BOLD,20));
t3=new JTextField();
t3.setBounds(220,160,200,30);
add(t3);
t3.setBackground(Color.cyan);
t3.setFont(new Font("Times New Roman",Font.PLAIN,18));
date=new JButton("Select the Appointment Date");
date.setBounds(480,160,230,30);
add(date);
date.addActionListener(this);
l4=new JLabel("Appointment Time :");
l4.setBounds(20,200,200,30);
add(l4);
l4.setForeground(Color.red.brighter());
l4.setFont(new Font("Times New Roman",Font.BOLD,20));
t4=new JTextField();
t4.setBounds(220,200,200,30);
add(t4);
t4.setBackground(Color.cyan);
t4.setFont(new Font("Times New Roman",Font.PLAIN,18));
at[0]="Select the Appointment Time";
at[1]="10 AM - 11 AM";
at[2]="12 PM - 1 PM";
at[3]="3 PM - 4 PM";
at[4]="5 PM - 6 PM";
b3=new JComboBox(at);
b3.setBounds(480,200,250,30);
add(b3);
b3.setBackground(Color.blue);
b3.setForeground(Color.white);
b3.addActionListener(this);
sub=new JButton("SUBMIT");
sub.setBounds(200,260,150,50);
add(sub);
sub.addActionListener(this);
sub.setFont(new Font("Times New Roman",Font.BOLD,18));
can=new JButton("CANCEL");
can.setBounds(370,260,150,50);
add(can);
can.addActionListener(this);
can.setFont(new Font("Times New Roman",Font.BOLD,18));
try
{
Connection cn;
DBConnection con=new DBConnection();
cn=con.get_DBConnection();
java.sql.Statement st=cn.createStatement();
Page 2
Appointment.java
ResultSet s1=null;
String qry="Select * from specialization";
s1=st.executeQuery(qry);
while(s1.next())
{
b1.addItem(s1.getString(2));
}
}
catch(Exception ex)
{
}
this.setResizable(false);
this.setLocation(600,200);
setVisible(true);
setSize(760,360);
show();
}
class DatePicker {
int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);;
JLabel l = new JLabel("", JLabel.CENTER);
String day = "";
JDialog d;
JButton[] button = new JButton[49];
public DatePicker() {
d = new JDialog();
d.setModal(true);
String[] header = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };
JPanel p1 = new JPanel(new GridLayout(7, 7));
p1.setPreferredSize(new Dimension(430, 120));
for (int x = 0; x < button.length; x++) {
final int selection = x;
button[x] = new JButton();
button[x].setFocusPainted(false);
button[x].setBackground(Color.white);
if (x > 6)
button[x].addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
day = button[selection].getActionCommand();
d.dispose();
}
});
if (x < 7) {
button[x].setText(header[x]);
button[x].setForeground(Color.red);
}
p1.add(button[x]);
}
JPanel p2 = new JPanel(new GridLayout(1, 3));
JButton previous = new JButton("<< Previous");
previous.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
month--;
displayDate();
}
});
p2.add(previous);
p2.add(l);
JButton next = new JButton("Next >>");
Page 3
Appointment.java
next.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
month++;
displayDate();
}
});
p2.add(next);
d.add(p1, BorderLayout.CENTER);
d.add(p2, BorderLayout.SOUTH);
d.pack();
d.setLocation(1350, 300);
displayDate();
d.setVisible(true);
}
public void displayDate() {
for (int x = 7; x < button.length; x++)
button[x].setText("");
java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
"MMMM yyyy");
java.util.Calendar cal = java.util.Calendar.getInstance();
cal.set(year, month, 1);
int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++)
button[x].setText("" + day);
l.setText(sdf.format(cal.getTime()));
d.setTitle("Date Picker");
}
public String setPickedDate() {
if (day.equals(""))
return day;
java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
"yyyy-MM-dd");
java.util.Calendar cal = java.util.Calendar.getInstance();
cal.set(year, month, Integer.parseInt(day));
return sdf.format(cal.getTime());
}
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
if(ae.getSource()==can)
{
dispose();
new pmenu(a,b,1);
}
else if(ae.getSource()==date)
{
t3.setText(new DatePicker().setPickedDate());
apd=t3.getText();
}
else if(ae.getSource()==b3)
{
t4.setText(apt);
Page 4
Appointment.java
apt=b3.getSelectedItem().toString();
t4.setText(apt);
}
else if(ae.getSource()==b2)
{
t2.setText(dn);
dn=b2.getSelectedItem().toString();
t2.setText(dn);
}
else if(ae.getSource()==b1)
{
b2.removeAllItems();
t1.setText(spc);
spc=b1.getSelectedItem().toString();
t1.setText(spc);
String qry1="Select * from doctor where specialization='"+spc+"'";
s1=st.executeQuery(qry1);
while(s1.next())
{
b2.addItem(s1.getString(2));
}
}
else if(ae.getSource()==sub)
{
String qry3="Insert into
patapp(name,id,specialization,doctorname,appointmentdate,appointmenttime)
values('"+a+"','"+b+"','"+spc+"','"+dn+"','"+apd+"','"+apt+"')";
boolean k=st.execute(qry3);
if(k==false)
{
JOptionPane.showMessageDialog(this,"Appointment Scheduled
Successfully...");
dispose();
new pmenu(a,b,1);
}
else
{
JOptionPane.showMessageDialog(this,"Error in Submission");
}
}
}
catch(Exception ex)
{
}
}
public static void main(String[] args)
{
new Appointment("","");
}
}
Page