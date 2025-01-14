package controller;

import model.Customer.PrivateCustomer;
import model.Lease.Lease;
import model.Tool.Tool;

public class LeaseController {

	private ToolController toolController;
	private CustomerController customerController;
	private Lease lease;
	
	public LeaseController() {
		this.toolController = new ToolController();
		this.customerController = new CustomerController();
	}
	
	public void makeNewLease() {
		this.lease = new Lease();
	}
	
	public Tool findToolByID(String id) {
		return toolController.findToolByID(id);
	}
	
	public PrivateCustomer findCustomerByPhoneNumber(String phoneNumber) {
		return customerController.findCustomerByPhoneNumber(phoneNumber);
	}
	
	public void addToolToLease(String id) {
		Tool foundTool = toolController.findToolByID(id);
		
		this.lease.setTool(foundTool);
	}
	
	public void addCustomerToLease(String name, String email, String phone, String address) {
		PrivateCustomer customerToAdd = new PrivateCustomer(name, email, phone, address);
		
		this.lease.setCustomer(customerToAdd);
	}
	
	public Lease findLeaseByPhoneNumber(String phone) {
		return LeaseContainer.getInstance().findLeaseByPhoneNumber(phone);
	}
	
	public Lease findLeaseByToolID(String id) {
		return LeaseContainer.getInstance().findLeaseByToolID(id);
	}
	
	public void finishLease() {
		LeaseContainer.getInstance().finishLease(this.lease);
		this.lease = null;
		
	}
	
	
}
