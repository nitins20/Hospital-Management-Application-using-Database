public class stest extends JFrame implements ActionListener
{
Label head;
Label
l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l
25,l26,l27,l28,l29,l30;
Label
l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50,l51,l52,
l53,l54,l55,l56,l57,l58,l59,l60;
JComboBox j1;
JTextField t4;
JButton gb,c;
JCheckBox
e1,e2,e3,e4,e5,o1,o2,o3,o4,o5,g1,g2,g3,g4,g5,gs1,gs2,gs3,gs4,gs5,p1,p2,p3,p4,p5;
String qry,b,pn,spc,qry1,id;
String e[]=new String[5];
String p[]=new String[5];
String pname[]=new String[100];
int k=0,tot,n=0,i=0,z=0,temp=0;
public stest(String user)
{
super("Schedule Test");
setLayout(null);
getContentPane().setBackground(Color.lightGray);
b=user;
head=new Label("SCHEDULE TEST");
head.setBounds(200,20,300,30);
add(head);
head.setForeground(Color.black.brighter());
head.setFont(new Font("Times New Roman",Font.BOLD,30));
j1=new JComboBox();
add(j1);
j1.setBounds(160,80,350,40);
j1.setBackground(Color.blue.brighter());
j1.setFont(new Font("Times New Roman",Font.BOLD,16));
j1.setForeground(Color.white);
j1.addActionListener(this);
j1.addItem("SELECT THE PATIENT");
e1=new JCheckBox();
e1.setBounds(50,180,30,30);
e1.addActionListener(this);
e1.setBackground(Color.lightGray);
l9=new Label("Rs.500");
l9.setBounds(220,180,200,30);
l9.setForeground(Color.blue.brighter());
l9.setFont(new Font("Times New Roman",Font.BOLD,15));
l4=new Label("Audiology");
l4.setBounds(100,180,200,30);
l4.setForeground(Color.blue.brighter());
l4.setFont(new Font("Times New Roman",Font.BOLD,15));
e2=new JCheckBox();
e2.setBounds(50,220,30,30);
e2.addActionListener(this);
e2.setBackground(Color.lightGray);
Page 1
stest.java
l10=new Label("Rs.550");
l10.setBounds(220,220,200,30);
l10.setForeground(Color.blue.brighter());
l10.setFont(new Font("Times New Roman",Font.BOLD,15));
l5=new Label("Endoscopy");
l5.setBounds(100,220,200,30);
l5.setForeground(Color.blue.brighter());
l5.setFont(new Font("Times New Roman",Font.BOLD,15));
e3=new JCheckBox();
e3.setBounds(50,260,30,30);
e3.addActionListener(this);
e3.setBackground(Color.lightGray);
l11=new Label("Rs.325");
l11.setBounds(220,260,200,30);
l11.setForeground(Color.blue.brighter());
l11.setFont(new Font("Times New Roman",Font.BOLD,15));
l6=new Label("Audiometry");
l6.setBounds(100,260,200,30);
l6.setForeground(Color.blue.brighter());
l6.setFont(new Font("Times New Roman",Font.BOLD,15));
e4=new JCheckBox();
e4.setBounds(50,300,30,30);
e4.addActionListener(this);
e4.setBackground(Color.lightGray);
l12=new Label("Rs.1050");
l12.setBounds(220,300,200,30);
l12.setForeground(Color.blue.brighter());
l12.setFont(new Font("Times New Roman",Font.BOLD,15));
l7=new Label("Weber Test");
l7.setBounds(100,300,200,30);
l7.setForeground(Color.blue.brighter());
l7.setFont(new Font("Times New Roman",Font.BOLD,15));
e5=new JCheckBox();
e5.setBounds(50,340,30,30);
e5.addActionListener(this);
e5.setBackground(Color.lightGray);
l13=new Label("Rs.1500");
l13.setBounds(220,340,200,30);
l13.setForeground(Color.blue.brighter());
l13.setFont(new Font("Times New Roman",Font.BOLD,15));
l8=new Label("Rinne Test");
l8.setBounds(100,340,200,30);
l8.setForeground(Color.blue.brighter());
l8.setFont(new Font("Times New Roman",Font.BOLD,15));
o1=new JCheckBox();
o1.setBounds(50,180,30,30);
o1.addActionListener(this);
o1.setBackground(Color.lightGray);
l14=new Label("Rs.300");
l14.setBounds(220,180,200,30);
Page 2
stest.java
l14.setForeground(Color.blue.brighter());
l14.setFont(new Font("Times New Roman",Font.BOLD,15));
l15=new Label("Arthrography");
l15.setBounds(100,180,200,30);
l15.setForeground(Color.blue.brighter());
l15.setFont(new Font("Times New Roman",Font.BOLD,15));
o2=new JCheckBox();
o2.setBounds(50,220,30,30);
o2.addActionListener(this);
o2.setBackground(Color.lightGray);
l16=new Label("Rs.750");
l16.setBounds(220,220,200,30);
l16.setForeground(Color.blue.brighter());
l16.setFont(new Font("Times New Roman",Font.BOLD,15));
l17=new Label("Bone Scan");
l17.setBounds(100,220,200,30);
l17.setForeground(Color.blue.brighter());
l17.setFont(new Font("Times New Roman",Font.BOLD,15));
o3=new JCheckBox();
o3.setBounds(50,260,30,30);
o3.addActionListener(this);
o3.setBackground(Color.lightGray);
l18=new Label("Rs.325");
l18.setBounds(220,260,200,30);
l18.setForeground(Color.blue.brighter());
l18.setFont(new Font("Times New Roman",Font.BOLD,15));
l19=new Label("CT Scan");
l19.setBounds(100,260,200,30);
l19.setForeground(Color.blue.brighter());
l19.setFont(new Font("Times New Roman",Font.BOLD,15));
o4=new JCheckBox();
o4.setBounds(50,300,30,30);
o4.addActionListener(this);
o4.setBackground(Color.lightGray);
l20=new Label("Rs.1450");
l20.setBounds(220,300,200,30);
l20.setForeground(Color.blue.brighter());
l20.setFont(new Font("Times New Roman",Font.BOLD,15));
l21=new Label("Discography");
l21.setBounds(100,300,200,30);
l21.setForeground(Color.blue.brighter());
l21.setFont(new Font("Times New Roman",Font.BOLD,15));
o5=new JCheckBox();
o5.setBounds(50,340,30,30);
o5.addActionListener(this);
o5.setBackground(Color.lightGray);
l22=new Label("Rs.1900");
l22.setBounds(220,340,200,30);
Page 3
stest.java
l22.setForeground(Color.blue.brighter());
l22.setFont(new Font("Times New Roman",Font.BOLD,15));
l23=new Label("UltraSound");
l23.setBounds(100,340,200,30);
l23.setForeground(Color.blue.brighter());
l23.setFont(new Font("Times New Roman",Font.BOLD,15));
g1=new JCheckBox();
g1.setBounds(50,180,30,30);
g1.addActionListener(this);
g1.setBackground(Color.lightGray);
l24=new Label("Rs.900");
l24.setBounds(220,180,200,30);
l24.setForeground(Color.blue.brighter());
l24.setFont(new Font("Times New Roman",Font.BOLD,15));
l25=new Label("Colposcopy");
l25.setBounds(100,180,200,30);
l25.setForeground(Color.blue.brighter());
l25.setFont(new Font("Times New Roman",Font.BOLD,15));
g2=new JCheckBox();
g2.setBounds(50,220,30,30);
g2.addActionListener(this);
g2.setBackground(Color.lightGray);
l26=new Label("Rs.850");
l26.setBounds(220,220,200,30);
l26.setForeground(Color.blue.brighter());
l26.setFont(new Font("Times New Roman",Font.BOLD,15));
l27=new Label("Biopsy");
l27.setBounds(100,220,200,30);
l27.setForeground(Color.blue.brighter());
l27.setFont(new Font("Times New Roman",Font.BOLD,15));
g3=new JCheckBox();
g3.setBounds(50,260,30,30);
g3.addActionListener(this);
g3.setBackground(Color.lightGray);
l28=new Label("Rs.725");
l28.setBounds(220,260,200,30);
l28.setForeground(Color.blue.brighter());
l28.setFont(new Font("Times New Roman",Font.BOLD,15));
l29=new Label("Pap Test");
l29.setBounds(100,260,200,30);
l29.setForeground(Color.blue.brighter());
l29.setFont(new Font("Times New Roman",Font.BOLD,15));
g4=new JCheckBox();
g4.setBounds(50,300,30,30);
g4.addActionListener(this);
g4.setBackground(Color.lightGray);
l30=new Label("Rs.2550");
l30.setBounds(220,300,200,30);
l30.setForeground(Color.blue.brighter());
l30.setFont(new Font("Times New Roman",Font.BOLD,15));
Page 4
stest.java
l31=new Label("Mastectomy");
l31.setBounds(100,300,200,30);
l31.setForeground(Color.blue.brighter());
l31.setFont(new Font("Times New Roman",Font.BOLD,15));
g5=new JCheckBox();
g5.setBounds(50,340,30,30);
g5.addActionListener(this);
g5.setBackground(Color.lightGray);
l32=new Label("Rs.3500");
l32.setBounds(220,340,200,30);
l32.setForeground(Color.blue.brighter());
l32.setFont(new Font("Times New Roman",Font.BOLD,15));
l33=new Label("D&C");
l33.setBounds(100,340,200,30);
l33.setForeground(Color.blue.brighter());
l33.setFont(new Font("Times New Roman",Font.BOLD,15));
gs1=new JCheckBox();
gs1.setBounds(50,180,30,30);
gs1.addActionListener(this);
gs1.setBackground(Color.lightGray);
l34=new Label("Rs.1200");
l34.setBounds(220,180,200,30);
l34.setForeground(Color.blue.brighter());
l34.setFont(new Font("Times New Roman",Font.BOLD,15));
l35=new Label("Blood Test");
l35.setBounds(100,180,200,30);
l35.setForeground(Color.blue.brighter());
l35.setFont(new Font("Times New Roman",Font.BOLD,15));
gs2=new JCheckBox();
gs2.setBounds(50,220,30,30);
gs2.addActionListener(this);
gs2.setBackground(Color.lightGray);
l36=new Label("Rs.950");
l36.setBounds(220,220,200,30);
l36.setForeground(Color.blue.brighter());
l36.setFont(new Font("Times New Roman",Font.BOLD,15));
l37=new Label("ECG");
l37.setBounds(100,220,200,30);
l37.setForeground(Color.blue.brighter());
l37.setFont(new Font("Times New Roman",Font.BOLD,15));
gs3=new JCheckBox();
gs3.setBounds(50,260,30,30);
gs3.addActionListener(this);
gs3.setBackground(Color.lightGray);
l38=new Label("Rs.525");
l38.setBounds(220,260,200,30);
l38.setForeground(Color.blue.brighter());
l38.setFont(new Font("Times New Roman",Font.BOLD,15));
l39=new Label("X-Ray");
l39.setBounds(100,260,200,30);
Page 5
stest.java
l39.setForeground(Color.blue.brighter());
l39.setFont(new Font("Times New Roman",Font.BOLD,15));
gs4=new JCheckBox();
gs4.setBounds(50,300,30,30);
gs4.addActionListener(this);
gs4.setBackground(Color.lightGray);
l40=new Label("Rs.1150");
l40.setBounds(220,300,200,30);
l40.setForeground(Color.blue.brighter());
l40.setFont(new Font("Times New Roman",Font.BOLD,15));
l41=new Label("Lungs Test");
l41.setBounds(100,300,200,30);
l41.setForeground(Color.blue.brighter());
l41.setFont(new Font("Times New Roman",Font.BOLD,15));
gs5=new JCheckBox();
gs5.setBounds(50,340,30,30);
gs5.addActionListener(this);
gs5.setBackground(Color.lightGray);
l42=new Label("Rs.4500");
l42.setBounds(220,340,200,30);
l42.setForeground(Color.blue.brighter());
l42.setFont(new Font("Times New Roman",Font.BOLD,15));
l43=new Label("MRI Scan");
l43.setBounds(100,340,200,30);
l43.setForeground(Color.blue.brighter());
l43.setFont(new Font("Times New Roman",Font.BOLD,15));
p1=new JCheckBox();
p1.setBounds(50,180,30,30);
p1.addActionListener(this);
p1.setBackground(Color.lightGray);
l44=new Label("Rs.400");
l44.setBounds(220,180,200,30);
l44.setForeground(Color.blue.brighter());
l44.setFont(new Font("Times New Roman",Font.BOLD,15));
l45=new Label("CAT");
l45.setBounds(100,180,200,30);
l45.setForeground(Color.blue.brighter());
l45.setFont(new Font("Times New Roman",Font.BOLD,15));
p2=new JCheckBox();
p2.setBounds(50,220,30,30);
p2.addActionListener(this);
p2.setBackground(Color.lightGray);
l46=new Label("Rs.550");
l46.setBounds(220,220,200,30);
l46.setForeground(Color.blue.brighter());
l46.setFont(new Font("Times New Roman",Font.BOLD,15));
l47=new Label("CDI");
l47.setBounds(100,220,200,30);
l47.setForeground(Color.blue.brighter());
l47.setFont(new Font("Times New Roman",Font.BOLD,15));
Page 6
stest.java
p3=new JCheckBox();
p3.setBounds(50,260,30,30);
p3.addActionListener(this);
p3.setBackground(Color.lightGray);
l48=new Label("Rs.625");
l48.setBounds(220,260,200,30);
l48.setForeground(Color.blue.brighter());
l48.setFont(new Font("Times New Roman",Font.BOLD,15));
l49=new Label("CSI");
l49.setBounds(100,260,200,30);
l49.setForeground(Color.blue.brighter());
l49.setFont(new Font("Times New Roman",Font.BOLD,15));
p4=new JCheckBox();
p4.setBounds(50,300,30,30);
p4.addActionListener(this);
p4.setBackground(Color.lightGray);
l50=new Label("Rs.2050");
l50.setBounds(220,300,200,30);
l50.setForeground(Color.blue.brighter());
l50.setFont(new Font("Times New Roman",Font.BOLD,15));
l51=new Label("CMS");
l51.setBounds(100,300,200,30);
l51.setForeground(Color.blue.brighter());
l51.setFont(new Font("Times New Roman",Font.BOLD,15));
p5=new JCheckBox();
p5.setBounds(50,340,30,30);
p5.addActionListener(this);
p5.setBackground(Color.lightGray);
l52=new Label("Rs.2500");
l52.setBounds(220,340,200,30);
l52.setForeground(Color.blue.brighter());
l52.setFont(new Font("Times New Roman",Font.BOLD,15));
l53=new Label("CTMT");
l53.setBounds(100,340,200,30);
l53.setForeground(Color.blue.brighter());
l53.setFont(new Font("Times New Roman",Font.BOLD,15));
l54=new Label("Total Amount");
l54.setBounds(470,200,200,30);
add(l54);
l54.setForeground(Color.red.brighter());
l54.setFont(new Font("Times New Roman",Font.BOLD,15));
t4=new JTextField();
t4.setBounds(420,240,210,30);
add(t4);
t4.setBackground(Color.cyan);
t4.setFont(new Font("Times New Roman",Font.PLAIN,18));
gb=new JButton("SUBMIT");
gb.setBounds(90,400,200,50);
gb.setFont(new Font("Times New Roman",Font.BOLD,17));
gb.setBackground(Color.MAGENTA);
gb.setForeground(Color.BLACK);
gb.addActionListener(this);
add(gb);
Page 7
stest.java
c=new JButton("CANCEL");
c.setBounds(310,400,200,50);
c.setFont(new Font("Times New Roman",Font.BOLD,17));
c.setBackground(Color.MAGENTA);
c.setForeground(Color.BLACK);
c.addActionListener(this);
add(c);
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
catch(Exception e)
{
System.out.println(e);
}
setVisible(true);
setSize(650,500);
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
if (ae.getSource()==c)
{
dispose();
new pmenu(b,"",2);
}
else if(ae.getSource()==gb)
{
qry = "Update pattest set
test1='"+e[0]+"',test2='"+e[1]+"',test3='"+e[2]+"',test4='"+e[3]+"',test5='"+e[4]+"',to
tal='"+String.valueOf(tot)+"',test1price='"+p[0]+"',test2price='"+p[1]+"',test3price='"+
p[2]+"',test4price='"+p[3]+"',test5price='"+p[4]+"' where (Name='"+pn+"')";
int k=st.executeUpdate(qry);
if(n==0)
{
JOptionPane.showMessageDialog(this, "Tests Scheduled");
dispose();
Page 8
stest.java
new pmenu(b,"",2);
}
else if(n==1)
{
JOptionPane.showMessageDialog(this, "Error");
}
}
else if(ae.getSource()==j1)
{
pn=j1.getSelectedItem().toString();
qry1="Select * from patapp where name='"+pn+"'";
s1=st.executeQuery(qry1);
if(s1.next())
{
spc=s1.getString(4);
id=s1.getString(3);
}
qry="Select * from pattest";
s1=st.executeQuery(qry);
int r=0;
while(s1.next())
{
pname[r]=s1.getString(2);
r++;
}
r=0;
while(pname[r]!=null)
{
if(pn.equals(pname[r]))
{
temp=1;
}
r++;
}
if(temp==1)
{
i=JOptionPane.showConfirmDialog(this,"Tests Already Scheduled !!!\nDo you
want to update or reschedule ???");
if(i==1)
{
dispose();
new pmenu(b,"",2);
}
else if(i==0)
{
qry="Delete from pattest where Name='"+pn+"'";
st.execute(qry);
qry1="Select * from patapp where name='"+pn+"'";
s1=st.executeQuery(qry1);
if(s1.next())
{
spc=s1.getString(4);
id=s1.getString(3);
}
qry="Insert into pattest(name,id) values('"+pn+"','"+id+"')";
st.execute(qry);
if(spc.equals("ENT"))
{
remove(l14); remove(l15); remove(l16); remove(l17); remove(l18);
remove(l19); remove(l20); remove(l21); remove(l22); remove(l23);
remove(o1); remove(o2); remove(o3); remove(o4); remove(o5);
Page 9
stest.java
remove(l24); remove(l25); remove(l26); remove(l27); remove(l28);
remove(l29); remove(l30); remove(l31); remove(l32); remove(l33);
remove(g1); remove(g2); remove(g3); remove(g4); remove(g5);
remove(l34); remove(l35); remove(l36); remove(l37); remove(l38);
remove(l39); remove(l40); remove(l41); remove(l42); remove(l43);
remove(gs1); remove(gs2); remove(gs3); remove(gs4); remove(gs5);
remove(l44); remove(l45); remove(l46); remove(l47); remove(l48);
remove(l49); remove(l50); remove(l51); remove(l52); remove(l53);
remove(p1); remove(p2); remove(p3); remove(p4); remove(p5);
add(l9); add(l10); add(l11); add(l12); add(l13);add(l4);
add(l5); add(l6); add(l7); add(l8);
add(e1); add(e2); add(e3); add(e4); add(e5);
repaint();
}
else if(spc.equals("Orthopedics"))
{
remove(l9); remove(l10); remove(l11); remove(l12);
remove(l13);remove(l4);
remove(l5); remove(l6); remove(l7); remove(l8);
remove(e1); remove(e2); remove(e3); remove(e4); remove(e5);
remove(l24); remove(l25); remove(l26); remove(l27); remove(l28);
remove(l29); remove(l30); remove(l31); remove(l32); remove(l33);
remove(g1); remove(g2); remove(g3); remove(g4); remove(g5);
remove(l34); remove(l35); remove(l36); remove(l37); remove(l38);
remove(l39); remove(l40); remove(l41); remove(l42); remove(l43);
remove(gs1); remove(gs2); remove(gs3); remove(gs4); remove(gs5);
remove(l44); remove(l45); remove(l46); remove(l47); remove(l48);
remove(l49); remove(l50); remove(l51); remove(l52); remove(l53);
remove(p1); remove(p2); remove(p3); remove(p4); remove(p5);
add(l14); add(l15); add(l16); add(l17); add(l18);
add(l19); add(l20); add(l21); add(l22); add(l23);
add(o1); add(o2); add(o3); add(o4); add(o5);
repaint();
}
else if(spc.equals("Gynecology"))
{
remove(l9); remove(l10); remove(l11); remove(l12);
remove(l13);remove(l4);
remove(l5); remove(l6); remove(l7); remove(l8);
remove(e1); remove(e2); remove(e3); remove(e4); remove(e5);
remove(l14); remove(l15); remove(l16); remove(l17); remove(l18);
remove(l19); remove(l20); remove(l21); remove(l22); remove(l23);
remove(o1); remove(o2); remove(o3); remove(o4); remove(o5);
remove(l34); remove(l35); remove(l36); remove(l37); remove(l38);
remove(l39); remove(l40); remove(l41); remove(l42); remove(l43);
remove(gs1); remove(gs2); remove(gs3); remove(gs4); remove(gs5);
remove(l44); remove(l45); remove(l46); remove(l47); remove(l48);
remove(l49); remove(l50); remove(l51); remove(l52); remove(l53);
remove(p1); remove(p2); remove(p3); remove(p4); remove(p5);
add(l24); add(l25); add(l26); add(l27); add(l28);
add(l29); add(l30); add(l31); add(l32); add(l33);
add(g1); add(g2); add(g3); add(g4); add(g5);
repaint();
Page 10
stest.java
}
else if(spc.equals("General Surgery"))
{
remove(l9); remove(l10); remove(l11); remove(l12);
remove(l13);remove(l4);
remove(l5); remove(l6); remove(l7); remove(l8);
remove(e1); remove(e2); remove(e3); remove(e4); remove(e5);
remove(l14); remove(l15); remove(l16); remove(l17); remove(l18);
remove(l19); remove(l20); remove(l21); remove(l22); remove(l23);
remove(o1); remove(o2); remove(o3); remove(o4); remove(o5);
remove(l24); remove(l25); remove(l26); remove(l27); remove(l28);
remove(l29); remove(l30); remove(l31); remove(l32); remove(l33);
remove(g1); remove(g2); remove(g3); remove(g4); remove(g5);
remove(l44); remove(l45); remove(l46); remove(l47); remove(l48);
remove(l49); remove(l50); remove(l51); remove(l52); remove(l53);
remove(p1); remove(p2); remove(p3); remove(p4); remove(p5);
add(l34); add(l35); add(l36); add(l37); add(l38);
add(l39); add(l40); add(l41); add(l42); add(l43);
add(gs1); add(gs2); add(gs3); add(gs4); add(gs5);
repaint();
}
else if(spc.equals("Psychiatry"))
{
remove(l9); remove(l10); remove(l11); remove(l12);
remove(l13);remove(l4);
remove(l5); remove(l6); remove(l7); remove(l8);
remove(e1); remove(e2); remove(e3); remove(e4); remove(e5);
remove(l14); remove(l15); remove(l16); remove(l17); remove(l18);
remove(l19); remove(l20); remove(l21); remove(l22); remove(l23);
remove(o1); remove(o2); remove(o3); remove(o4); remove(o5);
remove(l24); remove(l25); remove(l26); remove(l27); remove(l28);
remove(l29); remove(l30); remove(l31); remove(l32); remove(l33);
remove(g1); remove(g2); remove(g3); remove(g4); remove(g5);
remove(l34); remove(l35); remove(l36); remove(l37); remove(l38);
remove(l39); remove(l40); remove(l41); remove(l42); remove(l43);
remove(gs1); remove(gs2); remove(gs3); remove(gs4); remove(gs5);
add(l44); add(l45); add(l46); add(l47); add(l48);
add(l49); add(l50); add(l51); add(l52); add(l53);
add(p1); add(p2); add(p3); add(p4); add(p5);
repaint();
}
}
}
else if(temp==0)
{
if(pn!="SELECT THE PATIENT")
{
qry="Insert into pattest(name,id) values('"+pn+"','"+id+"')";
st.execute(qry);
}
if(spc.equals("ENT"))
{
remove(l14); remove(l15); remove(l16); remove(l17); remove(l18);
remove(l19); remove(l20); remove(l21); remove(l22); remove(l23);
remove(o1); remove(o2); remove(o3); remove(o4); remove(o5);
Page 11
stest.java
remove(l24); remove(l25); remove(l26); remove(l27); remove(l28);
remove(l29); remove(l30); remove(l31); remove(l32); remove(l33);
remove(g1); remove(g2); remove(g3); remove(g4); remove(g5);
remove(l34); remove(l35); remove(l36); remove(l37); remove(l38);
remove(l39); remove(l40); remove(l41); remove(l42); remove(l43);
remove(gs1); remove(gs2); remove(gs3); remove(gs4); remove(gs5);
remove(l44); remove(l45); remove(l46); remove(l47); remove(l48);
remove(l49); remove(l50); remove(l51); remove(l52); remove(l53);
remove(p1); remove(p2); remove(p3); remove(p4); remove(p5);
add(l9); add(l10); add(l11); add(l12); add(l13);add(l4);
add(l5); add(l6); add(l7); add(l8);
add(e1); add(e2); add(e3); add(e4); add(e5);
repaint();
}
else if(spc.equals("Orthopedics"))
{
remove(l9); remove(l10); remove(l11); remove(l12); remove(l13);remove(l4);
remove(l5); remove(l6); remove(l7); remove(l8);
remove(e1); remove(e2); remove(e3); remove(e4); remove(e5);
remove(l24); remove(l25); remove(l26); remove(l27); remove(l28);
remove(l29); remove(l30); remove(l31); remove(l32); remove(l33);
remove(g1); remove(g2); remove(g3); remove(g4); remove(g5);
remove(l34); remove(l35); remove(l36); remove(l37); remove(l38);
remove(l39); remove(l40); remove(l41); remove(l42); remove(l43);
remove(gs1); remove(gs2); remove(gs3); remove(gs4); remove(gs5);
remove(l44); remove(l45); remove(l46); remove(l47); remove(l48);
remove(l49); remove(l50); remove(l51); remove(l52); remove(l53);
remove(p1); remove(p2); remove(p3); remove(p4); remove(p5);
add(l14); add(l15); add(l16); add(l17); add(l18);
add(l19); add(l20); add(l21); add(l22); add(l23);
add(o1); add(o2); add(o3); add(o4); add(o5);
repaint();
}
else if(spc.equals("Gynecology"))
{
remove(l9); remove(l10); remove(l11); remove(l12); remove(l13);remove(l4);
remove(l5); remove(l6); remove(l7); remove(l8);
remove(e1); remove(e2); remove(e3); remove(e4); remove(e5);
remove(l14); remove(l15); remove(l16); remove(l17); remove(l18);
remove(l19); remove(l20); remove(l21); remove(l22); remove(l23);
remove(o1); remove(o2); remove(o3); remove(o4); remove(o5);
remove(l34); remove(l35); remove(l36); remove(l37); remove(l38);
remove(l39); remove(l40); remove(l41); remove(l42); remove(l43);
remove(gs1); remove(gs2); remove(gs3); remove(gs4); remove(gs5);
remove(l44); remove(l45); remove(l46); remove(l47); remove(l48);
remove(l49); remove(l50); remove(l51); remove(l52); remove(l53);
remove(p1); remove(p2); remove(p3); remove(p4); remove(p5);
add(l24); add(l25); add(l26); add(l27); add(l28);
add(l29); add(l30); add(l31); add(l32); add(l33);
add(g1); add(g2); add(g3); add(g4); add(g5);
repaint();
}
else if(spc.equals("General Surgery"))
Page 12
stest.java
{
remove(l9); remove(l10); remove(l11); remove(l12); remove(l13);remove(l4);
remove(l5); remove(l6); remove(l7); remove(l8);
remove(e1); remove(e2); remove(e3); remove(e4); remove(e5);
remove(l14); remove(l15); remove(l16); remove(l17); remove(l18);
remove(l19); remove(l20); remove(l21); remove(l22); remove(l23);
remove(o1); remove(o2); remove(o3); remove(o4); remove(o5);
remove(l24); remove(l25); remove(l26); remove(l27); remove(l28);
remove(l29); remove(l30); remove(l31); remove(l32); remove(l33);
remove(g1); remove(g2); remove(g3); remove(g4); remove(g5);
remove(l44); remove(l45); remove(l46); remove(l47); remove(l48);
remove(l49); remove(l50); remove(l51); remove(l52); remove(l53);
remove(p1); remove(p2); remove(p3); remove(p4); remove(p5);
add(l34); add(l35); add(l36); add(l37); add(l38);
add(l39); add(l40); add(l41); add(l42); add(l43);
add(gs1); add(gs2); add(gs3); add(gs4); add(gs5);
repaint();
}
else if(spc.equals("Psychiatry"))
{
remove(l9); remove(l10); remove(l11); remove(l12); remove(l13);remove(l4);
remove(l5); remove(l6); remove(l7); remove(l8);
remove(e1); remove(e2); remove(e3); remove(e4); remove(e5);
remove(l14); remove(l15); remove(l16); remove(l17); remove(l18);
remove(l19); remove(l20); remove(l21); remove(l22); remove(l23);
remove(o1); remove(o2); remove(o3); remove(o4); remove(o5);
remove(l24); remove(l25); remove(l26); remove(l27); remove(l28);
remove(l29); remove(l30); remove(l31); remove(l32); remove(l33);
remove(g1); remove(g2); remove(g3); remove(g4); remove(g5);
remove(l34); remove(l35); remove(l36); remove(l37); remove(l38);
remove(l39); remove(l40); remove(l41); remove(l42); remove(l43);
remove(gs1); remove(gs2); remove(gs3); remove(gs4); remove(gs5);
add(l44); add(l45); add(l46); add(l47); add(l48);
add(l49); add(l50); add(l51); add(l52); add(l53);
add(p1); add(p2); add(p3); add(p4); add(p5);
repaint();
}
}
}
else
{
if(ae.getSource()==e1)
{
if(e1.isSelected())
{
tot=tot+500;
e[k]=l4.getText();
p[k]=l9.getText();
k=k+1;
}else if(e1.isSelected()==false)
{
tot=tot-500;
k=k-1;
for(int l=0;l<5;l++)
{
Page 13
stest.java
if(e[l].equals(l4.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==e2)
{
if(e2.isSelected())
{
tot=tot+550;
e[k]=l5.getText();
p[k]=l10.getText();
k=k+1;
}else
{
tot=tot-550;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l5.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==e3)
{
if(e3.isSelected())
{
tot=tot+325;
e[k]=l6.getText();
p[k]=l11.getText();
k=k+1;
}else
{
tot=tot-325;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l6.getText()))
{
while(l<4)
{
e[l]=e[l+1];
Page 14
stest.java
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==e4)
{
if(e4.isSelected())
{
tot=tot+1050;
e[k]=l7.getText();
p[k]=l12.getText();
k=k+1;
}else
{
tot=tot-1050;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l7.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==e5)
{
if(e5.isSelected())
{
tot=tot+1500;
e[k]=l8.getText();
p[k]=l13.getText();
k=k+1;
}else
{
tot=tot-1500;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l8.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
if(l==4)
Page 15
stest.java
{
e[l]="";
p[l]="";
}
}
}
}
}
if(ae.getSource()==o1)
{
if(o1.isSelected())
{
tot=tot+300;
e[k]=l15.getText();
p[k]=l14.getText();
k=k+1;
}else
{
tot=tot-300;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l15.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==o2)
{
if(o2.isSelected())
{
tot=tot+750;
e[k]=l17.getText();
p[k]=l16.getText();
k=k+1;
}else
{
tot=tot-750;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l17.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
Page 16
stest.java
}
}
}
}
if(ae.getSource()==o3)
{
if(o3.isSelected())
{
tot=tot+325;
e[k]=l19.getText();
p[k]=l18.getText();
k=k+1;
}else
{
tot=tot-325;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l19.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==o4)
{
if(o4.isSelected())
{
tot=tot+1450;
e[k]=l21.getText();
p[k]=l20.getText();
k=k+1;
}else
{
tot=tot-1450;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l21.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==o5)
Page 17
stest.java
{
if(o5.isSelected())
{
tot=tot+1900;
e[k]=l23.getText();
p[k]=l22.getText();
k=k+1;
}else
{
tot=tot-1900;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l23.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
if(l==4)
{
e[l]="";
p[l]="";
}
}
}
}
}
else if(ae.getSource()==g1)
{
if(g1.isSelected())
{
tot=tot+900;
e[k]=l25.getText();
p[k]=l24.getText();
k=k+1;
}else
{
tot=tot-900;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l25.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==g2)
{
if(g2.isSelected())
Page 18
stest.java
{
tot=tot+850;
e[k]=l27.getText();
p[k]=l26.getText();
k=k+1;
}else
{
tot=tot-850;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l27.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==g3)
{
if(g3.isSelected())
{
tot=tot+725;
e[k]=l29.getText();
p[k]=l28.getText();
k=k+1;
}else
{
tot=tot-725;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l29.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==g4)
{
if(g4.isSelected())
{
tot=tot+2550;
e[k]=l31.getText();
p[k]=l30.getText();
k=k+1;
}else
{
tot=tot-2550;
Page 19
stest.java
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l31.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==g5)
{
if(g5.isSelected())
{
tot=tot+3500;
e[k]=l33.getText();
p[k]=l32.getText();
k=k+1;
}else
{
tot=tot-3500;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l33.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
if(l==4)
{
e[l]="";
p[l]="";
}
}
}
}
}
else if(ae.getSource()==gs1)
{
if(gs1.isSelected())
{
tot=tot+1200;
e[k]=l35.getText();
p[k]=l34.getText();
k=k+1;
}else
{
tot=tot-1200;
k=k-1;
for(int l=0;l<5;l++)
{
Page 20
stest.java
if(e[l].equals(l35.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==gs2)
{
if(gs2.isSelected())
{
tot=tot+950;
e[k]=l37.getText();
p[k]=l36.getText();
k=k+1;
}else
{
tot=tot-950;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l37.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==gs3)
{
if(gs3.isSelected())
{
tot=tot+525;
e[k]=l39.getText();
p[k]=l38.getText();
k=k+1;
}else
{
tot=tot-525;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l39.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
Page 21
stest.java
l++;
}
}
}
}
}
if(ae.getSource()==gs4)
{
if(gs4.isSelected())
{
tot=tot+1150;
e[k]=l41.getText();
p[k]=l40.getText();
k=k+1;
}else
{
tot=tot-1150;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l41.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==gs5)
{
if(gs5.isSelected())
{
tot=tot+4500;
e[k]=l43.getText();
p[k]=l42.getText();
k=k+1;
}else
{
tot=tot-4500;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l43.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
if(l==4)
{
e[l]="";
p[l]="";
}
}
Page 22
stest.java
}
}
}
else if(ae.getSource()==p1)
{
if(p1.isSelected())
{
tot=tot+400;
e[k]=l45.getText();
p[k]=l44.getText();
k=k+1;
}else
{
tot=tot-400;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l45.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==p2)
{
if(p2.isSelected())
{
tot=tot+550;
e[k]=l47.getText();
p[k]=l46.getText();
k=k+1;
}else
{
tot=tot-550;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l47.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==p3)
{
if(p3.isSelected())
{
tot=tot+625;
Page 23
stest.java
e[k]=l49.getText();
p[k]=l48.getText();
k=k+1;
}else
{
tot=tot-625;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l49.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==p4)
{
if(p4.isSelected())
{
tot=tot+2050;
e[k]=l51.getText();
p[k]=l50.getText();
k=k+1;
}else
{
tot=tot-2050;
k=k-1;
for(int l=0;l<5;l++)
{
if(e[l].equals(l51.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
}
}
}
}
if(ae.getSource()==p5)
{
if(p5.isSelected())
{
tot=tot+2500;
e[k]=l53.getText();
p[k]=l52.getText();
k=k+1;
}else
{
tot=tot-2500;
k=k-1;
Page 24
stest.java
for(int l=0;l<5;l++)
{
if(e[l].equals(l53.getText()))
{
while(l<4)
{
e[l]=e[l+1];
e[l+1]="";
p[l]=p[l+1];
p[l+1]="";
l++;
}
if(l==4)
{
e[l]="";
p[l]="";
}
}
}
}
}
}
t4.setText(String.valueOf(tot));
cn.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String[] args)
{
new stest("");
}
}