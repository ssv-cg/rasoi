package action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import pojo.Product;

public class ProductAction{

	public String execute() {
		System.out.println("initializing products");
		initializeProducts();
		System.out.println("initializing products completed");
		return "success";
	}
	
	List<Product> productList;
	public void initializeProducts() {
		productList= new ArrayList<Product>();
		productList.add(new Product("1","Burger",100,"'assets/burger.jpg'"));
		productList.add(new Product("2","Pizza",100,"'assets/pizza.jpg'"));
		productList.add(new Product("3","Pasta",100,"'assets/pasta.jpg'"));
		productList.add(new Product("4","Waffle",100,"'assets/waffle.jpg'"));
		productList.add(new Product("5","Milkshake",100,"'assets/milkshake.jpg'"));
		ServletActionContext.getRequest().getSession().setAttribute("productsList",productList);
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
}
