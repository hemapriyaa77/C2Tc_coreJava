package com.tnsif.mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class Datas {
	private static final String url="jdbc:mysql://localhost:3306/jdbc";
	private static final String username="root";
	private static final String password="Mahilesh@2003#2023";
	public static void showData()throws SQLException
	{
		Connection connect=DriverManager.getConnection(url,username,password);
		Statement state=connect.createStatement();
		String query ="select *from employee";
		ResultSet result=state.executeQuery(query);
		while(result.next())
		{
		
		System.out.println("Name:"+result.getString(1));
		System.out.println("Id:"+result.getInt(2));
		System.out.println("Salary:"+result.getInt(3));
		System.out.println("Location:"+result.getString(4));
		System.out.println("designation:"+result.getString(5));
		}
		
		connect.close();
		
		
		
	}
	public static void deleteData()throws SQLException
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the employee id to delete:");
		int delete=obj.nextInt();
		String query="delete from employee where id="+delete;
		Connection connect=DriverManager.getConnection(url,username,password);
		Statement state=connect.createStatement();
		int rows=state.executeUpdate(query);
		System.out.println("number of rows to be affected:"+rows);
		connect.close();
		
	}
	public static void insertData()throws SQLException
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter employee name:");
		String empname=obj.next();
		System.out.println("enter employee id:");
		int empid=obj.nextInt();
		obj.nextLine();
		System.out.println("enter employee salary:");
		int empsalary=obj.nextInt();
		obj.nextLine();
		System.out.println("enter employee location");
		String emplocation=obj.next();
		System.out.println("enter employee designation");
		String empdesig=obj.next();
		String query="insert into employee values('"+empname+"',"+empid+","+empsalary+",'"+emplocation+"','"+empdesig+"')";
		Connection connect=DriverManager.getConnection(url,username,password);
		Statement state=connect.createStatement();
		int rows=state.executeUpdate(query);
		System.out.println("number of rows to be affected:"+rows);
		connect.close();
		
		
		
	}
	public static void updateData()throws SQLException
	{
		int id,value;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the employee id to update");
		id=obj.nextInt();
		System.out.println("updated  coloumn is:"+id);
		Connection connect=DriverManager.getConnection(url,username,password);
		Statement state=connect.createStatement();
		while(id!=0)
		{
			System.out.println("updatation in all coloumns then enter 1 or 0");
			if(id==1)
			{
				System.out.println("enter the employee name for updation");
				String name=obj.next();
				System.out.println("enter the employee salary for updation");
				int salary=obj.nextInt();
				obj.nextLine();
				System.out.println("enter the employee location for updation");
				String location=obj.next();
				System.out.println("enter the employee designation for updation");
				String designation=obj.next();
				String query="update employee set salary='"+salary+"'where id="+id;
				String quer="update employee set designation='"+designation+"'where id="+id;
				String que="update employee set name='"+name+"'where id="+id;
				String qu="update employee set location='"+location+"'where id="+id;
			}
			else
			{
				String column;
				System.out.println("which coloumn to be updated");
				column=obj.next();
				switch(column)
				{
				case "name":
					System.out.println("enter the employee name for updation");
					String name=obj.next();
					String que="update employee set name='"+name+"'where id="+id;
					int r=state.executeUpdate(que);
					break;
				case "salary":
					System.out.println("enter the employee salary for updation");
					int salary=obj.nextInt();
					String query="update employee set salary='"+salary+"'where id="+id;
					int ro=state.executeUpdate(query);
					break;
				case "location":
					System.out.println("enter the employee location for updation");
					String location=obj.next();
					String qu="update employee set location='"+location+"'where id="+id;
					int row=state.executeUpdate(qu);
					break;
				case "designation":
					System.out.println("enter the employee designation for updation");
					String designation=obj.next();
					String quer="update employee set designation='"+designation+"'where id="+id;
					int rows=state.executeUpdate(quer);
					break;
					
				
				}
				
				
			}break;
		}
		
		
	}
}
