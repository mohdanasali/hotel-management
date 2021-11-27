/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

/**
 *
 * @author dell.com
 */



import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.awt.event.*;



class Employee implements ActionListener
{
	JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9;
	void create_menu()
	{
		JFrame frm=new JFrame();
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		JMenuBar mb=new JMenuBar();
		frm.setJMenuBar(mb);
		JMenu m1=new JMenu("Employee");
		JMenu m2=new JMenu("Salary");
		JMenu m3=new JMenu("Report");
		JMenu m4=new JMenu("Exit");

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		i1=new JMenuItem("Add");
		i2=new JMenuItem("Edit");
		i3=new JMenuItem("Search");
		
		i4=new JMenuItem("Add");
		i5=new JMenuItem("Edit");
		i6=new JMenuItem("Search");
		
		i7=new JMenuItem("Yes");
		i8=new JMenuItem("No");

		i9=new JMenuItem("List of employees");
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m2.add(i4);
		m2.add(i5);
		m2.add(i6);
		m3.add(i9);
		m4.add(i7);
		m4.add(i8);
		
		
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);

		i4.addActionListener(this);
		i5.addActionListener(this);
		i6.addActionListener(this);

		i7.addActionListener(this);
		i8.addActionListener(this);
		i9.addActionListener(this);

		frm.setSize(1500,900);
		frm.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==i1)
		{
			AddClass obj=new AddClass();
		}
		else if(e.getSource()==i2)
		{
			EditClass obj=new EditClass();
		}
		else if(e.getSource()==i3)
		{
			SearchClass obj=new SearchClass();
		}
		else if(e.getSource()==i4)
		{
			AddSalaryClass obj=new AddSalaryClass();
		}
		else if(e.getSource()==i5)
		{
			EditSalaryClass obj=new EditSalaryClass();
		}
		else if(e.getSource()==i6)
		{
			SearchSalaryClass obj=new SearchSalaryClass();
		}
		else if(e.getSource()==i7)
		{
			System.exit(0);
		}
		else if(e.getSource()==i9)
		{
			ListEmployee obj=new ListEmployee();
		}

	}
}
class AddClass implements ActionListener
{
	JFrame frm;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2;
	AddClass()
	{
		frm=new JFrame("Add Employee Details");
		frm.setLayout(new GridLayout(7,2));
		l1=new JLabel("Enter Emp no");
		l2=new JLabel("Enter Emp name");
		l3=new JLabel("Enter Address");
		l4=new JLabel("Enter Phone no ");
		l5=new JLabel("Enter Date of Joining");
		l6=new JLabel("Enter salary");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		t6=new JTextField(20);
		b1=new JButton("SAVE");
		b2=new JButton("EXIT");
		frm.add(l1);
		frm.add(t1);
		frm.add(l2);
		frm.add(t2);
		frm.add(l3);
		frm.add(t3);
		frm.add(l4);
		frm.add(t4);
		frm.add(l5);
		frm.add(t5);
		frm.add(l6);
		frm.add(t6);
		frm.add(b1);
		frm.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		frm.setBounds(450,300,400,300);
		frm.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                                //String database="jdbc:odbc:Driver={Microsoft Access Driver(*.mdb)};DBQ=Empdatabase.mdb;";
				Connection con=DriverManager.getConnection("jdbc:odbc:emp");
				Statement state=con.createStatement();
				String q="insert into emptab values("+t1.getText()+",'"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"',"+t6.getText()+")";
				state.executeUpdate(q);
				JOptionPane.showMessageDialog(null,"Successfully saved");
			}
			catch(Exception ee)
			{
				JOptionPane.showMessageDialog(null,ee.getMessage());
			}
		}
		if(e.getSource()==b2)
			frm.dispose();
	}

}
class EditClass implements ActionListener
{
	JFrame frm;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2,b3,b4;
	EditClass()
	{
		frm=new JFrame("Edit Employee Details");
		frm.setLayout(new GridLayout(8,2));
		l1=new JLabel("Enter Emp no");
		l2=new JLabel("Employee name");
		l3=new JLabel("Address");
		l4=new JLabel("Phone no ");
		l5=new JLabel("Date of Joining");
		l6=new JLabel("Basic salary");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		t6=new JTextField(20);
		b1=new JButton("OK");
		b2=new JButton("EXIT");
		b3=new JButton("DELETE");
		b4=new JButton("UPDATE");
		frm.add(l1);
		frm.add(t1);
		frm.add(b1);
		frm.add(b2);
		frm.add(l2);
		frm.add(t2);
		frm.add(l3);
		frm.add(t3);
		frm.add(l4);
		frm.add(t4);
		frm.add(l5);
		frm.add(t5);
		frm.add(l6);
		frm.add(t6);
		frm.add(b3);
		frm.add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		frm.setBounds(450,300,400,300);
		frm.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:emp");
				Statement state=con.createStatement();
				String q="select * from emptab where eno="+t1.getText();
				ResultSet res=state.executeQuery(q);
				if(!res.next())
					JOptionPane.showMessageDialog(null,"Not found");
				else
				{
					t2.setText(res.getString("ename"));
					t3.setText(res.getString("address"));
					t4.setText(res.getString("phone"));
					t5.setText(res.getString("doj"));
					t6.setText(res.getString("salary"));
				}
			}
			catch(Exception ee)
			{
				JOptionPane.showMessageDialog(null,ee.getMessage());
			}
		}
		else if(e.getSource()==b2)
			frm.dispose();
		else if(e.getSource()==b3)
		{
			int choice=JOptionPane.showConfirmDialog(null,"Are you sure");
			if(choice==JOptionPane.YES_OPTION)
			{
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:emp");
					Statement state=con.createStatement();
					String q="delete from emptab where eno="+t1.getText();
					state.executeUpdate(q);	
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");

					JOptionPane.showMessageDialog(null,"Successfully deleted");
						
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null,ee.getMessage());
				}
			}
		}
		else if(e.getSource()==b4)
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:emp");
				Statement state=con.createStatement();
				String q="update emptab set ename='"+t2.getText()+"',address='"+t3.getText()+"',phone='"+t4.getText()+"',doj='"+t5.getText()+"',salary="+t6.getText()+" where eno="+t1.getText();
				state.executeUpdate(q);
				JOptionPane.showMessageDialog(null,"Successfully updated");
			}
			catch(Exception ee)
			{
				JOptionPane.showMessageDialog(null,ee.getMessage());
			}
		}
	}
}
class SearchClass implements ActionListener
{

	JFrame frm;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2;
	SearchClass()
	{
		frm=new JFrame("Search Employee Details");
		frm.setLayout(new GridLayout(7,2));
		l1=new JLabel("Enter Emp no");
		l2=new JLabel("Employee name");
		l3=new JLabel("Address");
		l4=new JLabel("Phone no ");
		l5=new JLabel("Date of Joining");
		l6=new JLabel("Basic salary");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		t6=new JTextField(20);
		b1=new JButton("SEARCH");
		b2=new JButton("EXIT");
		frm.add(l1);
		frm.add(t1);
		frm.add(b1);
		frm.add(b2);
		frm.add(l2);
		frm.add(t2);
		frm.add(l3);
		frm.add(t3);
		frm.add(l4);
		frm.add(t4);
		frm.add(l5);
		frm.add(t5);
		frm.add(l6);
		frm.add(t6);
		b1.addActionListener(this);
		b2.addActionListener(this);
		frm.setBounds(450,300,400,300);
		frm.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:emp");
				Statement state=con.createStatement();
				String q="select * from emptab where eno="+t1.getText();
				ResultSet res=state.executeQuery(q);
				if(!res.next())
					JOptionPane.showMessageDialog(null,"Not found");
				else
				{
					t2.setText(res.getString("ename"));
					t3.setText(res.getString("address"));
					t4.setText(res.getString("phone"));
					t5.setText(res.getString("doj"));
					t6.setText(res.getString("salary"));
				}
			}
			catch(Exception ee)
			{
				JOptionPane.showMessageDialog(null,ee.getMessage());
			}
		}
		else if(e.getSource()==b2)
			frm.dispose();
		
	}
}

//SALARY

class AddSalaryClass implements ActionListener
{
	JFrame frm;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2;
	public AddSalaryClass()
	{
		frm=new JFrame("Add Employee Salary");
		frm.setLayout(new GridLayout(4,2));
		l1=new JLabel("Enter Emp no");
		l2=new JLabel("Enter Salary");
		l3=new JLabel("Enter date");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		b1=new JButton("SAVE");
		b2=new JButton("EXIT");
		frm.add(l1);
		frm.add(t1);
		frm.add(l2);
		frm.add(t2);
		frm.add(l3);
		frm.add(t3);
		frm.add(b1);
		frm.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		frm.setBounds(450,300,350,250);
		frm.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:emp");
				Statement state=con.createStatement();
				String q="insert into Salarytab values("+t1.getText()+","+t2.getText()+",'"+t3.getText()+"')";
				state.executeUpdate(q);
				JOptionPane.showMessageDialog(null,"Successfully saved");
			}
			catch(Exception ee)
			{
				JOptionPane.showMessageDialog(null,ee.getMessage());
			}
		}
		if(e.getSource()==b2)
			frm.dispose();
	}
}
class EditSalaryClass implements ActionListener
{
	JFrame frm;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	public EditSalaryClass()
	{
		frm=new JFrame("Edit Salary Details");
		frm.setLayout(new GridLayout(5,2));
		l1=new JLabel("Enter Emp no");
		l2=new JLabel("Salary");
		l3=new JLabel("Date");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		b1=new JButton("OK");
		b2=new JButton("EXIT");
		b3=new JButton("DELETE");
		b4=new JButton("UPDATE");
		frm.add(l1);
		frm.add(t1);
		frm.add(b1);
		frm.add(b2);
		frm.add(l2);
		frm.add(t2);
		frm.add(l3);
		frm.add(t3);
		frm.add(b3);
		frm.add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		frm.setBounds(450,300,350,250);
		frm.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:emp");
				Statement state=con.createStatement();
				String q="select * from Salarytab where eno="+t1.getText();
				ResultSet res=state.executeQuery(q);
				if(!res.next())
					JOptionPane.showMessageDialog(null,"Not found");
				else
				{
					t2.setText(res.getString("salary"));
					t3.setText(res.getString("dos"));
					
				}
			}
			catch(Exception ee)
			{
				JOptionPane.showMessageDialog(null,ee.getMessage());
			}
		}
		else if(e.getSource()==b2)
			frm.dispose();
		else if(e.getSource()==b3)
		{
			int choice=JOptionPane.showConfirmDialog(null,"Are you sure");
			if(choice==JOptionPane.YES_OPTION)
			{
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con=DriverManager.getConnection("jdbc:odbc:emp");
					Statement state=con.createStatement();
					String q="delete from Salarytab where eno="+t1.getText();
					state.executeUpdate(q);	
					t2.setText("");
					t3.setText("");
					

					JOptionPane.showMessageDialog(null,"Successfully deleted");
						
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null,ee.getMessage());
				}
			}
		}
		else if(e.getSource()==b4)
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:emp");
				Statement state=con.createStatement();
				String q="update Salarytab set salary="+t2.getText()+",dos='"+t3.getText()+"' where eno="+t1.getText();
				state.executeUpdate(q);
				JOptionPane.showMessageDialog(null,"Successfully updated");
			}
			catch(Exception ee)
			{
				JOptionPane.showMessageDialog(null,ee.getMessage());
			}
		}
	}
}
class SearchSalaryClass implements ActionListener
{
	JFrame frm;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2;
	public SearchSalaryClass()
	{
		frm=new JFrame("Search Salary Details");
		frm.setLayout(new GridLayout(4,2));
		l1=new JLabel("Enter Emp no");
		l2=new JLabel("Salary");
		l3=new JLabel("Date");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		b1=new JButton("OK");
		b2=new JButton("EXIT");
		frm.add(l1);
		frm.add(t1);
		frm.add(b1);
		frm.add(b2);
		frm.add(l2);
		frm.add(t2);
		frm.add(l3);
		frm.add(t3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		frm.setBounds(500,300,300,250);
		frm.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:emp");
				Statement state=con.createStatement();
				String q="select * from Salarytab where eno="+t1.getText();
				ResultSet res=state.executeQuery(q);
				if(!res.next())
					JOptionPane.showMessageDialog(null,"Not found");
				else
				{
					t2.setText(res.getString("salary"));
					t3.setText(res.getString("dos"));
					
				}
			}
			catch(Exception ee)
			{
				JOptionPane.showMessageDialog(null,ee.getMessage());
			}
		}
		else if(e.getSource()==b2)
			frm.dispose();
	}
}


//LIST EMPLOYEE
class ListEmployee
{
	JFrame frm;


	public ListEmployee()
	{
		frm=new JFrame("List of Employee");
		frm.setDefaultCloseOperation(frm.DISPOSE_ON_CLOSE);
		frm.setBounds(400,100,600,700);
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		JLabel l= new JLabel("LIST OF EMPLOYEES");
		l.setFont(new Font("Arial",Font.BOLD,15));
		frm.add(l);
		JTable jt=new JTable(0,6);
		DefaultTableModel m=(DefaultTableModel) jt.getModel();
		Object head[]={"Eno","Ename","Address","Phone","Doj","Salary"};
		m.addRow(head);
		frm.add(jt);
		
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:emp");
			Statement state=con.createStatement();
			String q="select * from emptab";
			ResultSet res=state.executeQuery(q);
			while(res.next())
			{
				Object newrow[]={res.getString("eno"),res.getString("ename"),res.getString("address"),res.getString("phone"),res.getString("doj"),res.getString("salary")};
				m.addRow(newrow);
			}
		}
		catch(Exception ee)
		{
			JOptionPane.showMessageDialog(null,ee.getMessage());
		}		
		frm.show();
	}
}

//LOGIN

class LoginClass implements ActionListener
{
	JFrame frm;
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	public LoginClass()
	{
		frm=new JFrame("Login");
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setLayout(new GridLayout(3,2));
		l1=new JLabel("Enter login name");
		l2=new JLabel("Enter password");
		t1=new JTextField(20);
		t2=new JPasswordField(20);
		b1=new JButton("OK");
		b2=new JButton("EXIT");
		frm.add(l1);
		frm.add(t1);
		frm.add(l2);
		frm.add(t2);
		frm.add(b1);
		frm.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		frm.setBounds(450,300,350,170);
		frm.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("jdbc:odbc:emp");
				Statement state=con.createStatement();
				String q="select * from Logintab where login='"+t1.getText()+"' and password='"+t2.getText()+"'";
				ResultSet res=state.executeQuery(q);
				if(!res.next())
					JOptionPane.showMessageDialog(null,"Incorrect");
				else
				{
					
					frm.dispose();
					Employee emp=new Employee();
					emp.create_menu();
					
					
				}
			}
			catch(Exception ee)
			{
				JOptionPane.showMessageDialog(null,ee.getMessage());
			}
		}
		else if(e.getSource()==b2)
			frm.dispose();
	}
}

//SPLASH

class SplashClass
{
	JFrame frm;
	JLabel l1,l2,l3,l4,l5;
	JProgressBar jb;
	public SplashClass()
	{
		frm=new JFrame("Splash Screen");
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setLayout(null);
		l1=new JLabel("EMPLOYEE PROFILE");
		l2=new JLabel("MANAGEMENT");
		l3=new JLabel("SYSTEM");
		l4=new JLabel("Version : 1.0");
		l5=new JLabel("Developed by: Mr. XYZ");
		jb=new JProgressBar();
		
		Font f=new Font("Times New Roman",Font.BOLD,25);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l1.setForeground(Color.blue);
		l2.setForeground(Color.blue);
		l3.setForeground(Color.blue);

		l1.setBounds(170,10,450,30);
		frm.add(l1);
		l2.setBounds(150,50,450,30);
		frm.add(l2);
		l3.setBounds(183,90,450,30);
		frm.add(l3);
		
		l4.setForeground(Color.red);
		l4.setBounds(190,150,100,30);
		frm.add(l4);

		l5.setForeground(Color.orange);
		l5.setBounds(170,200,150,30);
		frm.add(l5);

		jb.setBackground(Color.pink);
		jb.setBounds(100,300,270,20);
		frm.add(jb);

		frm.setBounds(450,200,500,400);
		frm.show();

		jb.setMinimum(0);
		jb.setMaximum(100);
		jb.setStringPainted(true);
		for(int i=0;i<=100;i++)
		{
			jb.setValue(i);
			try
			{
				Thread.sleep(50);
			}
			catch(Exception tt)
			{}
		}
		frm.dispose();
		LoginClass obj=new LoginClass();
			

	
	}
}
class Mainclass
{
	public static void main(String arg[])
	{
		//LoginClass log=new LoginClass();
		
		SplashClass obj=new SplashClass();

		//Employee emp=new Employee();
		//emp.create_menu();

	}
}
