package com.tnsif.mini;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Datasmain {

	public static void main(String[] args)throws SQLException
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("you want to modify anything in this table press 1 else 0" );
		int choice=obj.nextInt();
		
		while(choice!=0)
		{
			System.out.println("enter option for modification the options are to press show:1,insert:2,delete:3,update:4");
			int option=obj.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("show the datas from table");
				Datas.showData();
				break;
			case 2:
				System.out.println("insert  datas to table");
				Datas.insertData();
				Datas.showData();
				break;
			case 3:
				System.out.println("delete datas in table");
				Datas.deleteData();
				Datas.showData();
				break;
			case 4:
				System.out.println("update datas to table");
				Datas.updateData();
				Datas.showData();
				break;
			}
			System.out.println("if you want to continue this");
			choice=obj.nextInt();
		}
		
			System.out.println("there is no modification ");
			
		
		
		/*System.out.println("show the data");
		Datas.showData();
		System.out.println("delete the row");
		Datas.deleteData();
		System.out.println("Insert the row");
		Datas.insertData();
		System.out.println("update the row");
		Datas.updateData();*/


	}

}
