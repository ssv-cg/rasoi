package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import dbutil.DBConnection;
import pojo.Order;
import pojo.Product;

public class OrdersDAO {


public static List<Order> retriveOrders()
{	
	List<Order> orders=new ArrayList<Order>();
	
	System.out.println("Retrieving orders from database...");
	try
	{
		Connection conn = DBConnection.getConnection();
		Statement st = conn.createStatement();
		
		String user=(String)ServletActionContext.getRequest().getSession().getAttribute("loggedinUser");
		ResultSet rs = st.executeQuery("select * from orders where user='sid'");
		
	
while(rs.next()) {
	orders.add(new Order(rs.getString("user_name"),rs.getString("address"),rs.getInt("total_items"),rs.getInt("total_cost"),rs.getString("phone_no")));
}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println("from database: "+orders);
	return orders;
}}