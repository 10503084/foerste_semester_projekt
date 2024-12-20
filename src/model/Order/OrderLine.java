package model.Order;

import model.Product.Product;
import model.Product.ProductContainer;

/**
 * Orderline which contains products and information about those.
 * @author Jonas, Sofus, Lasse, Sebastian, Henrik
 * 
 */
public class OrderLine {
	
	private Product product;
	private int quantity;
	private double subTotal;
	
	public OrderLine(int quantity) {
		this.quantity = quantity;
	}
	
	public void addProductToOrderLine(Product product) {
		this.product = product;
	}
	
	public void setSubTotal() {
		this.subTotal = this.product.getPrice() * this.quantity;
	}
	
	public double getSubTotal() {
		return this.subTotal;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public int getQuantity() {
		return this.quantity;
	}

}
