import java.awt.*;
public class patientreport extends JFrame implements ActionListener
{
JTextArea a;
String b,c,e,qry="",gen="",dn="",spc="",x="";
int ag;
String test[]=new String[5];
public patientreport(String user,String id)
{
super("Patient Report");
try
{
setLayout(null);
Connection cn;
DBConnection con=new DBConnection();
cn=con.get_DBConnection();
java.sql.Statement st=cn.createStatement();
ResultSet s1=null;
a=new JTextArea();
a.setBounds(1,1,1000,800);
add(a);
a.setFont(new Font("Courier New",Font.BOLD,15));
b=user;
c=id;
qry="Select * from patdetails where Name='"+b+"' and PatientID='"+c+"'";
s1=st.executeQuery(qry);
if(s1.next())
{
gen=s1.getString(3);
ag=Integer.parseInt(s1.getString(4));
}
qry="Select * from pattest where Name='"+b+"' and ID='"+c+"'";
s1=st.executeQuery(qry);
int p=4,k=0;
if(s1.next())
{
while(k<=4)
{
test[k]=s1.getString(p);
k++;
p++;
}
}
qry="Select * from patapp where Name='"+b+"' and ID='"+c+"'";
s1=st.executeQuery(qry);
if(s1.next())
{
dn=s1.getString(5);
spc=s1.getString(4);
}
LocalDate rd=java.time.LocalDate.now();
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sdf1 = new SimpleDateFormat("hh-mm-ss a");
String report = "\n\t\t\t\t\t\tAPOLLO HOSPITAL\n\t\t\t\t\t#12,Ring
Road,SaraswatiPuram\n\t\t\t\t\t\tMysore-570015";
report=report+"\nDate :- "+sdf.format(date);
Page 1
patientreport.java
report=report+"\t\t\t\t\t\t\t\t\tTime :- "+sdf1.format(date)+"\n";
report=report+"--------------------------------------------------------------------
-----------------------------------------";
report+="\n\t\t\t\t\t\tPatient Report";
report=report+"\n------------------------------------------------------------------
-------------------------------------------\n";
report=report+"\nPatient Name :- "+b+"\nGender :- "+gen+"\nAge :- "+ag;
report+="\n\nDoctor Name :- "+dn+"\nSpecialization :- "+spc;
report+="\n\n----------------------------------------------------------------------
---------------------------------------\n";
report+="Sl No\t\tTests Done";
report+="\n------------------------------------------------------------------------
-------------------------------------\n";
int u=0,nec=0;
for(int z=0;z<5;z++)
{
if((test[z].equals(null)||test[z].equals("null"))!=false)
{
u=u++;
if(u==0)
{
nec++;
}
}
}
u=0;
for(int z=0;z<(5-nec);z++)
{
if(test[z]!=null)
{
while(test[z].length()<20)
{
test[z]=test[z]+" ";
}
report=report+(z+1)+"\t\t"+test[z]+"";
report=report+"\n";
}
}
report+="--------------------------------------------------------------------------
-----------------------------------\n";
FileOutputStream fout=new FileOutputStream(b+"Report.txt");
fout.write(report.getBytes());
fout.close();
x=b+"Report.txt";
FileInputStream fin=new FileInputStream(x);
int ch;
StringBuffer d=new StringBuffer();
while((ch=fin.read())!=-1)
{
d.append((char)ch);
}
e=new String(d);
a.setText(e);
a.setFont(new Font("Courier New",Font.PLAIN,15));
setVisible(true);
this.setResizable(false);
setLocation(500,100);
setSize(1000,800);
show();
Page 2
patientreport.java
}
catch(Exception e)
{
}
}
public void actionPerformed(ActionEvent ae)
{
}
public static void main(String args[])
{
new patientreport("","");
}
}