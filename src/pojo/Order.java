package pojo;

public class Order {
	String userName;
	String address="";
	Integer totalItems;
	Integer totalCost;
	String phoneNo="";
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
		return totalCost;
	}
	public void setTotalCost(Integer totalCost) {
		totalCost = totalCost;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Order(String userName, String address, Integer totalItems, Integer totalCost, String phoneNo) {
		super();
		this.userName = userName;
		this.address = address;
		this.totalItems = totalItems;
		this.totalCost = totalCost;
		this.phoneNo = phoneNo;
	}
	
	
}
