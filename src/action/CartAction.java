package action;

import java.util.ArrayList;
import java.util.List;

import pojo.Product;

public class CartAction {
	String id;
	List<Product> selectedProducts=new ArrayList<Product>();
	ProductAction productAction=new ProductAction();
	public String execute() {
	return "success";	
	}
	
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public List<Product> getSelectedProducts() {
		return selectedProducts;
	}

	public void setSelectedProducts(List<Product> selectedProducts) {
		this.selectedProducts = selectedProducts;
	}

	public String addToCart() {
		
		productAction.initializeProducts();
		selectedProducts.add(productAction.productList.get(Integer.parseInt(id)-1));
		System.out.println("adding "+id+" to cart...");
		System.out.println(selectedProducts);
		return "success";
	}
	
	
}
