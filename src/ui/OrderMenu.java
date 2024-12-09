package ui;

import controller.OrderController;

public class OrderMenu {
	
	OrderUI orderUI;
	
	public OrderMenu() {
		orderUI = new OrderUI();
	}
	
	public void start() {
		boolean running = true;
		while (running) {
			int choice = writeOrderMenu();
			if (choice == 1) {
				orderUI.start();
			}
			
			else {
				running = false;
			}
		}
	}
	
	private int writeOrderMenu() {
		//Creates a keyboard object to read input
		TextOptions menu = new TextOptions("\n ***** OrderMenu *****", "Tilbage");
		menu.addOption("Opret Ordre");
		
		//TODO if you need more menu items they have to go here
		int choice = menu.prompt();
		
		return choice;
	}
	
	
}