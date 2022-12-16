package action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import pojo.Product;

public class CartAction {
	String id;
	List<Product> selectedProducts;
	Integer CartSize;
	Integer itemsInCart;
	public Integer getItemsInCart() {
		return itemsInCart;
	}



	public void setItemsInCart(Integer itemsInCart) {
		this.itemsInCart = itemsInCart;
	}



	public String execute() {
	return "success";	
	}
	
	

	public List<Product> getSelectedProducts() {
		return selectedProducts;
	}



	public void setSelectedProducts(List<Product> selectedProducts) {
		this.selectedProducts = selectedProducts;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public Integer getCartSize() {
		return CartSize;
	}



	public void setCartSize(Integer cartSize) {
		CartSize = cartSize;
	}




	public String addToCart() {
		List<Product> selectedProducts = (List<Product>) ServletActionContext.getRequest().getSession().getAttribute("selectedProducts");
		List<Product> productsList = (List<Product>) ServletActionContext.getRequest().getSession().getAttribute("productsList");
		if(selectedProducts ==null) {
			System.out.println("Selected Products empty");
			selectedProducts = new ArrayList<Product>();
		}

		selectedProducts.add(productsList.get(Integer.parseInt(id)-1));
		System.out.println("adding "+id+" to cart...");
		System.out.println(selectedProducts);
		System.out.println("Cart Size: "+selectedProducts.size());
		ServletActionContext.getRequest().getSession().setAttribute("selectedProducts",selectedProducts);
		setSelectedProducts(selectedProducts);
		ServletActionContext.getRequest().getSession().setAttribute("itemsInCart",selectedProducts.size());
		return "success";
	}
	
	
}
