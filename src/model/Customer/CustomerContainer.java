package model.Customer;

import java.util.HashMap;


/**@author Lasse <br>
 * Purpose of CustomerContainer is to store information about BusinessCustomer. <br>
 * Has methods that allows for the Container find Customers by cvr.<br>
 * Also used a hashMap to store objects for BusinessCustomers. 
 */
public class CustomerContainer {
	private static CustomerContainer instance;	
	private HashMap<String, BusinessCustomer> businessCustomers;
	private HashMap<String, PrivateCustomer> privateCustomers;


	/**
	 * Created private CustomerContainer constructor. adds a collection of businessCustomers in the "new HashMap"
	 */
	private CustomerContainer() {
		businessCustomers = new HashMap<>();
		privateCustomers = new HashMap<>();
	}
	
	public static CustomerContainer getInstance() {
		if(instance == null) {
			instance = new CustomerContainer();
		}
		return instance;
	}

	/**Returns found customer
	 * @param cvr
	 * @return
	 */
	public BusinessCustomer findCustomerByCVR(String cvr) {
		if (businessCustomers.containsKey(cvr)) {
			BusinessCustomer foundCustomer = businessCustomers.get(cvr);
			return foundCustomer;
		}
		return null;
	}
	
	public PrivateCustomer findPrivateCustomerByPhone(String phone) {
		if (privateCustomers.containsKey(phone)) {
			PrivateCustomer foundCustomer = privateCustomers.get(phone);
			return foundCustomer;
		}
		return null;
	}
	
	/**Adds customer to HashMap
	 * 
	 * @param customerToAdd
	 */
	public void addCustomer(BusinessCustomer customerToAdd) {
		String key = customerToAdd.getCVR();
		businessCustomers.put(key, customerToAdd);
	}
	
	public void addPrivateCustomer(PrivateCustomer customerToAdd) {
		String key = customerToAdd.getPhone();
		privateCustomers.put(key, customerToAdd);
	}
	
	public HashMap<String, BusinessCustomer> getCustomers(){
		return this.businessCustomers;
	}
	
	public HashMap<String, PrivateCustomer> getPrivateCustomers(){
		return this.privateCustomers;
	}
}