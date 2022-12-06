package action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import pojo.Product;

public class OrderDetailsAction {

	
	List<Product> selectedProducts;
	String userName;
	String address="";
	Integer totalItems;
	Integer TotalCost;
	String phoneNo="";
public String execute() {

	String result =getCartDetails();
	return result;
}
	
	public List<Product> getSelectedProducts() {
	return selectedProducts;
}

public void setSelectedProducts(List<Product> selectedProducts) {
	this.selectedProducts = selectedProducts;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Integer getTotalItems() {
	return totalItems;
}

public void setTotalItems(Integer totalItems) {
	this.totalItems = totalItems;
}

public Integer getTotalCost() {
	return TotalCost;
}

public void setTotalCost(Integer totalCost) {
	TotalCost = totalCost;
}

public String getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}

	public String getCartDetails() {
		try {
			System.out.println("Getting order details...");
		setUserName((String)ServletActionContext.getRequest().getSession().getAttribute("loggedinUser"));
		setSelectedProducts((List<Product>) ServletActionContext.getRequest().getSession().getAttribute("selectedProducts"));
		setTotalItems(this.selectedProducts.size());
		int total=0;
		for(Product product: selectedProducts) {
			total+=product.getProductPrice();
		}
		setTotalCost(total);
		
		return "success";
		}
		catch(Exception e) {
			System.out.println(e);
			return "error";
		}
	}
}
