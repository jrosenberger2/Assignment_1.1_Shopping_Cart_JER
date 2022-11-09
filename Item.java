/**
 * Item.java is an implementation of the ItemADT
 * @author Jared Rosenberger
 * @version 11/09/22
 * Item.java
 * Fall 2022
 */
public class Item implements ItemInterface {
	//Instance Variables
	private Double price;//the price/value of the current Item
	private String name;//the name of the current Item
	private String department;//the department/category of the current Item
	
	//Constructors
	/**
	 * The no argument constructor initializes the Item's instance variables
	 */
	public Item() {
		this(0.0, "");
	}//end constructor
	
	/**
	 * The 2 argument constructor allows the user to create an Item and only set it's price and name
	 * @param price the value to set the price variable to
	 * @param name the value to set the name variable to
	 */
	public Item(Double price, String name) {
		this(price, name, "");
	}//end constructor
	
	/**
	 * The 3 argument constructor allows the user to create an Item and set all three of it's insance variables
	 * @param price the value to set the price variable to
	 * @param name the value to set the name variable to
	 * @param department the value to set the department variable to
	 */
	public Item(Double price, String name, String department) {
		this.price = price;
		this.name = name;
		this.department = department;
	}//end constructor
	
	//Accessors and Mutators
	/**		
	 * @param price the value of price as passed into setPrice()
	 */
	public void setPrice(Double price) {
		this.price = price;
	}//end setPrice
	
	/**
	 * @return the price of the current Item
	 */
	public Double getPrice() {
		return price;
	}//end getPrice
	
	/**  
	 * @param name the value of name as passed into SetName()
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	/**		  
	 * @return the name of the current Item
	 */
	public String getName() {
		return name;
	}//end getName
	
	/**
	 * @param department the value of department as passed into setDepartment()
	 */
	public void setDepartment(String department) {
		this.department = department;	
	}//end setDepartment
	
	/**
	 * @return the department of the current Item
	 */
	public String getDepartment() {
		return department;
	}//end getDepartment
	
	/**
	 * toString prints the name and cost of an Item when called
	 */
	public String toString() {
		return getName() + " cost " + String.format("%.2f", getPrice());
	}//end toString
}//end Item