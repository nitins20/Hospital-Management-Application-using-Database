import java.awt.*;
public class Doctorreport extends JFrame implements ActionListener
{
JTextArea a;
String b,count="",report="",x="",spc="",e,qry="";
int as,k=0;
String pname[]=new String[100];
String g[]=new String[100];
String ag[]=new String[100];
public Doctorreport(String user)
{
super("Doctor Report");
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
qry="Select Count(Name) as count from patapp where DoctorName='"+b+"'";
s1=st.executeQuery(qry);
if(s1.next())
{
count=s1.getString(1);
}
as=Integer.parseInt(count);
if(as==0)
{
JOptionPane.showMessageDialog(this,"Patients history not found\nPlease try
again later...");
dispose();
}
else
{
qry="Select * from patapp where DoctorName='"+b+"'";
s1=st.executeQuery(qry);
k=0;
while(s1.next())
{
spc=s1.getString(5);
pname[k]=s1.getString(2);
k++;
}
k=0;
while(pname[k]!=null)
{
qry = "Select * from patdetails where Name='"+pname[k]+"'";
s1=st.executeQuery(qry);
if(s1.next())
{
g[k]=s1.getString(3);
ag[k]=s1.getString(4);
}
Page 1
Doctorreport.java
k++;
}
LocalDate rd=java.time.LocalDate.now();
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sdf1 = new SimpleDateFormat("hh-mm-ss a");
String report = "\n\t\t\t\t\t\tAPOLLO HOSPITAL\n\t\t\t\t\t#12,Ring
Road,SaraswatiPuram\n\t\t\t\t\t\tMysore-570015";
report=report+"\nDate :- "+sdf.format(date);
report=report+"\t\t\t\t\t\t\t\t\tTime :- "+sdf1.format(date)+"\n";
report=report+"----------------------------------------------------------------
---------------------------------------------\n";
report+="\t\t\t\t\t\tDoctor Report";
report=report+"\n--------------------------------------------------------------
-----------------------------------------------\n";
report=report+"\nDoctor Name :- "+b+"\nSpecialization :- "+spc+"\n";
report=report+"\n--------------------------------------------------------------
-----------------------------------------------\n";
report+="Number of Patients Treated :- "+as+"\n\nList of Patients :- \n\n";
for(int j=0;j<=as;j++)
{
if(pname[j]!=null)
{
while(pname[j].length()==30)
{
pname[j]=" ";
}
report+=(j+1)+"] "+pname[j]+"\t\t"+g[j]+"\t\t"+ag[j]+"\n";
}
}
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
}
}
catch(Exception ex)
{
System.out.print(ex);
}
}
public void actionPerformed(ActionEvent ae)
{
Page 2
Doctorreport.java
}
public static void main(String args[])
{
new Doctorreport("");
}
}