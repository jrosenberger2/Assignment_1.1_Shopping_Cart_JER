/**
 * ShoppingCarInterface.java describes the operations of a shopping cart of objects
 * @author Jared Rosenberger
 * @version 11/09/22
 * ShoppingCartInterface.java
 * Fall 2022
 */
public interface ShoppingCartInterface {	
	//Accessors and Mutators
	/**
	 * @return the number of items currently in the car
	 */
	public Integer getSize();
	/**
	 * @return the current total cost of the cart
	 */
	public Double getTotal();
	
	//Other Class Methods
	/**
	 * addItem() allows the user to add items to the ShoppingCart
	 * @param item the Item being added to the shopping cart as passed into addItem()
	 */
	public Boolean addItem(Item item);
	/**
	 * isEmpty() returns true if the shopping cart is empty and false if it a(n) item(s) in it
	 * @return a boolean representation of the number of items in the cart
	 */
	public Boolean isEmpty();
	/**
	 * checkFrequency() allows the user to see how many times a specific Item has been added to the cart
	 * @param item the item we're checking the frequency of, as passed into checkFrequency()
	 * @return the number of times a specific item is in the cart (count duplicates)
	 */
	public Integer checkFrequency(Item item);
	/**
	 * removeItem() removes the previously added item from the cart
	 */
	public Item removeItem();
	/**
	 * removeItem(ItemInterface item) removes the given item from the cart
	 * @param item the item to be removed from the cart
	 */
	public Boolean removeItem(Item item);
	/**
	 * emptyCart() removes all items from the ShoppingCart object
	 */
	public void emptyCart();
	/**
	 * listItems returns a list of everything currently in the cart
	 * @return a string list of everything in the cart
	 */
	public String listItems();
	/**
	 * listItemTotal() returns a list of everything currently in the cart, each item's cost,
	 	* and the total cost of the car
	 * @return a string list of each item, it's cost, and the total cost of the cart
	 */
	public String listItemTotal();
}//end ShoppingCartInterface.java