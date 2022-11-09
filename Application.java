/**
 * Application.java tests the methods and functionality of ShoppingCart.java
 * @author Jared Rosenberger
 * @version 11/09/22
 * Application.java
 * Fall 2022
 */
public class Application {

	public static void main(String[] args) {
		System.out.println("Running...\n");
		
		//Initial Method tests
		ShoppingCart myCart = new ShoppingCart();
		Item bananas = new Item(5.30, "Bananas", "Grocery");
		
		System.out.println("getSize() output:");
		System.out.println(myCart.getSize());
		
		System.out.println("getTotal() output:");
		System.out.printf("%.2f", myCart.getTotal());
		
		System.out.println("\naddItem() output:");
		System.out.println(myCart.addItem(bananas));
		
		System.out.println("isEmpty() output:");
		System.out.println(myCart.isEmpty());
		
		System.out.println("checkFrequency() output:");
		System.out.println(myCart.checkFrequency(bananas));
		
		System.out.println("removeItem() output:");
		System.out.println(myCart.removeItem());
		
		System.out.println("removeItem(Item) outpt:");
		System.out.println(myCart.removeItem(bananas));
		
		System.out.println("listItems() output:");
		System.out.println(myCart.listItems());
		
		System.out.println("listItemTotal() output:");
		System.out.println(myCart.listItemTotal());
		
		//line break
		System.out.println("\n");
		
		//More items to add to the cart
		Item bread = new Item();
		bread.setName("Bread");
		bread.setPrice(2.50);
		Item beef = new Item (5.00, "Beef");
		Item chicken = new Item(9.99, "Chicken");
		Item chips = new Item(10.79, "Chips");
		
		//adding and removing items to/from cart
		System.out.println("\nAdd bananas to cart: " + myCart.addItem(bananas));
		System.out.println("Add bread to cart: " + myCart.addItem(bread));
		System.out.println("Add beef to cart: " + myCart.addItem(beef));
		
		System.out.println("\nThere are " + myCart.getSize() + " Items in the Cart");
		System.out.println("The cart costs " + String.format("%.2f", myCart.getTotal()));
		
		System.out.println("Add chicken to cart: " + myCart.addItem(chicken));
		System.out.println("Add chips to cart: " + myCart.addItem(chips));
		System.out.println("\n"+ myCart.listItems());
		
		System.out.println("\nRemove chicken from the cart: " + myCart.removeItem(chicken));
		System.out.println("\n" + myCart.listItemTotal());
		
		System.out.println("Remove Item: " + myCart.removeItem());
		
		System.out.println("\n" + myCart.listItemTotal());
		myCart.emptyCart();
		System.out.println("\nLets start over with some coupons");
		System.out.println(myCart.listItems());
		
		chicken.setPrice(5.67);
		System.out.println("\nAdd chicken to cart: " + myCart.addItem(chicken));
		bananas.setPrice(2.49);
		System.out.println("Add bananas to cart: " + myCart.addItem(bananas));
		System.out.println("Add bread to cart: " + myCart.addItem(bread));
		
		Item coffee = new Item(3.11, "Coffee");
		System.out.println("Add coffee to cart: " + myCart.addItem(coffee));
		
		System.out.println("\n" + myCart.listItemTotal());
		System.out.println("Much Better!");
		System.out.println("\n...End Of Main");
	}//end main
}//end Application.java