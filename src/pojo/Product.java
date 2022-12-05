package pojo;

public class Product {

	String productId;
	String productName;
	String productImage;
	Integer productPrice;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productId, String productName, Integer productPrice, String productImage) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productImage= productImage;
		this.productPrice = productPrice;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
//
//	public String getProductCategory() {
//		return productCategory;
//	}
//
//	public void setProductCategory(String productCategory) {
//		this.productCategory = productCategory;
//	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productImage=" + productImage
				+ ", productPrice=" + productPrice + "]";
	}

	

}
