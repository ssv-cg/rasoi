package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import dbutil.DBConnection;
import pojo.Product;

public class CartDAO {
	
	
	
	public static int addProduct(String address, String phoneNo)
	{
		int status = 0;
		System.out.println("Adding order to the database");
		try
		{
			Connection conn = DBConnection.getConnection();
			PreparedStatement ps= conn.prepareStatement("INSERT INTO orders VALUES(?,?,?,?,?,?)");
			String user=(String)ServletActionContext.getRequest().getSession().getAttribute("loggedinUser");
			List<Product> selectedproducts = (List<Product>) ServletActionContext.getRequest().getSession().getAttribute("selectedProducts");
			int total=0;
			for(Product p: selectedproducts) {
				total+=p.getProductPrice();
			}
			ps.setString(1,user);
			ps.setString(2, selectedproducts.toString());
			ps.setInt(3, selectedproducts.size());
			ps.setInt(4, total);
			ps.setString(5,address);
			ps.setString(6,phoneNo);
			status = ps.executeUpdate();
			if (status!=0) {
				System.out.println("order added to db successfully");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}
}
