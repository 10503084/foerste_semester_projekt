package ui;

import controller.OrderController;

public class OrderUI {
	
	OrderController orderController;
	
	public OrderUI() {
		orderController = new OrderController();
		createOrder();
		start();
	}
	
	public void start() {
		boolean running = true;
		while (running) {
			int choice = writeOrderUI();
			if (choice == 1) {
				int quantity = TextInput.inputInt("Indtast Antal");
				String barcode = TextInput.inputString("Scan Stregkode");
				
				addProductToOrder(quantity, barcode);
				
				System.out.println(orderController.getOrder().getPrice());
				start();
			}
			if (choice == 2) {
				String cvr = TextInput.inputString("Indtast CVR");
				
				addCustomerToOrder(cvr);
				
				System.out.println(orderController.getOrder().getCustomer().getCVR());
				start();
			}
			if (choice == 3) {
				
			}
			if (choice == 4) {
				
			}
			
			else {
				running = false;
			}
		}
	}
	
	private int writeOrderUI() {
		//Creates a keyboard object to read input
		TextOptions menu = new TextOptions("\n ***** OrderMenu *****", "Tilbage");
		menu.addOption("Tilføj Produkt");
		menu.addOption("Tilføj Kunde");
		menu.addOption("Betal Ordre");
		menu.addOption("Afslut Ordre");
		
		//TODO if you need more menu items they have to go here
		int choice = menu.prompt();
		
		return choice;
	}
	
	
	
	
	private void createOrder() {
		
		orderController.makeNewOrder();
		
	}
	
	private void addProductToOrder(int quantity, String barcode) {
		
		orderController.addProductToOrder(barcode, quantity);
	}
	
	private void addCustomerToOrder(String cvr) {
		
		orderController.addCustomerToOrder(cvr);
	}
	
	private void makePayment(double amount) {
//		boolean paid = false;
//		if (amount >= orderController.getOrder().getPrice()) {
//			paid = true;
//		}
//		
//		orderController.makePayment(paid);
	}
}
