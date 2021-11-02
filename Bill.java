import java.awt.*;
public class Bill extends JFrame implements ActionListener
{
JTextArea a;
String b="",c="",e,qry="",gen,add,eid,dn,spc,th,te,u,aw,hu,bill="",pcn,x="";
int ag,total,temp=0;
String test[]=new String[5];
String price[]=new String[5];
public Bill(String user,String id)
{
super("Bill");
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
add=s1.getString(8);
eid=s1.getString(6);
pcn=s1.getString(7);
}
qry="Select * from pattest where Name='"+b+"' and ID='"+c+"'";
s1=st.executeQuery(qry);
int p=4,k=0,q=10;
if(s1.next())
{
while(k<=4)
{
test[k]=s1.getString(p);
price[k]=s1.getString(q);
total=Integer.parseInt(String.valueOf(s1.getString(9)));
k++;
p++;
q++;
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
Page 1
Bill.java
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sdf1 = new SimpleDateFormat("hh-mm-ss a");
temp=total/1000;
switch(temp)
{
case 1:th="One";break;
case 2:th="Two";break;
case 3:th="Three";break;
case 4:th="Four";break;
case 5:th="Five";break;
case 6:th="Six";break;
case 7:th="Seven";break;
case 8:th="Eight";break;
case 9:th="Nine";break;
case 10:th="Ten";break;
}
aw=th+" Thousand ";
temp=total%1000;
temp=temp/100;
switch(temp)
{
case 1:hu="One Hundred and ";break;
case 2:hu="Two Hundred and ";break;
case 3:hu="Three Hundred and ";break;
case 4:hu="Four Hundred and ";break;
case 5:hu="Five Hundred and ";break;
case 6:hu="Six Hundred and ";break;
case 7:hu="Seven Hundred and ";break;
case 8:hu="Eight Hundred and ";break;
case 9:hu="Nine Hundred and ";break;
default :hu="";break;
}
aw=aw+hu;
temp=total%1000;
temp=temp%100;
temp=temp/10;
switch(temp)
{
case 1:te="Ten";break;
case 2:te="Twenty";break;
case 3:te="Thirty";break;
case 4:te="Fourty";break;
case 5:te="Fifty";break;
case 6:te="Sixty";break;
case 7:te="Seventy";break;
case 8:te="Eighty";break;
case 9:te="Ninety";break;
}
aw=aw+te+" ";
temp=total%1000;
temp=temp%100;
temp=temp%10;
switch(temp)
{
case 1:u="One ";break;
case 2:u="Two ";break;
case 3:u="Three ";break;
case 4:u="Four ";break;
case 5:u="Five ";break;
case 6:u="Six ";break;
case 7:u="Seven ";break;
case 8:u="Eight ";break;
case 9:u="Nine ";break;
default :u="";break;
Page 2
Bill.java
}
aw=aw+u+"Rupees Only";
bill="\n\t\t\t\t\t\tAPOLLO HOSPITAL\n\t\t\t\t\t#12,Ring
Road,SaraswatiPuram\n\t\t\t\t\t\tMysore-570015";
bill=bill+"\nDate :- "+sdf.format(date);
bill=bill+"\t\t\t\t\t\t\t\t\tTime :- "+sdf1.format(date)+"\n";
bill=bill+"------------------------------------------------------------------------
-------------------------------------\n";
bill=bill+"\t\t\t\t\t\t INVOICE";
bill=bill+"\n----------------------------------------------------------------------
---------------------------------------\n";
bill=bill+"\nName :- "+b+"\n"+"Gender :- "+gen+"\nAge :- "+ag+"\nAddress :-
"+add+"\n"+"Contact Number :- "+pcn+"\nEmail-id :- "+eid;
bill=bill+"\n\nDoctor's Name :- "+dn+"\nSpecialization :- "+spc;
bill=bill+"\n\n--------------------------------------------------------------------
-----------------------------------------\n";
bill=bill+"Sl No\t\tParticulars\t\t\tAmount";
bill=bill+"\n----------------------------------------------------------------------
---------------------------------------\n";
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
for(int i=0;i<(5-nec);i++)
{
if(test[i]!=null)
{
while(test[i].length()<20)
{
test[i]=test[i]+" ";
}
bill=bill+(i+1)+"\t\t"+test[i]+"\t\t"+price[i];
bill=bill+"\n";
}
}
bill=bill+"------------------------------------------------------------------------
-------------------------------------\n";
bill=bill+"\nTotal Amount = "+total+"\t(Inclusive of all taxes)";
bill=bill+"\n\nAmount In Words :- "+aw;
bill=bill+"\n\n--------------------------------------------------------------------
-----------------------------------------\n";
FileOutputStream fout=new FileOutputStream(b+"Bill.txt");
fout.write(bill.getBytes());
fout.close();
x=b+"Bill.txt";
FileInputStream fin=new FileInputStream(x);
int ch;
StringBuffer d=new StringBuffer();
while((ch=fin.read())!=-1)
{
d.append((char)ch);
}
Page 3
Bill.java
e=new String(d);
a.setText(e);
a.setFont(new Font("Courier New",Font.PLAIN,15));
setVisible(true);
setLocation(500,100);
this.setResizable(false);
setSize(1000,800);
show();
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public void actionPerformed(ActionEvent ae)
{
}
public static void main(String args[])
{
new Bill("","");
}
}