package action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import pojo.Product;

public class CheckoutAction extends ActionSupport{
	
	List<Product> selectedProducts;
	String userName;
	String address="";
	Integer totalItems;
	Integer TotalCost;
	String phoneNo="";
public String execute() {

	String result = checkout();
	return result;
}

	
	public String getPhoneNo() {
	return phoneNo;
}


public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}


	public String checkout() {
		System.out.println("Address: "+address);
		System.out.println("phone no: "+phoneNo);
		System.out.println("checking out...");
		return "success";
	}
	public void validate() {
		System.out.println("validation address:"+address);
		System.out.println("validation phone:"+phoneNo);
		if(address.equals("")) {
			addFieldError("address", "Address is required");
		}
		if(phoneNo.equals("")) {
			addFieldError("phoneNo", "phoneNo is required");
		}

		if(phoneNo.length()!=10 ) {
			addFieldError("phoneNo", "Phone no. should be 10 digits");
		}
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
	
}
