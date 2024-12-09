package controller;
import model.*;
import model.Customer.BusinessCustomer;
import model.Customer.CustomerContainer;
import model.Product.Product;
import model.Product.ProductCategory;
import model.Product.ProductCategoryContainer;
import model.Product.ProductContainer;
import model.Product.SimpleProduct;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleProduct simpleProduct1 = new SimpleProduct("1", "1", null, "hammer", "Stanley", "123", "1000x", "stærk", 1000.00, 200.00, 500.00, 5);
		ProductContainer.getInstance().addProduct(simpleProduct1);
		
	    SimpleProduct foundProduct = (SimpleProduct)ProductContainer.getInstance().findProductByBarcode("1");
		System.out.println(foundProduct.getBarcode());
		
		BusinessCustomer businessCustomer1 = new BusinessCustomer("nameTest", "emailTest", "phoneTest", "addressTest", "cvrTest");
		CustomerContainer.getInstance().addCustomer(businessCustomer1);
		
		BusinessCustomer foundCustomer = CustomerContainer.getInstance().findByCVR("cvrTest");
		System.out.println(foundCustomer.getCVR());
		
		ProductCategory productCategory1 = new ProductCategory("IDTest", "nameTest", "descriptionTest");
		ProductCategoryContainer.getInstance().addProductCategory(productCategory1);
		
		ProductCategory foundProductCategory = ProductCategoryContainer.getInstance().findProductCategoryByProductCategoryID("IDTest");
		System.out.println(foundProductCategory.getProductCategoryID());
		
	}
	
}
