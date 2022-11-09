/**
 * ShoppingCart.java is an implementation of the ShoppingCartADT
 * @author Jared Rosenberger
 * @version 11/09/22
 * ShoppingCart.java
 * Fall 2022
 */
public class ShoppingCart implements ShoppingCartInterface {
	//Instance Variables
	private Integer size;//the current number of Items in the cart
	private Double totalPrice;//the current cost of everything in the cart
	private ArrayBag<Item> myBag;//the ArrayBag object that will hold the Items in the ShoppingCart
	
	//Constructors
	/**
	 * The no argument constructor initializes a ShoppingCart's instance variables
	 */
	public ShoppingCart() {
		this(25);
	}//end constructor
	
	/**
	 * The 1 argument constructor allows the user to set the capacity of the ShoppingCart
	 * @param bagSize the number of items that the ShoppingCart and ArrayBag will hold
	 */
	public ShoppingCart(int bagSize) {
		myBag = new ArrayBag<Item>(bagSize);
		size = 0;
		totalPrice = 0.00;
	}//end constructor
	
	//Accessors and Mutators
	/**
	 * @return the number of items currently in the car
	 */
	public Integer getSize() {
		return size;
	}//end getSize
	
	/**
	 * @return the current totalPrice cost of the cart
	 */
	public Double getTotal() {
		return totalPrice;
	}//end gettotalPrice
	
	
	//Other Class Methods
	/**
	 * addItem() allows the user to add items to the ShoppingCart
	 * @param item the Item being added to the shopping cart as passed into addItem()
	 */
	public Boolean addItem(Item item) {
		Boolean result = myBag.add(item);
		if(result) {
			size++;
			totalPrice += item.getPrice();
		}
		return result;
	}//end addItem
	
	/**
	 * isEmpty() returns true if the shopping cart is empty and false if it a(n) item(s) in it
	 * @return a boolean representation of the number of items in the cart
	 */
	public Boolean isEmpty() {
		return myBag.isEmpty();
	}//end isEmpty
	
	/**
	 * checkFrequency() allows the user to see how many times a specific Item has been added to the cart
	 * @param item the item we're checking the frequency of, as passed into checkFrequency()
	 * @return the number of times a specific item is in the cart (count duplicates)
	 */
	public Integer checkFrequency(Item item) {
		return myBag.getFrequencyOf(item);
	}//end checkFrequency
	
	/**
	 * removeItem() removes the previously added item from the cart
	 */
	public Item removeItem() {
		Item temp = myBag.remove();
		totalPrice -= temp.getPrice();
		size--;
		return temp;
	}//end removeItem
	
	/**
	 * removeItem(Item item) removes the given item from the cart
	 * @param item the item to be removed from the cart
	 */
	public Boolean removeItem(Item item) {
		Boolean result = myBag.remove(item);
		if(result) {
			totalPrice -= item.getPrice();
			size--;
		}
		return result;
	}//end removeItem
	
	/**
	 * emptyCart() removes all items from the ShoppingCart object
	 */
	public void emptyCart() {
		myBag.clear();
		totalPrice = 0.00;
		size = 0;
	}//end emptyCart
	
	/**
	 * listItems returns a list of everything currently in the cart
	 * @return a string list of everything in the cart
	 */
	public String listItems() {
		if(isEmpty())
			return "Your cart is currently empty.";
		Object[] copyArray = myBag.toArray();
		String list = "Your cart has " + size + " items:";
		for(Object i : copyArray)
			list = list + "\n" + ((Item) i).getName();
		return list;
	}//end listItems
	
	/**
	 * listItemtotalPrice() returns a list of everything currently in the cart, each item's cost,
	 * and the totalPrice cost of the car
	 * @return a string list of each item, it's cost, and the totalPrice cost of the cart
	 */
	public String listItemTotal() {
		if(isEmpty())
			return "Your cart is currently empty.";
		Object[] copyArray = myBag.toArray();
		String list = "Your cart has " + size + " items:";
		for(Object i : copyArray)
			list = list + "\n" + ((Item) i).getName() + "\t$" + String.format("%.2f",((Item) i).getPrice());
		list += "\nTotal:\t" + String.format("$%.2f", getTotal());
		return list;
	}//end listItemtotalPrice
	
}//end ShoppingCart